package jeiu.capstone.jongGangHaejo.service.user;

import jeiu.capstone.jongGangHaejo.domain.user.Role;
import jeiu.capstone.jongGangHaejo.domain.user.User;
import jeiu.capstone.jongGangHaejo.dto.form.user.SignUpDto;
import jeiu.capstone.jongGangHaejo.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Slf4j
public class SignUpService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    @Transactional
    public User createUser(SignUpDto form) {
        User user = User.builder()
                .id(form.getId())
                .password(passwordEncoder.encode(form.getPassword()))
                .name(form.getUsername())
                .role(Role.ROLE_USER)
                .build();

        return userRepository.save(user);
    }
}
