package com.meep.external.services;

import java.util.concurrent.TimeUnit;

import org.springframework.stereotype.Service;

import io.reactivex.Observable;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

@Service
public class ResourceService {

	private IResorceService iResorceService;
	
	public Observable<String> getResource(String zone,String lowerLeftLatLon,
			String upperRightLatLon,  String companyZoneIds) {
		
		Retrofit retrofit = new Retrofit.Builder()
				.baseUrl("https://apidev.meep.me/tripplan/api/v1")
				.addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .build();
	
		iResorceService = retrofit.create(IResorceService.class);
		return getRandomResorce(zone,lowerLeftLatLon,upperRightLatLon,companyZoneIds);
	}
	
	public Observable<String> getRandomResorce(String zone,String lowerLeftLatLon,
			String upperRightLatLon,  String companyZoneIds){
		Observable<String> response = iResorceService.getAPI(zone,lowerLeftLatLon,upperRightLatLon,companyZoneIds).map(rspuesta -> rspuesta.getId())
				.throttleLast(18000, TimeUnit.SECONDS);
		return response;
	}
	

}
