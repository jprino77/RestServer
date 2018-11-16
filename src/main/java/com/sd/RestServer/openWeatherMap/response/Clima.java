package com.sd.RestServer.openWeatherMap.response;

import java.util.List;

public class Clima {

	private List<Weather> weather;

	private Main main;

	private Long dt;


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

}
