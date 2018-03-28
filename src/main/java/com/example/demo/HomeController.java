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
        System.out.println( "a + b is " + c );
        d = a - b;
        System.out.println( "a - b is " + d );
        e = a * b;
        System.out.println( "a * b is " + e );
        e = a / b;
        System.out.println( "a / b is " + e );
        e = b / a;
        System.out.println( "b / a is " + e );
        e = a % b;
        System.out.println( "a % b is " + e );
        e = b % a;
        System.out.println( "b % a is " + e );

        x = 1.5;
        System.out.println( "x is " + x );
        y = x * x;
        System.out.println( "x * x is " + y );
        z = b / 3;
        System.out.println( "b / 3 is " + z );
        System.out.println();

        one = "one";
        two = "two";
        red = "red";
        blue = "blue";
        green = "green";
        System.out.println("Green is " + green);
        System.out.print( one + " fish " + two + " fish ");
        System.out.println(red + " fish " + blue + " fish");

        // another way to print is...
        // use %s as a placeholder for strings, %d as a placeholder
        // for integers and %f for floating point decimals
        System.out.printf("%s fish %s fish %s fish %s fish", one, two, red, blue, green);
        
        model.addAttribute("output", output);
        return "index";
    }
    private String doSomething() {
        return "I just did something";
    }
}