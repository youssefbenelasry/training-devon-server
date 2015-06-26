package io.oasp.gastronomy.restaurant.offermanagement.dataaccess.api;

import io.oasp.gastronomy.restaurant.general.common.api.datatype.Money;
import io.oasp.gastronomy.restaurant.general.dataaccess.api.ApplicationPersistenceEntity;
import io.oasp.gastronomy.restaurant.offermanagement.common.api.Offer;
import io.oasp.gastronomy.restaurant.offermanagement.common.api.Special;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.envers.Audited;

/**
 * The {@link ApplicationPersistenceEntity persistent entity} for a special.
 *
 * @author mbrunnli
 */
@Entity(name = "Special")
@Table(name = "Special")
@Audited
public class SpecialEntity extends ApplicationPersistenceEntity implements Special {

  private OfferEntity offer;

  private WeeklyPeriodEntity activePeriod;

  private Money specialPrice;

  private static final long serialVersionUID = 1L;

  /**
   * Returns the {@link Offer} this special applies for.
   *
   * @return offer {@link Offer} this special applies for.
   */
  public OfferEntity getOffer() {

    return this.offer;
  }

  /**
   * Sets the {@link Offer} this special applies for.
   *
   * @param offer the {@link Offer} this special applies for.
   */
  public void setOffer(OfferEntity offer) {

    this.offer = offer;
  }

  /**
   * Returns the {@link WeeklyPeriodEntity active period} this special applies for.
   *
   * @return activePeriod the {@link WeeklyPeriodEntity active period} this special applies for.
   */
  public WeeklyPeriodEntity getActivePeriod() {

    return this.activePeriod;
  }

  /**
   * Sets the {@link WeeklyPeriodEntity active period} this special applies for.
   *
   * @param activePeriod the {@link WeeklyPeriodEntity active period} this special applies for.
   */
  public void setActivePeriod(WeeklyPeriodEntity activePeriod) {

    this.activePeriod = activePeriod;
  }

  /**
   * Returns the new {@link Money special price} for the {@link Offer}.
   *
   * @return specialPrice the new {@link Money special price} for the {@link Offer}.
   */
  public Money getSpecialPrice() {

    return this.specialPrice;
  }

  /**
   * Sets the new {@link Money special price} for the {@link Offer}.
   *
   * @param specialPrice the new {@link Money special price} for the {@link Offer}.
   */
  public void setSpecialPrice(Money specialPrice) {

    this.specialPrice = specialPrice;
  }

  /**
   * Returns the {@link Special}s ID.
   *
   * @return the {@link Special}s ID
   */
  @Override
  @Transient
  public Long getOfferId() {

    if (this.offer == null) {
      return null;
    }
    return this.offer.getId();
  }

  /**
   * Sets a new {@link Special} with the given ID.
   *
   * @param OfferId of the {@link Special} to be set
   */
  @Override
  public void setOfferId(Long OfferId) {

    if (OfferId == null) {
      this.offer = null;
    } else {
      OfferEntity offerEntity = new OfferEntity();
      offerEntity.setId(OfferId);
      this.offer = offerEntity;
    }
  }

  /**
   * Returns the {@link Special}s ID.
   *
   * @return the {@link Special}s ID
   */
  @Override
  @Transient
  public Long getActivePeriodId() {

    if (this.activePeriod == null) {
      return null;
    }
    return this.activePeriod.getId();
  }

  /**
   * Sets a new {@link Special} with the given ID.
   *
   * @param ActivePeriodId of the {@link Special} to be set
   */
  @Override
  public void setActivePeriodId(Long ActivePeriodId) {

    if (ActivePeriodId == null) {
      this.activePeriod = null;
    } else {
      WeeklyPeriodEntity weeklyPeriodEntity = new WeeklyPeriodEntity();
      weeklyPeriodEntity.setId(ActivePeriodId);
      this.activePeriod = weeklyPeriodEntity;
    }
  }

}
