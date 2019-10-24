package currency;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class mainThang {
    private static final Logger log = LoggerFactory.getLogger(mainThang.class);

    public static void main(String[] args) {
        SpringApplication.run(mainThang.class, args);
    }
    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder.build();
    }
    @Bean
    public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
        return args -> {
            Base base = restTemplate.getForObject(
                    "https://gturnquist-quoters.cfapps.io/api/random", Base.class);
            log.info(base.toString());
        };
    }
}
