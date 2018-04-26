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
public class areaOfTriangle {
    public static void main (String[] args) throws java.io.IOException {
        java.io.BufferedReader cin = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
        double base, height;
        double area;
        System.out.println("Enter the value of base: ");
        base = Double.parseDouble(cin.readLine());
        System.out.println("Enter the value of height: ");
        height = Double.parseDouble(cin.readLine());
        area = (base * height)/2;
        System.out.println("The area of triangle is: " +area);
    }
}
