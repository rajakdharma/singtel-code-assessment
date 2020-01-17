package com.singtel.animalsactivitys.controllers;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

class AnimalAcitivityControllersTest {

	@Autowired
	private MockMvc mockMvc;

	@Test
	void test() throws Exception {

		String expectedResult = "kykyliky";
		         
		         RequestBuilder requestBuilder = MockMvcRequestBuilders.get(
		 				"/sounded-native-tongue").accept(
		 				MediaType.APPLICATION_JSON);
		 		MvcResult result = mockMvc.perform(requestBuilder).andReturn();
		         
		assertEquals(expectedResult, result.getResponse().getContentAsString());

	}

}
