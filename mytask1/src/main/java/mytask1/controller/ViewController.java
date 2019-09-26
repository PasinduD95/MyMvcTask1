package mytask1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ViewController {
	
	@RequestMapping("/view")
	public ModelAndView view(@RequestParam("name") String name1){
		
		ModelAndView mv = new ModelAndView();
		
		mv.addObject("result", name1);
		mv.setViewName("result.jsp");
		
		return mv;
	}

}