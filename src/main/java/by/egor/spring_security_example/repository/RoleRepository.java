package by.egor.spring_security_example.repository;

import by.egor.spring_security_example.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {

}
