package io.oasp.gastronomy.restaurant.offermanagement.common.api;

import io.oasp.gastronomy.restaurant.general.common.api.ApplicationEntity;
import io.oasp.gastronomy.restaurant.offermanagement.common.api.datatype.DayOfWeek;

public interface WeeklyPeriod extends ApplicationEntity {

  DayOfWeek getStartingDay();

  void setStartingDay(DayOfWeek startingDay);

  int getStartingHour();

  void setStartingHour(int startingHour);

  DayOfWeek getEndingDay();

  void setEndingDay(DayOfWeek endingDay);

  int getEndingHour();

  void setEndingHour(int endingHour);

}
