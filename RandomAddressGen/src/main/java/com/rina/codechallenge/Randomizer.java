package com.rina.codechallenge;

import java.util.Locale;

public class Randomizer {

	public static Locale getLocale() {
		return Locale.US;
	}
	
	public static Address getAddress(Locale locale) {
		Address address = new Address();
		address.setStreet(getStreet(locale));
		address.setHouse(getHouse(locale));
		address.setCity(getCity(locale));
		address.setCounty(getCounty(locale));
		address.setPostalCode(getPostalCode(locale));
		address.setState(getState(locale));
		address.setStateCode(getStateCode(locale));
		address.setCountry(getCountry(locale));
		address.setCountryCode(getCountryCode(locale));
		return address;
	}
	
	public static String getHouse(Locale locale) {
		return "532";
	}

	public static String getStreet(Locale locale) {
		return "Union St";
	}

	public static String getPostalCode(Locale locale) {
		return "789302";
	}

	public static String getCity(Locale locale) {
		return "San Diego";
	}

	public static String getState(Locale locale) {
		return "New York";
	}

	public static String getStateCode(Locale locale) {
		return "NY";
	}

	public static String getCounty(Locale locale) {
		return "Williamson County";
	}
	
	public static String getCountry(Locale locale) {
		return locale.getDisplayCountry();
	}

	public static String getCountryCode(Locale locale) {
		return locale.getISO3Country();
	}

}
