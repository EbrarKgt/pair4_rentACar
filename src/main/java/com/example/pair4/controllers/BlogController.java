package com.example.pair4.controllers;

import com.example.pair4.services.abstracts.BlogService;
import com.example.pair4.services.dtos.blog.requests.AddBlogPostRequest;
import com.example.pair4.services.dtos.blog.requests.UpdateBlogPostRequest;
import com.example.pair4.services.dtos.blog.responses.GetAllBlogPostResponse;
import com.example.pair4.services.dtos.blog.responses.GetBlogPostByIdResponse;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/blogposts")
@AllArgsConstructor
@CrossOrigin
public class BlogController {
    //
    private final BlogService blogService;

    @PostMapping("add")
    private void add(@RequestBody @Valid AddBlogPostRequest createBlogPostRequest) {
        blogService.add(createBlogPostRequest);
    }

    @DeleteMapping("{id}")
    private void delete(@PathVariable int id) {
        blogService.delete(id);
    }

    @PutMapping("{id}")
    private void update(@PathVariable int id, @RequestBody @Valid UpdateBlogPostRequest updateBlogPostRequest) {
        blogService.update(id, updateBlogPostRequest);
    }

    @GetMapping("get-all")
    private List<GetAllBlogPostResponse> getAll() {
        return blogService.getAll();
    }

    @GetMapping("get/{id}") //
    private GetBlogPostByIdResponse getByIdResponse(@PathVariable int id) {
        return blogService.getBlogPostByIdResponse(id);
    }
}
