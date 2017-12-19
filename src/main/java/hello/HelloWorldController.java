package hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.util.HtmlUtils;

@Controller
@RequestMapping("/")
public class HelloWorldController {
	@RequestMapping(method=RequestMethod.GET)
	public @ResponseBody String hello(@RequestParam(value="name", required=false, defaultValue="World") String name) {
		String greetingTemplate = "Hello %s!";
		return String.format(greetingTemplate, HtmlUtils.htmlEscape(name));
	}
}
