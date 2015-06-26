package io.oasp.gastronomy.restaurant.offermanagement.dataaccess.api;

import io.oasp.gastronomy.restaurant.general.dataaccess.api.ApplicationPersistenceEntity;
import io.oasp.gastronomy.restaurant.offermanagement.common.api.WeeklyPeriod;
import io.oasp.gastronomy.restaurant.offermanagement.common.api.datatype.DayOfWeek;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

import org.hibernate.envers.Audited;

/**
 * Weekly period describing a starting and an ending point. Each is defined as a fixed hour (24h-format) at a specific
 * day of week.
 *
 * @author mbrunnli
 */
@Entity(name = "WeeklyPeriod")
@Table(name = "WeeklyPeriod")
@Audited
public class WeeklyPeriodEntity extends ApplicationPersistenceEntity implements WeeklyPeriod {

  private DayOfWeek startingDay;

  private int startingHour;

  private DayOfWeek endingDay;

  private int endingHour;

  private static final long serialVersionUID = 1L;

  /**
   * Returns the {@link DayOfWeek} the period starts.
   *
   * @return startingDay the {@link DayOfWeek} the period starts.
   */
  public DayOfWeek getStartingDay() {

    return this.startingDay;
  }

  /**
   * Sets the {@link DayOfWeek} the period starts.
   *
   * @param startingDay the {@link DayOfWeek} the period starts.
   */
  public void setStartingDay(DayOfWeek startingDay) {

    this.startingDay = startingDay;
  }

  /**
   * Returns the hour (in 24h-format) the period starts.
   *
   * @return startingHour the hour (in 24h-format) the period starts.
   */
  @Max(value = 24)
  @Min(value = 0)
  public int getStartingHour() {

    return this.startingHour;
  }

  /**
   * Sets the hour (in 24h-format) the period starts.
   *
   * @param startingHour the hour (in 24h-format) the period starts.
   */
  public void setStartingHour(int startingHour) {

    this.startingHour = startingHour;
  }

  /**
   * Returns the {@link DayOfWeek} the period ends.
   *
   * @return endingDay the {@link DayOfWeek} the period ends.
   */
  public DayOfWeek getEndingDay() {

    return this.endingDay;
  }

  /**
   * Sets the {@link DayOfWeek} the period ends.
   *
   * @param endingDay the {@link DayOfWeek} the period ends.
   */
  public void setEndingDay(DayOfWeek endingDay) {

    this.endingDay = endingDay;
  }

  /**
   * Returns the hour (in 24h-format) the period ends.
   *
   * @return endingHour the hour (in 24h-format) the period ends.
   */
  @Max(value = 24)
  @Min(value = 0)
  public int getEndingHour() {

    return this.endingHour;
  }

  /**
   * Returns the hour (in 24h-format) the period ends.
   *
   * @param endingHour the hour (in 24h-format) the period ends.
   */
  public void setEndingHour(int endingHour) {

    this.endingHour = endingHour;
  }

}
