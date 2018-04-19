package com.controllers;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import com.entities.Students;
import com.services.StudentServices;


@Controller
@RequestMapping(value="students")
public class StudentController {
	
	@Autowired
	StudentServices studentServices;
	
	@RequestMapping(value="/page", method = RequestMethod.GET)
	public ModelAndView getPage() {
		
		ModelAndView view = new ModelAndView("hello");
		return view;
	}
	
	
	@RequestMapping(value="/saveOrUpdate", method=RequestMethod.POST)
	public @ResponseBody Map<String,Object> getSaved(Students students){
		Map<String,Object> map = new HashMap<String,Object>();
		
		if(studentServices.saveOrUpdate(students)){
			map.put("status","200");
			map.put("message","Your record have been saved successfully");
		}	
		return map;
	}
	
	
	@RequestMapping(value="/list", method=RequestMethod.POST)
	public @ResponseBody Map<String,Object> getAll(Students students){
		Map<String,Object> map = new HashMap<String,Object>();
	
			List<Students> list = studentServices.list();
			
			if (list != null){
				map.put("status","200");
				map.put("message","Data found");
				map.put("data", list);
			}else{
				map.put("status","404");
				map.put("message","Data not found");
			}	
		return map;
	}
	
	
	@RequestMapping(value="/delete", method=RequestMethod.POST)
	public @ResponseBody Map<String,Object> delete(Students students){
		
		Map<String,Object> map = new HashMap<String,Object>();
		
		if(studentServices.delete(students)){
			map.put("status","200");
			map.put("message","Your record have been deleted successfully");
		}
		return map;
	}
}
