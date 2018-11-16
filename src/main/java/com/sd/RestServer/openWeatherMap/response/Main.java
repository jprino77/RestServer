package com.sd.RestServer.openWeatherMap.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true) //Ignoro cualquier otro atributo que venga en el json
public class Main {
	
	private Float temp_min;
	
	private Float temp_max;

	public Float getTemp_min() {
		return temp_min;
	}

	public void setTemp_min(Float temp_min) {
		this.temp_min = temp_min;
	}

	public Float getTemp_max() {
		return temp_max;
	}

	public void setTemp_max(Float temp_max) {
		this.temp_max = temp_max;
	}
	
	

}
