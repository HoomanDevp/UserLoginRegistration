package ir.dpi.userloginregistration.appuser;

import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Transactional(readOnly = true)
public interface StudentRepository {
    Optional<AppUser> findByEmail(String email);
}
