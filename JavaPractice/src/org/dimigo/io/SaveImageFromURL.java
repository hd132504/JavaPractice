package org.dimigo.io;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;


public class SaveImageFromURL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String imageURL = "https://static.dimigo.in/img/logobeta.png";
		int result;
		try{
			URL url = new URL(imageURL);
			
			try(InputStream is = url.openStream();
				OutputStream os = new FileOutputStream("files/logo.png")){
				
				byte[] buf = new byte[100];
				
				while((result = is.read(buf)) != -1){
					os.write(buf, 0, result);
				}
				
				
			} catch(IOException e){
				e.printStackTrace();
			}
					
			
		} catch(MalformedURLException e){
			e.printStackTrace();
		}
	}
}
