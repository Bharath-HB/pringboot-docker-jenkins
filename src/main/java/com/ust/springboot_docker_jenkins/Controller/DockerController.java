package com.ust.springboot_docker_jenkins.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerController {
    @GetMapping("/docker")
    public String docker(){
        return "Docker is running";
    }
}
