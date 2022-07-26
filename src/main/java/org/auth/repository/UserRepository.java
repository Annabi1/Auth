
package org.auth.repository;
import org.auth.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	    Optional<User> findByEmail(String username);
	    Boolean existsByUsername(String username);
	    Boolean existsByEmail(String email);
}
