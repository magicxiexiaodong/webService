package com.xxd.client;

import java.io.IOException;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;

public class MainClient {
	public static void main(String[] args) throws ClientProtocolException, IOException {
//		1. 创建 HttpClient 的实例
		CloseableHttpClient httpClient = HttpClientBuilder.create().build();

		// 2. 创建某种连接方法的实例
		HttpGet httpGet = new HttpGet("http://192.168.91.13:9999/CustomerService/crm/customer/5444");

//		3. 调用第一步中创建好的实例的execute方法来执行第二步中创建好的链接类实例
		HttpResponse httpResponse = httpClient.execute(httpGet);

		if (httpResponse.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
//			4. 读response获取HttpEntity
			HttpEntity entity = httpResponse.getEntity();

//			5. 对得到后的内容进行处理	
			String result = EntityUtils.toString(entity);

			System.out.println(result);

			EntityUtils.consume(entity);
		} else {
			System.err.println(httpResponse.getStatusLine());
		}

//		6. 释放连接。无论执行方法是否成功，都必须释放连接

		httpClient.close();
	}
}
