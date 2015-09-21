package org.dimigo.exception;

public class AgeCheckException extends Exception {
	public AgeCheckException(){
		
	}
	
	public AgeCheckException(Movie movie){
		super(movie.getTitle() + "은/는 " + movie.getlimitAge() + "세 관람가입니다.");
	}
}
