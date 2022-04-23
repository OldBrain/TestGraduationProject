package ru.gb.graduation_project.graduationproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GraduationProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(GraduationProjectApplication.class, args);
        System.out.println("App started OK!");
        System.out.println("see test data console from url: http://localhost:8080/awp/h2-console/");

    }

}
