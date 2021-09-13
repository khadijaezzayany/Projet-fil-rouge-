package ma.youcode.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.youcode.models.User;

public interface UserRepository extends JpaRepository<User, Long> {

	Optional<User> findByUsername(String username);

	Boolean existsByUsername(String username);

	Boolean existsByEmail(String email);

	User findByEmail(String email);

	User findByUserId(String userId);

}
