package com.example.demo.post;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostController {

    private PostService postService;

    @Autowired
    public PostController(PostService postService) {
        this.postService = postService;
    }

//    @CrossOrigin(origins = "http://localhost:4200")
//    @GetMapping("/api/posts")
//    public List<Post> getAllPosts(){
//        return postService.getAll();
//    }
//
//    @CrossOrigin(origins = "http://localhost:4200")
//    @GetMapping("/api/posts/{id}")
//    public Post get(@PathVariable int id){
//        return postService.get(id);
//    }
}