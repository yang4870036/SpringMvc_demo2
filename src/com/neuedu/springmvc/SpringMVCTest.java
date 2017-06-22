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
//简单的helloworld，jsp的href或者action映射到这里，进行扫描
@Controller
public class SpringMVCTest {
	@RequestMapping(value="/testMethod", method=RequestMethod.GET)
	public String testMethod(){
		System.out.println("this is testmethod get");
		return "success";
	}

//判断参数是否足够
	@RequestMapping(value="/testMethod2",params={"name","age"},method=RequestMethod.POST)
	public String testMethod2(){
		System.out.println("this is testmethod2 post");
		return "success";
	}

//	根据路径获取“路径参数”
	@RequestMapping(value="/helloAnt/{id}/{name}")
	public String helloAnt(@PathVariable("id") Integer id,@PathVariable("name") String name){
		System.out.println("test /helloAnt/{id}/{name} id:"+id+"name:"+name);
		return "success";
	}
	
//	put方法
	@RequestMapping(value="/testMethod3/{id}/{name}", method=RequestMethod.PUT)
	public String testMethod3(@PathVariable("id") Integer id,@PathVariable("name") String name){
		System.out.println("test put id:"+id+"name:"+name);
		return "success";
	}
	
//	deleted方法
	@RequestMapping(value="/testDelete/{id}/{name}", method=RequestMethod.DELETE)
	public String testDelete(@PathVariable("id") Integer id,@PathVariable("name") String name){
		System.out.println("test delete id:"+id+"name:"+name);
		return "success";
	}
	
//	@RequestParam可以根据url或者input的name中获取需要的参数
	@RequestMapping(value="/testMethod4")
	public String testMethod4(@RequestParam("id") Integer id )
	{
		System.out.println(id+"is id test @RequestParam");
		return "success";
	}
	
//	Pojo获取类的属性，类内包含类，例如user(address),可以address.line
	@RequestMapping(value="/testMethodPojo")
	public String testMethodPojo(User user){
		System.out.println("pojo user is : "+user);
		return "success";
	}
	
//	map.put会把key，values放在request内，通过EL，${requestScope.参数名}获取
	@RequestMapping(value="/testMethodMap")
	public String testMethodMap( Map<String,Object> map){
		map.put("time",new Date());
		return "success";
	}
}
