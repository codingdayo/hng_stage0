package codingdayo.hng_stage0.controller;

import codingdayo.hng_stage0.entity.UserInfo;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.apache.catalina.User;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;
import java.time.format.DateTimeFormatter;

@CrossOrigin(origins = "hngstage0-production-0acb.up.railway.app/", maxAge = 3600)
@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class UserController {

    @GetMapping("/userInfo")
    public UserInfo userInfo(){
        String email = "awoniyipaul2018@gmail.com";
        String current_datetime = DateTimeFormatter.ISO_INSTANT.format(Instant.now());
        String github_url = "https://github.com/codingdayo/hng_stage0";

        return new UserInfo(email, current_datetime, github_url);
    }
}
