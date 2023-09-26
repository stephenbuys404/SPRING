package com.developers.jpasecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.developers.jpasecurity.model.Post;
import com.developers.jpasecurity.repository.PostRepository;

@RestController
@RequestMapping("/api/posts")
public class PostController {

	private final PostRepository posts;
	public PostController(PostRepository posts) {
		this.posts=posts;
	}
	
	@GetMapping
	public Iterable<Post> findAll(){
		return posts.findAll();
	}
	
	@GetMapping("/{id}")
	public Post findById(@PathVariable("id") Post post) {
		return post;
	}
}
