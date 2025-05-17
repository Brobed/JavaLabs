package com.company;

import java.util.Scanner;
import static java.lang.Math.*;
12345
public class Main {

    public static void main(String[] args) {
        double x;
        double numerator,denominator,fraction,first,second,expression,degree1,degree2,expression1,expression2,y;

	    Scanner num = new Scanner(System.in);
	    x = num.nextDouble();

        numerator = cos(exp(log(abs(x)/9)));
        denominator = pow(cos(exp(abs(x)/9)),2) + 7;
        fraction = numerator/denominator;
        first = abs(acos(fraction));
        degree1 = sin(3*x - 1);
        degree2 = tan(x);
        expression1 = pow(2,degree1);
        expression2 = pow(3,degree2);
        expression = expression1 + expression2;
        second = log(expression);
        y = first + second;
        System.out.println(y);


        if ((x<=6|x<=0)&(y<=0|y<=-6)){
            System.out.println("true");
        } else {
            System.out.println("false");
        }

    }
}
