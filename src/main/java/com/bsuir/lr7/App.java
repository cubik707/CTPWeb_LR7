package com.bsuir.lr7;

import com.bsuir.lr7.controller.QuadraticController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(com.bsuir.lr7.config.ApplicationConfig.class);

        QuadraticController controller = context.getBean(QuadraticController.class);

        System.out.println(controller.solve(1, -3, 2)); // Уравнение x^2 - 3x + 2 = 0
        System.out.println(controller.solve(1, -2, 1)); // Уравнение x^2 - 2x + 1 = 0
        System.out.println(controller.solve(1, 0, -4)); // Уравнение x^2 - 4 = 0
    }
}
