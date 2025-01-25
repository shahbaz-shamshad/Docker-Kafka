package com.genie.TestingApp;

import com.genie.TestingApp.service.WishService;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;

import org.junit.jupiter.api.Assertions;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.mock.mockito.MockBeans;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.http.ResponseEntity;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.client.RestTemplate;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;


@WebMvcTest
class TestingAppApplicationTests {

//	@LocalServerPort
//	private int port;
//	@Autowired
//	RestTemplate restTemplate;
	@Autowired
	MockMvc mockMvc;
	@Mock
	private WishService wishService;

	@Test
	void testWish() throws Exception{
//		String url="http://localhost:"+port+"/wish";
//		ResponseEntity<String> res=restTemplate.getForEntity(url,String.class);
//
//		assertEquals(200,res.getStatusCode().value());
//		assertEquals("Ayushgood morning",res.getBody());
		when(wishService.getWish("Ayush")).thenReturn("Aysushgood morning");

		mockMvc.perform(get("/wish"))
				.andExpect(status().isOk())
		.andExpect(content().string("Ayushgood morning"));



	}

}
