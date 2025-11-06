package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Whether;
import com.example.demo.service.WhetherService;

@RestController
public class WhetherController {

	@Autowired 
	WhetherService ws;
	@PostMapping ("Whether")
	public String addWhether(@RequestBody Whether w)
	{
		ws.saveWthetherdetails(w); 
		 return "Whether added";
	}
	 
	@GetMapping("Whether/{id}")
	public Whether getwhether(@PathVariable int id)
	{
		return ws.getWhetherdetails(id);
		
	}
}
