package com.streamtools;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.streamtools.domain.model.Account;
import com.streamtools.domain.model.enums.PlanType;
import com.streamtools.domain.repository.AccountRepository;

@SpringBootApplication
public class StreamtoolsApplication {

    public static void main(String[] args) {
        SpringApplication.run(StreamtoolsApplication.class, args);
    }

    @Bean
    CommandLineRunner seedDatabase(AccountRepository accountRepository) {
        return args -> {
            if (accountRepository.count() == 0) {
                Account account = Account.builder()
                        .name("Default Account")
                        .planType(PlanType.FREE)
                        .build();
                accountRepository.save(account);
                System.out.println("✅ Conta default criada com id: " + account.getId());
            }
        };
    }
}
