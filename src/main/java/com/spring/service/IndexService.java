package com.spring.service;

import org.slf4j.ext.XLogger;
import org.slf4j.ext.XLoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

/**
 * @author ajay.kg created on 01/10/16.
 */
@Component
public class IndexService {

	private static final XLogger logger = XLoggerFactory.getXLogger(IndexService.class);

	@Value("${com.spring.service.app.name}")
	private String app;

	@PostConstruct
	public void init() {

	}

	public Object getAppInfo() {
		Map<String, String> appInfo = new HashMap<>();
		appInfo.put("name", app);
		return appInfo;
	}
}
