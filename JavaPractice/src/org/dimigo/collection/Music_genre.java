package org.dimigo.collection;

public class Music_genre {
	private String title;
	private String singer;
	
	public Music_genre(String title, String singer) {
		super();
		this.title = title;
		this.singer = singer;
	}
	
	public String getTitle(){
		return title;
	}
	
	public void setTitle(String title){
		this.title = title;
	}
	
	public String getSinger(){
		return singer;
	}
	
	public void setSinger(String title){
		this.singer = singer;
	}

	@Override
	public String toString() {
		return "Music [title=" + title + ", singer=" + singer + "]";
	}
}
