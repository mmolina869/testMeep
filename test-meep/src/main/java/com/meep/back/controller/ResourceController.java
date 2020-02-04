package com.meep.back.controller;

import org.apache.logging.log4j.message.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.async.DeferredResult;

import com.meep.back.dto.Resource;
import com.meep.back.services.ResourceBackService;
import com.meep.external.services.ResourceService;

import io.reactivex.Observable;

@Controller
@RequestMapping("/prueba/meep")
public class ResourceController {
	
	@Autowired
	private ResourceBackService resourceService;


	//@GetMapping("/get-resources")
	
	@RequestMapping(value = "/get-resources")
	public Observable<String> getResources(@RequestParam String zone, @RequestParam String lowerLeftLatLon,
			@RequestParam String upperRightLatLon, @RequestParam String companyZoneIds) {

		Observable<String> response = resourceService.getResourceAvailable(zone,lowerLeftLatLon,upperRightLatLon,companyZoneIds);
		return response;

	}

}
