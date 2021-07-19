package hu.webuni.airport.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hu.webuni.airport.config.AirportConfigProperties;
import hu.webuni.airport.config.AirportConfigProperties.Default;

@Service
public class DefaultDiscountService implements DiscountService {
	
	@Autowired
	AirportConfigProperties config;
	
	@Override
	public int getDiscountPercent(int totalPrice) {
		return config.getDiscount().getDef().getPercent();
	}

}
