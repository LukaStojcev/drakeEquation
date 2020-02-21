package com.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        drakeEquation();
    }

    public static void drakeEquation(){
/*Drake equation
N = number of intelligent species that can communicate with us
R∗ = 1 yr−1 (1 star formed per year, on the average over the life of the galaxy; this was regarded as conservative)
fp = 0.2 to 0.5 (one fifth to one half of all stars formed will have planets)
ne = 1 to 5 (stars with planets will have between 1 and 5 planets capable of developing life)
fl = 1 (100% of these planets will develop life)
fi = 1 (100% of which will develop intelligent life)
fc = 0.1 to 0.2 (10–20% of which will be able to communicate)
L = 1000 to 100,000,000 years (which will last somewhere between 1000 and 100,000,000 years)
 */

        int N;
        int rStar;
        double f_p;
        int numberOfExoplanets;
        double f_l;
        double f_i;
        double f_c;
        int L;

        Scanner keyboard;
        keyboard = new Scanner(System.in);

        System.out.println("There has always been a question on whether life really exists on other planets or not.");
        System.out.println("In order for life to appear, stars first have to be created.");
        System.out.println("How many stars do you think form every year?");
        rStar = keyboard.nextInt();
        System.out.println("Out of all those stars, only a few end up becoming planets.");
        System.out.println("How many do you think become planets. Give me a number from 0.2 to 0.5.");
        f_p = keyboard.nextInt();
        System.out.println("Even with all those planets, only a couple of them will be able to develop life.");
        System.out.println("How many do you think will develop life. Give me a number from 1 to 5.");
        numberOfExoplanets = keyboard.nextInt();
        f_l = 1;
        f_i = 1;
        System.out.println("And even with all of that, only a certain amount are going to figure out how to communicate with us.");
        System.out.println("How many will be able to? Give me a number from 0.1 to 0.2");
        f_c = keyboard.nextInt();
        System.out.println("Finally how much time will it take for this to happen?");
        System.out.println("Give me a number from 1,000 to 100,000,000");
        L = keyboard.nextInt();

        //1. Ask for rStar number 2. Store in the rStar variable 3. Commit
        //1. Ask for f_p fraction 2. Store in the f_p variable 3. Commit
        //todo complete each one of the variables storing them correctly and committing each time

        N = rStar * f_p * numberOfExoplanets * f_l * f_i * f_c * L;

        System.out.println("The number of intelligent species that are out there \n" +
                "that can communicate with us is: " + N);

    }

}