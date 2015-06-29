package io.oasp.gastronomy.restaurant.offermanagement.dataaccess.api;

import io.oasp.gastronomy.restaurant.general.common.api.datatype.Money;
import io.oasp.gastronomy.restaurant.general.dataaccess.api.ApplicationPersistenceEntity;
import io.oasp.gastronomy.restaurant.offermanagement.common.api.Offer;
import io.oasp.gastronomy.restaurant.offermanagement.common.api.Special;
import io.oasp.gastronomy.restaurant.offermanagement.common.api.WeeklyPeriod;

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

  private WeeklyPeriod activePeriod;

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
   * Returns the {@link WeeklyPeriodEmbeddable active period} this special applies for.
   *
   * @return activePeriod the {@link WeeklyPeriodEmbeddable active period} this special applies for.
   */
  public WeeklyPeriod getActivePeriod() {

    return this.activePeriod;
  }

  /**
   * Sets the {@link WeeklyPeriodEmbeddable active period} this special applies for.
   *
   * @param activePeriod the {@link WeeklyPeriodEmbeddable active period} this special applies for.
   */
  public void setActivePeriod(WeeklyPeriod activePeriod) {

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
   * {@inheritDoc}
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
   * {@inheritDoc}
   */
  @Override
  public void setOfferId(Long offerId) {

    if (offerId == null) {
      this.offer = null;
    } else {
      OfferEntity offerEntity = new OfferEntity();
      offerEntity.setId(offerId);
      this.offer = offerEntity;
    }
  }

}
