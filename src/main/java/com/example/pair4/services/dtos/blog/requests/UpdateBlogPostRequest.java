package com.example.pair4.services.dtos.blog.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateBlogPostRequest {

    @Length(min = 5, max = 100, message = "The title must be between 5 and 100 characters.")
    private String title;

    @Length(min = 20, message = "The content must have a minimum length of 20 characters.")
    private String content;

}
