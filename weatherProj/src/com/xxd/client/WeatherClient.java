package com.xxd.client;

import java.util.List;

import cn.com.webxml.ArrayOfString;
import cn.com.webxml.WeatherWS;
import cn.com.webxml.WeatherWSSoap;

public class WeatherClient {
	public static void main(String[] args) {
		WeatherWSSoap soap = new WeatherWS().getWeatherWSSoap();
		ArrayOfString aos = soap.getWeather("南昌", "");
		List<String> weathers = aos.getString();
		for (String weather : weathers) {
			System.out.println(weather);
		}
	}
}
