package org.fasttrackit.socialnetworkapi.web;

import org.fasttrackit.socialnetworkapi.domain.PostActivity;
import org.fasttrackit.socialnetworkapi.service.PostActivityService;
import org.fasttrackit.socialnetworkapi.transfer.postActivity.CreatePostActivityRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/posts")
public class PostActivityController {

    private final PostActivityService postActivityService;

    @Autowired
    public PostActivityController(PostActivityService postActivityService) {
        this.postActivityService = postActivityService;
    }

    @PostMapping
    public ResponseEntity<PostActivity> createPostActivity (@RequestBody @Valid CreatePostActivityRequest request){

        PostActivity response = postActivityService.createPostActivity(request);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

}
