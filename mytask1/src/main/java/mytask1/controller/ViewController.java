package mytask1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ViewController {
	
	@RequestMapping("/view")
	public ModelAndView view(@RequestParam("fname") String fname, @RequestParam("lname") String lname){
		
		ModelAndView mv = new ModelAndView();
		
		String fullname = fname + " " + lname;
		mv.addObject("result", fullname);
		mv.setViewName("result.jsp");
		
		return mv;
	}

}
