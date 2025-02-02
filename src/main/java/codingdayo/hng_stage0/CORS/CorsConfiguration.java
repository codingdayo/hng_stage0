package codingdayo.hng_stage0.CORS;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfiguration implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/api/v1/**")
                .allowedOrigins("hngstage0-production-f335.up.railway.app")  // specify allowed origins
                .allowedMethods("GET")  // specify allowed methods
                .allowedHeaders("*");  // allow any headers
    }

}
