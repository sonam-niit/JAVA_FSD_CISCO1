package com.cisco.second.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cisco.second.model.News;

@RestController
public class MainController {

	@RequestMapping(path = "/hello",method = RequestMethod.GET)
	public String helloWorld() {
		return "Hello From my Springboot APP";
	}
	@GetMapping("/data")
	public Map<String, Object> getData(){
		
		Map<String, Object> map= new HashMap<String, Object>();
		map.put("StatusCode", 200);
		map.put("message", "Users fetched Successfully");
		map.put("Status", "OK");
		String array[]= {"Sonam","Chetana","Prshanat"};
		map.put("users",array );
		return map;
	}
	@GetMapping("/news")
	public Map<String, Object> getNews(){
		List<News> list= new ArrayList<News>();
		list.add(new News("Author 1","Article 1","Description for Atricle 1"));
		list.add(new News("Author 2","Article 2","Description for Atricle 2"));
		list.add(new News("Author 3","Article 3","Description for Atricle 3"));
		list.add(new News("Author 4","Article 4","Description for Atricle 4"));
		
		Map<String, Object> map= new HashMap<String, Object>();
		map.put("status", "OK");
		map.put("totalResults", list.size());
		map.put("articles", list);
		
		return map;
	}
}
