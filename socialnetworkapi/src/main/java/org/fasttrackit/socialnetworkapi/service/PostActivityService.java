package org.fasttrackit.socialnetworkapi.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.fasttrackit.socialnetworkapi.domain.PostActivity;
import org.fasttrackit.socialnetworkapi.persistence.PostActivityRepository;
import org.fasttrackit.socialnetworkapi.transfer.postActivity.CreatePostActivityRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostActivityService {

    private static final Logger LOGGER = LoggerFactory.getLogger(PostActivityService.class);

    private final PostActivityRepository postActivityRepository;

    private final ObjectMapper objectMapper;

    @Autowired
    public PostActivityService(PostActivityRepository postActivityRepository, ObjectMapper objectMapper) {
        this.postActivityRepository = postActivityRepository;
        this.objectMapper = objectMapper;
    }
    public PostActivity createPostActivity (CreatePostActivityRequest request){

        LOGGER.info("Creating PostActivity {}" + request);

        PostActivity postActivity = objectMapper.convertValue(request, PostActivity.class);
        postActivity.setTitle(request.getTitle());
        return postActivityRepository.save(postActivity);
    }
}
