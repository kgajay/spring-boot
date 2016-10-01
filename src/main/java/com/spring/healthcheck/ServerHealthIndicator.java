package com.spring.healthcheck;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

/**
 * @author ajay.kg created on 01/10/16.
 */
@Component
public class ServerHealthIndicator implements HealthIndicator {

	@Override
	public Health health() {
		return Health.up().build();
	}
}
