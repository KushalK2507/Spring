package com.kushal.SpringCore.properties;

import java.util.Properties;

public class Languages {

	private Properties countryAndLang;

	public Properties getCountryAndLang() {
		return countryAndLang;
	}

	public void setCountryAndLang(Properties countryAndLang) {
		this.countryAndLang = countryAndLang;
	}

	@Override
	public String toString() {
		return "Languages [countryAndLang=" + countryAndLang + "]";
	}

}
