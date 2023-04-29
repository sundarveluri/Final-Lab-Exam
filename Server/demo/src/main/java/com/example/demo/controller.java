package com.example.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;
import java.util.*;


@RestController
public class controller{

	@PostMapping("/")
	public Map<String,String> service(@RequestBody Map<String,String> map){

		String sss = assc.main(map.get("input"));

		return (sss);
	}
}
