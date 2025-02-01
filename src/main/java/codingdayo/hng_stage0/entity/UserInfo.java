package codingdayo.hng_stage0.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class UserInfo {
    public String email;
    public String current_datetime;
    public String github_url;

    public UserInfo(String email, String current_datetime, String github_url) {
        this.email = email;
        this.current_datetime = current_datetime;
        this.github_url = github_url;
    }
}
