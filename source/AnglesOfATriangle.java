/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testingproject;

/**
 *
 * @author LY053428
 * Write a Java Program to find Angles of a Triangle
 */
public class AnglesOfATriangle {
    public static void main (String[] args) throws java.io.IOException {
        java.io.BufferedReader cin = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
        int first_angle,second_angle,third_angle;
        System.out.println("Enter two angles of a triangle: "); //Print Statement
        first_angle = Integer.parseInt(cin.readLine());
        second_angle = Integer.parseInt(cin.readLine());
        third_angle = 180 - (first_angle + second_angle);
        System.out.println("The third angle of a triangle is: " + third_angle);
    }
}
