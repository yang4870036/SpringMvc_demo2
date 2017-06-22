package com.neuedu.springmvc;

import java.util.Date;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.util.ReflectionUtils.FieldFilter;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.filter.HiddenHttpMethodFilter;

import com.neuedu.entity.User;
@RequestMapping("SpringMVC")
@Controller
public class SpringMVCTest {
	@RequestMapping(value="/testMethod", method=RequestMethod.GET)
	public String testMethod(){
		System.out.println("this is testmethod get");
		return "success";
	}
	
	@RequestMapping(value="/testMethod2",params={"name","age"},method=RequestMethod.POST)
	public String testMethod2(){
		System.out.println("this is testmethod2 post");
		return "success";
	}

	@RequestMapping(value="/helloAnt/{id}/{name}")
	public String helloAnt(@PathVariable("id") Integer id,@PathVariable("name") String name){
		System.out.println("test /helloAnt/{id}/{name} id:"+id+"name:"+name);
		return "success";
	}
	
	@RequestMapping(value="/testMethod3/{id}/{name}", method=RequestMethod.PUT)
	public String testMethod3(@PathVariable("id") Integer id,@PathVariable("name") String name){
		System.out.println("test put id:"+id+"name:"+name);
		return "success";
	}
	
	@RequestMapping(value="/testMethod4")
	public String testMethod4(@RequestParam("id") Integer id )
	{
		System.out.println(id+"is id test @RequestParam");
		return "success";
	}
	
	@RequestMapping(value="/testMethodPojo")
	public String testMethodPojo(User user){
		System.out.println("pojo user is : "+user);
		return "success";
	}
	
	@RequestMapping(value="/testMethodMap")
	public String testMethodMap( Map<String,Object> map){
		map.put("time",new Date());
		return "success";
	}
}
