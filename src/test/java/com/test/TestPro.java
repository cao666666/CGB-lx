package com.test;

import java.util.Map;

import org.apache.commons.lang3.ArrayUtils;

public class TestPro {
	public static void main(String[] args) {
		String[][] conutries={{"United States","New York"},{"United Kongdom","Lon"},{"Netherland","Amsterdam"}};
		Map<Object, Object> countryCapitals=ArrayUtils.toMap(conutries);
		System.out.println(countryCapitals.get("United States"));
	}

}
