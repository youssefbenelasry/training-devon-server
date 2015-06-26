package io.oasp.gastronomy.restaurant.offermanagement.dataaccess.impl.dao;

import io.oasp.gastronomy.restaurant.general.dataaccess.base.dao.ApplicationDaoImpl;
import io.oasp.gastronomy.restaurant.offermanagement.common.api.datatype.DayOfWeek;
import io.oasp.gastronomy.restaurant.offermanagement.dataaccess.api.WeeklyPeriodEntity;
import io.oasp.gastronomy.restaurant.offermanagement.dataaccess.api.dao.WeeklyPeriodDao;
import io.oasp.gastronomy.restaurant.offermanagement.logic.api.to.WeeklyPeriodSearchCriteriaTo;
import io.oasp.module.jpa.common.api.to.PaginatedListTo;

import javax.inject.Named;

import com.mysema.query.alias.Alias;
import com.mysema.query.jpa.impl.JPAQuery;
import com.mysema.query.types.path.EntityPathBase;

/**
 * This is the implementation of {@link WeeklyPeriodDao}.
 */
@Named
public class WeeklyPeriodDaoImpl extends ApplicationDaoImpl<WeeklyPeriodEntity> implements WeeklyPeriodDao {

  /**
   * The constructor.
   */
  public WeeklyPeriodDaoImpl() {

    super();
  }

  @Override
  public Class<WeeklyPeriodEntity> getEntityClass() {

    return WeeklyPeriodEntity.class;
  }

  @Override
  public PaginatedListTo<WeeklyPeriodEntity> findWeeklyPeriods(WeeklyPeriodSearchCriteriaTo criteria) {

    WeeklyPeriodEntity weeklyperiod = Alias.alias(WeeklyPeriodEntity.class);
    EntityPathBase<WeeklyPeriodEntity> alias = Alias.$(weeklyperiod);
    JPAQuery query = new JPAQuery(getEntityManager()).from(alias);

    DayOfWeek startingDay = criteria.getStartingDay();
    if (startingDay != null) {
      query.where(Alias.$(weeklyperiod.getStartingDay()).eq(startingDay));
    }

    int startingHour = criteria.getStartingHour();
    query.where(Alias.$(weeklyperiod.getStartingHour()).eq(startingHour));

    DayOfWeek endingDay = criteria.getEndingDay();
    if (endingDay != null) {
      query.where(Alias.$(weeklyperiod.getEndingDay()).eq(endingDay));
    }

    int endingHour = criteria.getEndingHour();
    query.where(Alias.$(weeklyperiod.getEndingHour()).eq(endingHour));

    return findPaginated(criteria, query, alias);
  }

}
