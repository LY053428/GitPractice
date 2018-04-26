/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testingproject;

/**
 *
 * @author LY053428
 */
public class calculateBMI {
    public static void main (String[] args) throws java.io.IOException {
        java.io.BufferedReader cin = new java.io.BufferedReader (new java.io.InputStreamReader(System.in));
        double w,bmi,h;
        System.out.println("Enter your weight in lbs: ");
        w = Double.parseDouble(cin.readLine());
        System.out.println("Enter your height in inches: ");
        h = Double.parseDouble(cin.readLine());
        bmi = (w*703)/(h*h);
        System.out.println("Your BMI is: " +bmi);
    }
}
