package com.example.pair4.services.concretes;

import com.example.pair4.core.utilities.mappers.ModelMapperService;
import com.example.pair4.entities.Blog;
import com.example.pair4.repositories.BlogRepository;
import com.example.pair4.services.abstracts.BlogService;
import com.example.pair4.services.dtos.blog.requests.AddBlogPostRequest;
import com.example.pair4.services.dtos.blog.requests.AddBlogPostRequest;
import com.example.pair4.services.dtos.blog.requests.UpdateBlogPostRequest;
import com.example.pair4.services.dtos.blog.responses.GetAllBlogPostResponse;
import com.example.pair4.services.dtos.blog.responses.GetAllBlogPostResponse;
import com.example.pair4.services.dtos.blog.responses.GetBlogPostByIdResponse;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class BlogManager implements BlogService {

    private final BlogRepository blogRepository;
    private final ModelMapperService modelMapperService;

    @Override
    public void add(AddBlogPostRequest addBlogPostRequest) {
        Blog blogPost = modelMapperService.forRequest().map(addBlogPostRequest, Blog.class);
        blogRepository.save(blogPost);
    }

    @Override
    public void update(int id, UpdateBlogPostRequest updateBlogPostRequest) {
        Blog blogPostToUpdate = blogRepository.findById(id).orElseThrow(() -> new RuntimeException("Blog post not found"));
        modelMapperService.forRequest().map(updateBlogPostRequest, blogPostToUpdate);
        blogRepository.save(blogPostToUpdate);
    }

    @Override
    public void delete(int id) {
        Blog blogPostToDelete = blogRepository.findById(id).orElseThrow(() -> new RuntimeException("Blog post not found"));
        blogRepository.delete(blogPostToDelete);
    }

    @Override
    public List<GetAllBlogPostResponse> getAll() {
        List<Blog> blogPosts = blogRepository.findAll();
        return blogPosts.stream()
                .map(blogPost -> modelMapperService.forResponse().map(blogPost, GetAllBlogPostResponse.class))
                .toList();
    }

    @Override
    public GetBlogPostByIdResponse getBlogPostByIdResponse(int id) {
        Blog blogPost = blogRepository.findById(id).orElseThrow(() -> new RuntimeException("Blog post not found"));
        return modelMapperService.forResponse().map(blogPost, GetBlogPostByIdResponse.class);
    }

    @Override
    public Blog getById(int id) {
        return blogRepository.findById(id).orElseThrow(() -> new RuntimeException("Blog post not found"));
    }
}
