package com.ena.bank.authservice.service;

import com.ena.bank.authservice.model.UserEntity;
import com.ena.bank.authservice.repository.AuthUserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class AuthUserLoader implements CommandLineRunner {

    private final AuthUserRepository repository;
    private final PasswordEncoder passwordEncoder;


    @Override
    public void run(String... args) throws Exception {
        repository.save(
                UserEntity.builder().userId(1)
                        .username("martin").password(passwordEncoder.encode("martin123"))
                        .build()
        );

        repository.save(
                UserEntity.builder().userId(2)
                        .username("bob").password(passwordEncoder.encode("bob123"))
                        .build()
        );
    }
}
