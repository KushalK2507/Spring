package com.kushal.SpringCore.propertyPlaceHolder;

public class MyDao {

	private String dbServer;

	MyDao(String dbServer) {
		this.dbServer = dbServer;
	}

	@Override
	public String toString() {
		return "MyDao [dbServer=" + dbServer + "]";
	}

	
}
