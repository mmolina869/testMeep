package com.meep.back.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import com.meep.external.services.ResourceService;

import io.reactivex.Observable;

@Service
public class ResourceBackServiceImpl implements ResourceBackService {
	
	//@Autowired
	private ResourceService resourceService;
	
	public Observable<String> getResourceAvailable(String zone,String lowerLeftLatLon,
			String upperRightLatLon,  String companyZoneIds) {
		
		Observable<String> obs = resourceService.getResource(zone,lowerLeftLatLon,upperRightLatLon,companyZoneIds);
		return obs;
		
	}

}
