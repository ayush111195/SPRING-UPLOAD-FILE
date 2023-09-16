package springmvcform.controller;

import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind .annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import springmvcform.controller.model.Student;

@org.springframework.stereotype.Controller
public class Controller {
@RequestMapping("/home")
	public String form( ) {
		System.out.println("this is student page");
		return "index";
		
	}
@RequestMapping(path="/handleform",method=RequestMethod.POST)
public String formHandler(@ModelAttribute("student") Student student , BindingResult result) {
	if(result.hasErrors())
	{                                                           //bindingresult use hhua h error ko 
		return"index";                                          //  karne ke leye
	}
	System.out.println(student);
	//m.addAttribute("student1",student);
	System.out.println(student.getAddress());
	return "success";
	
}


}
