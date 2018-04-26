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
public class calculateBeforeTaxPrice {
    public static void main (String[] args) throws java.io.IOException {
        java.io.BufferedReader cin = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
        double price_before_tax, vat, price_after_tax;
        System.out.print("Enter after-tax price: ");
        price_after_tax = Double.parseDouble(cin.readLine());
        vat = price_after_tax * 0.2 ;
        price_before_tax = price_after_tax - vat;
        System.out.println("The price before-tax is " +price_before_tax);
    }
    
}
