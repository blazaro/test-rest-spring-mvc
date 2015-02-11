package com.autentia.training.test.rest.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

public class PingControllerSpringIntegrationTest {

	private static final String URL = "/v1/ping";

	private MockMvc mockMvc;

	private final PingController configurationController = new PingController();

	@Before
	public void beforeTest() {
		mockMvc = MockMvcBuilders.standaloneSetup(configurationController).build();
	}

	@Test
	public void shouldReturnHttpCode200OnGet() throws Exception {
		mockMvc.perform(get(URL+"?input=hola")).andExpect(status().isOk());
	}
	
	@Test
	public void shouldReturnHttpCode200OnPost() throws Exception {
		mockMvc.perform(post(URL).param("input", "hola")).andExpect(status().isOk());
	}
	
	@Test
	public void shouldReturnHttpCode405OnPUT() throws Exception {
		mockMvc.perform(put(URL)).andExpect(status().isMethodNotAllowed());
	}
	
	@Test
	public void shouldReturnHttpCode400OnGetWithoutParameter() throws Exception {
		mockMvc.perform(get(URL)).andExpect(status().isBadRequest());
	}
	
	@Test
	public void shouldReturnHttpCode400OnPostWithoutParameter() throws Exception {
		mockMvc.perform(post(URL)).andExpect(status().isBadRequest());
	}

}
