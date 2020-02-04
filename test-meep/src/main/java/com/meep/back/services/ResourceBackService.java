package com.meep.back.services;

import io.reactivex.Observable;

public interface ResourceBackService {
	
	public Observable<String> getResourceAvailable(String zone,String lowerLeftLatLon,
			String upperRightLatLon,  String companyZoneIds);
	
}
