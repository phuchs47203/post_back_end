package com.example.postcloneservice.service;

import java.util.List;

import com.example.postcloneservice.model.Post;
import org.springframework.web.multipart.MultipartFile;

public interface PostService {
    Post addPost(Post post) throws Exception;

    List<Post> getPost();
}
