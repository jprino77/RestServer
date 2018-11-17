package com.webService.openWeatherMap.response;

import java.util.List;

public class Clima {

	private List<Weather> weather;

	private Main main;

	private Long dt;
	
	private String name;
	
	private String dt_txt;


	public List<Weather> getWeather() {
		return weather;
	}

	public void setWeather(List<Weather> weather) {
		this.weather = weather;
	}

	public Main getMain() {
		return main;
	}

	public void setMain(Main main) {
		this.main = main;
	}

	public Long getDt() {
		return dt;
	}

	public void setDt(Long dt) {
		this.dt = dt;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDt_txt() {
		//El api devuelve un String con formato timestamp solo me interesa la fecha
		return dt_txt.substring(0,10);
	}
	
	public void setDt_txt(String dt_txt) {
		this.dt_txt = dt_txt;
	}

}
