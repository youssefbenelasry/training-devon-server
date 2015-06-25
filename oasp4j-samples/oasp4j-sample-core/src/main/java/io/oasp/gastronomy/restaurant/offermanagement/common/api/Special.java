package io.oasp.gastronomy.restaurant.offermanagement.common.api;

import io.oasp.gastronomy.restaurant.general.common.api.ApplicationEntity;
import io.oasp.gastronomy.restaurant.general.common.api.datatype.Money;
import io.oasp.gastronomy.restaurant.offermanagement.dataaccess.api.OfferEntity;
import io.oasp.gastronomy.restaurant.offermanagement.dataaccess.api.WeeklyPeriodEntity;

public interface Special extends ApplicationEntity {

  OfferEntity getOffer();

  void setOffer(OfferEntity offer);

  WeeklyPeriodEntity getActivePeriod();

  void setActivePeriod(WeeklyPeriodEntity activePeriod);

  Money getSpecialPrice();

  void setSpecialPrice(Money specialPrice);

}
