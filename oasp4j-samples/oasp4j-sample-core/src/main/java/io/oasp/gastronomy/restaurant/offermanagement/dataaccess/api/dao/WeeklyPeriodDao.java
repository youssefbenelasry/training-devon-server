package io.oasp.gastronomy.restaurant.offermanagement.dataaccess.api.dao;

import io.oasp.gastronomy.restaurant.general.dataaccess.api.dao.ApplicationDao;
import io.oasp.gastronomy.restaurant.offermanagement.dataaccess.api.WeeklyPeriodEntity;
import io.oasp.gastronomy.restaurant.offermanagement.logic.api.to.WeeklyPeriodSearchCriteriaTo;
import io.oasp.module.jpa.common.api.to.PaginatedListTo;

/**
 * Data access interface for WeeklyPeriod entities
 */
public interface WeeklyPeriodDao extends ApplicationDao<WeeklyPeriodEntity> {

  /**
   * Finds the {@link WeeklyPeriodEntity weeklyperiods} matching the given {@link WeeklyPeriodSearchCriteriaTo}.
   *
   * @param criteria is the {@link WeeklyPeriodSearchCriteriaTo}.
   * @return the {@link PaginatedListTo} with the matching {@link WeeklyPeriodEntity} objects.
   */
  PaginatedListTo<WeeklyPeriodEntity> findWeeklyPeriods(WeeklyPeriodSearchCriteriaTo criteria);

}
