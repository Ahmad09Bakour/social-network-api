package org.fasttrackit.socialnetworkapi.persistence;

import org.fasttrackit.socialnetworkapi.domain.PostActivity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostActivityRepository extends JpaRepository<PostActivity, Long> {

}
