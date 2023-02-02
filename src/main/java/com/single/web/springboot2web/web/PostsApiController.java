package com.single.web.springboot2web.web;

import com.single.web.springboot2web.service.posts.PostsService;
import com.single.web.springboot2web.web.dto.PostsResponseDto;
import com.single.web.springboot2web.web.dto.PostsSaveRequestDto;
import com.single.web.springboot2web.web.dto.PostsUpdateRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
public class PostsApiController {

    private final PostsService postsService;

    @PostMapping("/api/v1/posts")
    public Long save(@RequestBody PostsSaveRequestDto requestDto) {

        return postsService.save(requestDto);
    }

    @GetMapping("/api/v1/posts/{id}")
    public PostsResponseDto findById (@PathVariable long id) {

        return postsService.findById(id);
    }

    @PutMapping("/api/v1/posts/{id}")
    public Long update(@PathVariable Long id, @RequestBody PostsUpdateRequestDto requestDto) {

        return postsService.update(id, requestDto);
    }

}
