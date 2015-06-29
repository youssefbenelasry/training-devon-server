package io.oasp.gastronomy.restaurant.offermanagement.logic.api.to;

import io.oasp.gastronomy.restaurant.general.common.api.datatype.Money;
import io.oasp.gastronomy.restaurant.general.common.api.to.AbstractEto;
import io.oasp.gastronomy.restaurant.offermanagement.common.api.Special;

/**
 * Entity transport object of Special
 */
public class SpecialEto extends AbstractEto implements Special {

  private static final long serialVersionUID = 1L;

  private Long offerId;

  private Long activePeriodId;

  private Money specialPrice;

  /**
   * {@inheritDoc}
   */
  @Override
  public Long getOfferId() {

    return this.offerId;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public void setOfferId(Long offerId) {

    this.offerId = offerId;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public Money getSpecialPrice() {

    return this.specialPrice;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public void setSpecialPrice(Money specialPrice) {

    this.specialPrice = specialPrice;
  }

  @Override
  public int hashCode() {

    final int prime = 31;
    int result = super.hashCode();
    result = prime * result + ((this.offerId == null) ? 0 : this.offerId.hashCode());
    result = prime * result + ((this.activePeriodId == null) ? 0 : this.activePeriodId.hashCode());
    result = prime * result + ((this.specialPrice == null) ? 0 : this.specialPrice.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj) {

    if (this == obj) {
      return true;
    }
    if (obj == null) {
      return false;
    }
    // class check will be done by super type EntityTo!
    if (!super.equals(obj)) {
      return false;
    }
    SpecialEto other = (SpecialEto) obj;
    if (this.offerId == null) {
      if (other.offerId != null) {
        return false;
      }
    } else if (!this.offerId.equals(other.offerId)) {
      return false;
    }
    if (this.activePeriodId == null) {
      if (other.activePeriodId != null) {
        return false;
      }
    } else if (!this.activePeriodId.equals(other.activePeriodId)) {
      return false;
    }
    if (this.specialPrice == null) {
      if (other.specialPrice != null) {
        return false;
      }
    } else if (!this.specialPrice.equals(other.specialPrice)) {
      return false;
    }
    return true;
  }
}
