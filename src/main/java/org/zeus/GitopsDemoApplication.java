package org.zeus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @author liangzijin
 */
@SpringBootApplication
@RestController
public class GitopsDemoApplication {

    @GetMapping("/demo")
    public String demo(){
        return UUID.randomUUID().toString();
    }

    public static void main(String[] args) {
        SpringApplication.run(GitopsDemoApplication.class, args);
    }

}
