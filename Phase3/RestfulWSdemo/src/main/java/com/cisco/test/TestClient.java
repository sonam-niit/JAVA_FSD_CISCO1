package com.cisco.test;

import java.net.URI;

import org.glassfish.jersey.client.ClientConfig;

import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.client.WebTarget;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.UriBuilder;

public class TestClient {

	WebTarget target;
	
	public TestClient() {
		ClientConfig config= new ClientConfig();
		Client client= ClientBuilder.newClient(config);
		URI uri= UriBuilder.fromUri("http://localhost:8080/RestfulWSdemo").build();
		target= client.target(uri);
	}
	public String getPlainResponse() {
		return target.path("rest").path("user").request().accept(MediaType.TEXT_PLAIN)
				.get(String.class);
	}
	public String getHTMLResponse() {
		return target.path("rest").path("user").request().accept(MediaType.TEXT_HTML)
				.get(String.class);
	}
	public String getXMLResponse() {
		return target.path("rest").path("user").request().accept(MediaType.TEXT_XML)
				.get(String.class);
	}
	public String getJSONResponse() {
		return target.path("rest").path("user").request().accept(MediaType.APPLICATION_JSON)
				.get(String.class);
	}
}
