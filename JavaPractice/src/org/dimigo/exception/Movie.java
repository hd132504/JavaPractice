package org.dimigo.exception;

public class Movie {
	private String title;
	private int limitAge;
	
	public Movie(String title, int limitAge) {
		super();
		this.title = title;
		this.limitAge = limitAge;
	}
	
	public String getTitle(){
		return title;
	}
	
	public int getlimitAge(){
		return limitAge;
	}
}
