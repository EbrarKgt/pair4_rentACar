package com.example.pair4.services.abstracts;

import com.example.pair4.entities.Blog;
import com.example.pair4.services.dtos.blog.requests.AddBlogPostRequest;
import com.example.pair4.services.dtos.blog.requests.DeleteBlogPostRequest;
import com.example.pair4.services.dtos.blog.requests.UpdateBlogPostRequest;
import com.example.pair4.services.dtos.blog.responses.GetAllBlogPostResponse;
import com.example.pair4.services.dtos.blog.responses.GetBlogPostByIdResponse;

import java.util.List;

public interface BlogService {
    void add(AddBlogPostRequest addBlogPostRequest);
    void update(int id, UpdateBlogPostRequest updateBlogPostRequest);
    void delete(int id);
    List<GetAllBlogPostResponse> getAll();
    GetBlogPostByIdResponse getBlogPostByIdResponse(int id);
    Blog getById(int id);
}
