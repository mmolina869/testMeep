package com.meep.external.services;

import com.meep.back.dto.Resource;

import io.reactivex.Observable;
import retrofit2.http.GET;

public interface IResorceService {

	@GET("/routers/{zone}/resources/{lowerLeftLatLon}/{upperRightLatLon}/{companyZoneIds}")
	public Observable<Resource> getAPI(String zone,String lowerLeftLatLon,
			String upperRightLatLon,  String companyZoneIds);
	
}
