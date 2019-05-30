package org.fasttrackit.socialnetworkapi.persistence;

import org.fasttrackit.socialnetworkapi.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
