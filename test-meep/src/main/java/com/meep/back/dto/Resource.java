package com.meep.back.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Resource {
	
	private String id;
	private String name;
    private String x;
    private String y;
    private String scheduledArrival;
    private String locationType;
    private String companyZoneId;
    private String lat;
    private String lon;
	

}
