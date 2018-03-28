package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/runme")
    public String loadFormPage (Model model) {

        int a, b, c, d, e;
        double x, y, z;
        String one, two, red, blue, green;
        String output;

        a = 5;
        b = 10;
        c = a + b;
        output = doSomething();

        output = output + "<br/>" + "a is " + a + ", b is " + b;
        output = output + "<br/>" + "a + b is " + c;
        d = a - b;
        output = output + "<br/>" + "a - b is " + d;
        e = a * b;
        output = output + "<br/>" + "a * b is " + e;
        e = a / b;
        output = output + "<br/>" + "a / b is " + e;
        e = b / a;
        output = output + "<br/>" + "b / a is " + e;
        e = a % b;
        output = output + "<br/>" + "a % b is " + e;
        e = b % a;
        output = output + "<br/>" + "b % a is " + e;

        x = 1.5;
        output = output + "<br/>" + "x is " + x;
        y = x * x;
        output = output + "<br/>" + "x * x is " + y;
        z = b / 3;
        output = output + "<br/>" + "b / 3 is " + z;
        System.out.println();

        one = "one";
        two = "two";
        red = "red";
        blue = "blue";
        green = "green";
        System.out.println("Green is " + green);
        output = output + "<br/>" + one + " fish " + two + " fish " + red + " fish " + blue + " fish";

        // another way to print is...
        // use %s as a placeholder for strings, %d as a placeholder
        // for integers and %f for floating point decimals
        output = output + "<br/>" + String.format("%s fish %s fish %s fish %s fish", one, two, red, blue, green);

        model.addAttribute("output", output);
        return "index";
    }
    private String doSomething() {
        return "I just did something";
    }
}