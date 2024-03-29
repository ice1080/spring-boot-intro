package com.example.controller.admin;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.domain.Post;
import com.example.service.AuthorService;
import com.example.service.PostService;

@Controller
@Secured({ "ROLE_ADMIN" })
public class AdminPostController {

	private PostService postService;
	private AuthorService authorService;

	@Autowired
	public AdminPostController(PostService postService, AuthorService authorService) {
		this.postService = postService;
		this.authorService = authorService;
	}

	@RequestMapping("/admin/posts")
	public String list(Model model) {
		model.addAttribute("posts", postService.list());
		return "admin/post/list";
	}

	@RequestMapping("/admin/post/{id}")
	public String view(@PathVariable Long id, Model model) {
		model.addAttribute("post", postService.get(id));
		return "admin/post/view";
	}

	// create | save

	@RequestMapping("/admin/post/create")
	public String create(Model model) {
		model.addAttribute("post", new Post());
		model.addAttribute("authors", authorService.list());
		return "admin/post/postForm";
	}

	@RequestMapping(value = "/admin/post/save", method = RequestMethod.POST)
	public String save(@Valid Post post, BindingResult bindingResult, Model model) {

		if (bindingResult.hasErrors()) {
			model.addAttribute("authors", authorService.list());
			return "admin/post/postForm";
		} else {
			Post savedPost = postService.save(post);
			return "redirect:/admin/post/" + savedPost.getId();
		}

	}

	@RequestMapping("/admin/post/edit/{id}")
	public String edit(@PathVariable Long id, Model model) {
		model.addAttribute("post", postService.get(id));
		model.addAttribute("authors", authorService.list());
		return "admin/post/postForm";
	}

	@RequestMapping("/admin/post/delete/{id}")
	public String delete(@PathVariable Long id, RedirectAttributes redirectAttrs) {
		postService.delete(id);
		redirectAttrs.addFlashAttribute("message", "Post was deleted!");
		return "redirect:/admin/posts";
	}

}
