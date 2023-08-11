package com.example.postcloneservice.model;

// import jakarta.persistence.Lob;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.multipart.MultipartFile;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Post {
    private String id;

    private String post;
    private String image;
    private String timeStamp;
    private String file;
}
