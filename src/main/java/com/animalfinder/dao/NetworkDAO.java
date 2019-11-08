package com.animalfinder.dao;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.springframework.stereotype.Component;


@Component
public class NetworkDAO {

	
	/**
	 * 
	 * @param endpoint URL or other location
	 * @return the data we are using as one string
	 * @throws Exception
	 */
	 public String request(String endpoint) throws  Exception{
		 StringBuilder sb = new StringBuilder();
		
		 URL url = new URL(endpoint);
		 
		 HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
		 try {
				 //reads in the bytes
				 InputStream inputStream = urlConnection.getInputStream();
				 BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
				 
				 //reads bytes as characters
				 InputStreamReader inputStreamReader = new InputStreamReader(bufferedInputStream);
				 BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
				 
				 //read one line at a time
				 String inputLine = bufferedReader.readLine();
				 while (inputLine != null) {
					 sb.append(inputLine);
					 //reading the next line
					 inputLine = bufferedReader.readLine();
					 
				 }
		 }finally {
			 urlConnection.disconnect();
		 }
		 
		 
		 return sb.toString();
	 }
}
