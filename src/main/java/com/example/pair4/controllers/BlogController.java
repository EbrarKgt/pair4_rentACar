package com.example.pair4.controllers;

import com.example.pair4.services.abstracts.BlogService;
import com.example.pair4.services.dtos.blog.requests.CreateBlogPostRequest;
import com.example.pair4.services.dtos.blog.requests.DeleteBlogPostRequest;
import com.example.pair4.services.dtos.blog.requests.UpdateBlogPostRequest;
import com.example.pair4.services.dtos.blog.responses.GetAllBlogPostsResponse;
import com.example.pair4.services.dtos.blog.responses.GetBlogPostByIdResponse;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/blogposts") // URL yolu güncellendi
@AllArgsConstructor
@CrossOrigin // Eğer farklı bir domainden istekler alınıyorsa CORS politikalarına izin verir
public class BlogController {
    //
    private final BlogService blogService;

    @PostMapping("add") // Yeni blog gönderisi eklemek için endpoint
    private void add(@RequestBody @Valid AddBlogPostRequest createBlogPostRequest) {
        blogService.add(createBlogPostRequest);
    }

    @DeleteMapping("{id}") // Blog gönderisini silmek için endpoint
    private void delete(@PathVariable int id) {
        blogService.delete(id);
    }

    @PutMapping("{id}") // Blog gönderisini güncellemek için endpoint
    private void update(@PathVariable int id, @RequestBody @Valid UpdateBlogPostRequest updateBlogPostRequest) {
        blogService.update(id, updateBlogPostRequest);
    }

    @GetMapping("get-all") // Tüm blog gönderilerini almak için endpoint
    private List<GetAllBlogPostsResponse> getAll() {
        return blogService.getAll();
    }

    @GetMapping("get/{id}") // ID'ye göre blog gönderisini almak için endpoint
    private GetBlogPostByIdResponse getByIdResponse(@PathVariable int id) {
        return blogService.getBlogPostByIdResponse(id);
    }
}
