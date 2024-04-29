package in.ashokit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import in.ashokit.entity.User;
import jakarta.validation.Valid;

@Controller
public class UserController {

	@GetMapping("/")
	public String handleForm(Model model) {
		model.addAttribute("user", new User());
		return "index";
	}

	@PostMapping("/post")
	public String submitForm(@Valid User user, BindingResult result, Model model) {
		if (result.hasErrors()) {
			return "index";
		} else {
			model.addAttribute("user", new User());
			model.addAttribute("smsg", "User Saved");
			return "index";
		}
	}
}
