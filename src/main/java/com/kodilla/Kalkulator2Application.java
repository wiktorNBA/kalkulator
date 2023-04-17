package com.kodilla;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Kalkulator2Application {

    public static void main(String[] args) {

        SpringApplication.run(Kalkulator2Application.class, args);

        Calculator result1 = new Calculator(1,5);
        Calculator result2 = new Calculator(7,3);

        System.out.println(result1.add() + " " + result2.sub());
    }

}
