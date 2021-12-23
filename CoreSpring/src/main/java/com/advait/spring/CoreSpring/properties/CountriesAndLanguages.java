package com.advait.spring.CoreSpring.properties;

import java.util.Properties;

public class CountriesAndLanguages {
private Properties countryAndLangs;

@Override
public String toString() {
	return "CountriesAndLanguages [countryAndLangs=" + countryAndLangs + "]";
}

public Properties getCountryAndLangs() {
	return countryAndLangs;
}

public void setCountryAndLangs(Properties countryAndLangs) {
	this.countryAndLangs = countryAndLangs;
}
}
