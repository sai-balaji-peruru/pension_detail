package com.cognizant.ms.restclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;

@FeignClient(name="authorizationService",url="${AUTH_URI:http://localhost:9095/authorization}")
public interface AuthorizationClient {

	//validating jwt token with authorization microservice
		@GetMapping("/authorize")
		public Boolean authorization(@RequestHeader("Authorization") String token);
}
