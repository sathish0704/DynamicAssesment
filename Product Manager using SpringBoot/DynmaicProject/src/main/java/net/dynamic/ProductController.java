package net.dynamic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ProductController {

	@Autowired
	private ProductService service;

	@GetMapping("/index2")
	public String ProductsPage(Model model) {
		List<Product> listproduct = service.listAll();
		model.addAttribute("listproduct", listproduct);
		System.out.print("Get / ");
		return "index2";
	}

	@GetMapping("/new")
	public String add(Model model) {
		model.addAttribute("Product", new Product());
		return "new";
	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveStudent(@ModelAttribute("Product") Product std) {
		service.save(std);
		return "redirect:/index2";
	}

	@RequestMapping("/edit/{id}")
	public ModelAndView showEditProductPage(@PathVariable(name = "id") int id) {
		ModelAndView mav = new ModelAndView("new");
		Product std = service.get(id);
		mav.addObject("Product", std);
		return mav;

	}

	@RequestMapping("/delete/{id}")
	public String deleteProduct(@PathVariable(name = "id") int id) {
		service.delete(id);
		return "redirect:/index2";
	}
}
