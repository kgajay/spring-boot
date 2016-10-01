package com.spring.controller;

import com.spring.bean.SampleResponse;
import com.spring.service.IndexService;
import org.slf4j.ext.XLogger;
import org.slf4j.ext.XLoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * @author ajay.kg created on 01/10/16.
 */
@RestController
@CrossOrigin
public class IndexController {

	private static final XLogger logger = XLoggerFactory.getXLogger(IndexController.class);

	@Autowired
	private IndexService indexService;

	@RequestMapping(path = "v1/index", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON)
	public Response index() {
		return Response.ok(indexService.getAppInfo()).build();
	}

	@RequestMapping(path = "v1/sample-bean", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON)
	public ResponseEntity<SampleResponse> getSampleBean() {
		SampleResponse response = new SampleResponse();
		response.setId(1);
		response.setMessage("all spring boot done");
		response.setStatusCode(200);
		return new ResponseEntity<SampleResponse>(response, HttpStatus.OK);
	}
}
