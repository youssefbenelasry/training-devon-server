package io.oasp.gastronomy.restaurant.offermanagement.common.api;

import io.oasp.gastronomy.restaurant.general.common.api.ApplicationEntity;
import io.oasp.gastronomy.restaurant.general.common.api.datatype.Money;

public interface Special extends ApplicationEntity {

  /**
   * Returns the {@link Special}s ID.
   *
   * @return the {@link Special}s ID
   */
  Long getOfferId();

  /**
   * Sets a new {@link Special} with the given ID.
   *
   * @param OfferId of the {@link Special} to be set
   */
  void setOfferId(Long OfferId);

  Money getSpecialPrice();

  void setSpecialPrice(Money specialPrice);

}
