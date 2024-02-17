package com.example.pair4.services.abstracts;

import com.example.pair4.entities.BlogPost;
import com.example.pair4.services.dtos.blog.requests.CreateBlogPostRequest;
import com.example.pair4.services.dtos.blog.requests.DeleteBlogPostRequest;
import com.example.pair4.services.dtos.blog.requests.UpdateBlogPostRequest;
import com.example.pair4.services.dtos.blog.responses.GetAllBlogPostsResponse;
import com.example.pair4.services.dtos.blog.responses.GetBlogPostByIdResponse;

import java.util.List;

public interface BlogService {
    void add(AddBlogPostRequest createBlogPostRequest);
    void update(int id, UpdateBlogPostRequest updateBlogPostRequest);
    void delete(int id);
    List<GetAllBlogPostsResponse> getAll();
    GetBlogPostByIdResponse getBlogPostByIdResponse(int id);
    BlogPost getById(int id);
}
