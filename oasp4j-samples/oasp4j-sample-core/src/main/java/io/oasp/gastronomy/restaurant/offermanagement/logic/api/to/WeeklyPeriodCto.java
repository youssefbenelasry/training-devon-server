package io.oasp.gastronomy.restaurant.offermanagement.logic.api.to;

import io.oasp.gastronomy.restaurant.general.common.api.to.AbstractCto;

/**
 * Composite transport object of WeeklyPeriod
 */
public class WeeklyPeriodCto extends AbstractCto {

  private static final long serialVersionUID = 1L;

  private WeeklyPeriodEto weeklyPeriod;

  public WeeklyPeriodEto getWeeklyPeriod() {

    return weeklyPeriod;
  }

  public void setWeeklyPeriod(WeeklyPeriodEto weeklyPeriod) {

    this.weeklyPeriod = weeklyPeriod;
  }

}
