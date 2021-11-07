package com.example.secondservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/second-service")
public class SecondController {

  @GetMapping("/welcome")
  public String welcome() {
    return "second service.";
  }

  @GetMapping("/check")
  public String check() {
    return "check. second service.";
  }
}
