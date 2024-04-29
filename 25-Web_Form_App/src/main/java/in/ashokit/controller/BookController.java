package in.ashokit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import in.ashokit.bindings.Book;

@Controller
public class BookController {
	
	@GetMapping("/book")
	public ModelAndView loadForm() {
		ModelAndView mav=new ModelAndView();
		mav.addObject("bookObj", new Book());
		mav.setViewName("bookView");
		return mav;
	}
	
	@PostMapping("/book")
	public ModelAndView saveBook(Book book) {
		ModelAndView mav=new ModelAndView();
		mav.addObject("msg", "Book Saved");
		mav.setViewName("success");
		return mav;
	}
}
