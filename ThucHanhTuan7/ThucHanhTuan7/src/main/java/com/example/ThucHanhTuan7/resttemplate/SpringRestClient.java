package com.example.ThucHanhTuan7.resttemplate;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.example.ThucHanhTuan7.entity.MayBay;

public class SpringRestClient {

	private static final String getUrl = "http://localhost:8080/getAllMayBay";
	private static final String postUrl = "http://localhost:8080/MayBay";
	private static final String deleteUrl = "http://localhost:8080//MayBay/{id}";
	
	private static RestTemplate restTemplate = new RestTemplate();
	
	public static void main(String[] args) {
		SpringRestClient springRestClient = new SpringRestClient();
		
		//springRestClient.getMayBays();
		
		//springRestClient.createMayBay();
		
		springRestClient.deleteEmployee();
		
		//springRestClient.updateMayBay();
	}
	
	private void getMayBays() {
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<String> entity = new HttpEntity<String>("parameters",headers);
		ResponseEntity<String> result = restTemplate.exchange(getUrl, HttpMethod.GET, entity, String.class);
		System.out.println(result);
	}
	
	private void createMayBay() {

        MayBay newMayBay = new MayBay(1,"Sang",8000);

        RestTemplate restTemplate = new RestTemplate();
        MayBay result = restTemplate.postForObject(postUrl, newMayBay, MayBay.class);

        System.out.println(result);
    }
	
	private void deleteEmployee() {
        Map < String, String > params = new HashMap < String, String > ();
        params.put("id", "1");
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.delete(deleteUrl, params);
    }
	
	private void updateMayBay() {
        Map < String, String > params = new HashMap < String, String > ();
        params.put("id", "1");
        MayBay updatedMayBay = new MayBay(1, "Sang 2", 200);
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.put(deleteUrl, updatedMayBay, params);
    }
	
}
