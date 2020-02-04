package com.meep.back;

import java.util.concurrent.TimeUnit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.meep.external.services.ResourceService;

import io.reactivex.Observable;
import io.reactivex.schedulers.Schedulers;

@SpringBootApplication
public class TestMeepApplication {

	private static Logger LOG = LoggerFactory.getLogger(TestMeepApplication.class);

	//@Autowired
	//private ResourceService resourceService;

	public static void main(String[] args) {
		SpringApplication.run(TestMeepApplication.class, args);
	}
	
	/*public void execute(){
		LOG.info("start");
		Observable.interval(1800, TimeUnit.SECONDS, Schedulers.io()).observeOn(Schedulers.newThread())
				.map(tick -> resourceService.getRandomResorce()).doOnError(error -> LOG.info(error.toString())).retry()
				.subscribe(getObser -> getObser.subscribe(resouce -> LOG.info("response : ", resouce)));

		LOG.info("end ");
	}*/
}
