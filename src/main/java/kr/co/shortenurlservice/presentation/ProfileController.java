package kr.co.shortenurlservice.presentation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProfileController {

    @Value("${spring.profiles.active:default}")
    private String activeProfile;

    @Value("${database.address}")
    private String databaseAddress;

    @GetMapping("/")
    public String home() {
        return "Hello, World!";
    }

    @GetMapping("/profile")
    public String getActiveProfile() {
        return "현재 활성화된 프로파일1234: " + activeProfile + " 사용할 DB: " + databaseAddress;
    }
}
