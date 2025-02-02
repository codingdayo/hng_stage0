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
import java.util.HashMap;
import java.util.Map;


//@CrossOrigin(origins = "*", maxAge = 3600)
//@RestController
//@RequestMapping("/api/v1")
//@RequiredArgsConstructor
//public class UserController {
//
//    @GetMapping("/userInfo")
//    public UserInfo userInfo(){
//        String email = "awoniyipaul2018@gmail.com";
//        String current_datetime = DateTimeFormatter.ISO_INSTANT.format(Instant.now());
//        String github_url = "https://github.com/codingdayo/hng_stage0";
//
//        return new UserInfo(email, current_datetime, github_url);
//    }
//}


@RestController
// Allow requests from any origin. You can restrict origins if needed.
@CrossOrigin(origins = "*")
public class UserController {

    @GetMapping("/")
    public Map<String, String> getBasicInfo() {
        Map<String, String> response = new HashMap<>();

        // Replace with your registered email
        response.put("email", "your-email@example.com");

        // Generate current datetime in ISO 8601 format (UTC)
        String currentDateTime = DateTimeFormatter.ISO_INSTANT.format(Instant.now());
        response.put("current_datetime", currentDateTime);

        // Replace with your GitHub repository URL
        response.put("github_url", "https://github.com/yourusername/your-repo");

        return response;
    }
}