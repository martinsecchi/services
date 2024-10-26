package com.micro.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.micro.entity.UserVo;

@RestController
public class UserController {

	@GetMapping(value = "/user")
	public ResponseEntity<UserVo> getUser() {
		UserVo u = new UserVo();
		u.setId(1111L);
		u.setName("Martin Secchi custidiano");
		u.setDni(34567093);
		u.setAddress("Dolores solor 80");
		return ResponseEntity.ofNullable(u);

	}

}
