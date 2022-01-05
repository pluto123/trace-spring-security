package tw.com.pluto.trace.security.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import tw.com.pluto.trace.security.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {
    User findByUsername(String username);
}
