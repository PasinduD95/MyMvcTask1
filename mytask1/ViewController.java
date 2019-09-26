import org.springframework.web.servlet.ModelAndView;

@Controller
public class ViewController {

	public ModelAndView view(@RequestParam("name") String name1){
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("result", name1);
		mv.setViewName("result.jsp");
		return "result.jsp";
	}
}
