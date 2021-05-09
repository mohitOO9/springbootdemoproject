package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import repositories.AuthorRepository;

@Controller
public class AuthorsController {
	
	private AuthorRepository authorRepository;
	
	public AuthorsController(AuthorRepository authorRepository) {
		super();
		this.authorRepository = authorRepository;
	}

	@RequestMapping("/authors")
	public String getAuthorsList(Model model) {	
		model.addAttribute("authors", authorRepository.findAll());
		return "authors/author-list";
	}
}
