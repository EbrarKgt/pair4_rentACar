package com.example.pair4.services.dtos.blog.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetBlogPostByIdResponse {

    private int id;
    private String title;
    private String content;
    private String imageUrl;

}
