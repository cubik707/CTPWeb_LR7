package com.bsuir.lr7.controller;

import com.bsuir.lr7.service.QuadraticService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class QuadraticController {
  private final QuadraticService quadraticService;

  @Autowired
  public QuadraticController(QuadraticService quadraticService) {
    this.quadraticService = quadraticService;
  }

  public String solve(double a, double b, double c) {
    try {
      List<Double> solutions = quadraticService.solveQuadratic(a, b, c);
      return "Решения: " + solutions;
    } catch (IllegalArgumentException e) {
      return e.getMessage();
    }
  }
}
