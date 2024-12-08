package com.bsuir.lr7.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class QuadraticService {

  public List<Double> solveQuadratic(double a, double b, double c) {
    if (a == 0) {
      throw new IllegalArgumentException("Коэффициент 'a' не может быть равен 0.");
    }

    double discriminant = b * b - 4 * a * c;

    if (discriminant < 0) {
      throw new IllegalArgumentException("Уравнение не имеет действительных корней.");
    }

    List<Double> solutions = new ArrayList<>();
    if (discriminant == 0) {
      solutions.add(-b / (2 * a));
    } else {
      solutions.add((-b + Math.sqrt(discriminant)) / (2 * a));
      solutions.add((-b - Math.sqrt(discriminant)) / (2 * a));
    }

    return solutions;
  }
}
