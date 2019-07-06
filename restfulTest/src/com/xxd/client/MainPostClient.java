package com.xxd.client;

import java.util.ArrayList;
import java.util.List;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

public class MainPostClient {
	public static void main(String[] args) throws Exception {

		CloseableHttpClient httpClient=HttpClientBuilder.create().build();
		
//		 
			
			 HttpPost httpPost=new HttpPost("http://192.168.91.13:9999/CustomerService/crm/customer");
	 
			 List<BasicNameValuePair> list =new ArrayList<BasicNameValuePair>();
			 
			 list.add(new BasicNameValuePair("id", "0202"));
			 list.add(new BasicNameValuePair("name", "张三丰"));
			 list.add(new BasicNameValuePair("age", "99"));
			 
			 
			 
			 HttpEntity httpEntity=new UrlEncodedFormEntity(list,"utf-8");
			 
			 httpPost.setEntity(httpEntity);
			 
			 
//			 
			HttpResponse httpResponse=   httpClient.execute(httpPost);
			 
	 
			if(httpResponse.getStatusLine().getStatusCode()==HttpStatus.SC_OK){
				HttpEntity entity = httpResponse.getEntity();
//				 	 
				String result= EntityUtils.toString(entity,"utf-8");
				
				System.out.println(result);
				
				EntityUtils.consume(entity);
			}else{
				System.err.println(httpResponse.getStatusLine());
			}
			httpClient.close();

		
		
		
	}
	
}
