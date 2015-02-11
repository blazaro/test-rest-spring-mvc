package com.autentia.training.test.rest.controller;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;

import java.util.*;

import org.junit.*;

import com.autentia.training.test.rest.controller.PingController;
import com.autentia.training.test.rest.model.PingResponse;

public class PingControllerTest {
	
	private final static String INPUT = "Hola, mundo";

	private final PingController pingController = new PingController();

	@Test
	public void shouldReturnInputString() {
		final PingResponse pingResponse = pingController.ping(INPUT);
		assertThat(pingResponse, notNullValue());
		assertThat(pingResponse.getInput(), is(INPUT));
	}
	
	@Test
	public void shouldReturnDate() {
		final PingResponse pingResponse = pingController.ping(INPUT);
		assertThat(pingResponse, notNullValue());
		assertThat(pingResponse.getDate(), org.hamcrest.Matchers.isA(Date.class));
	}
	

 }
