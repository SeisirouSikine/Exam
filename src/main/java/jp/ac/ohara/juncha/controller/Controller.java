package jp.ac.ohara.juncha.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


public class Controller {
  @GetMapping("/")
  public String index(Model model) {
    model.addAttribute("message", "こんにちは");
    return "top";
  }
} 