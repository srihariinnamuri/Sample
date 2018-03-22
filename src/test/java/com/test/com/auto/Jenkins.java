package com.test.com.auto;

import java.util.ArrayList;
import java.util.List;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

public class Jenkins {

	public static void main(String[] args) {
		System.out.println("Check 0: List Jobs");

		System.out.println("Check 3: Create AA_TEST_JOB3 by using a generic xml configuration");
		createJob("http://my.jenkins.com", "AA_TEST_JOB3",
				"<project><builders/><publishers/><buildWrappers/></project>");
		// deleteJob("http://my.jenkins.com", "AA_TEST_JOB3");

	}

	public static String createJob(String url, String newJobName, String configXML) {
		Client client = Client.create();
		// client.addFilter(new
		// com.sun.jersey.api.client.filter.HTTPBasicAuthFilter(USERNAME,
		// PASSWORD));
		WebResource webResource = client.resource(url + "/createItem?name=" + newJobName);
		ClientResponse response = webResource.type("application/xml").post(ClientResponse.class, configXML);
		String jsonResponse = response.getEntity(String.class);
		client.destroy();
		System.out.println("Response createJob:::::" + jsonResponse);
		return jsonResponse;
	}

}
