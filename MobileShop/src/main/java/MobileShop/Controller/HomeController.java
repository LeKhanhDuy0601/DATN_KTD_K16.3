package MobileShop.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping({"/admin","/admin"})
	public String admin() {
		return "redirect:/admin/layout/index.html";
	}
}