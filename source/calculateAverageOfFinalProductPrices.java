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
public class calculateAverageOfFinalProductPrices {
    static final double VAT = 0.2;
    public static void main (String[] args) throws java.io.IOException {
        java.io.BufferedReader cin = new java.io.BufferedReader (new java.io.InputStreamReader(System.in));
        double p1_price_before_tax, p2_price_before_tax, p3_price_before_tax, p1_vat_amount, p2_vat_amount, p3_vat_amount, p1_price_after_tax, p2_price_after_tax, p3_price_after_tax,average; 
        System.out.print("Enter the before-tax price of product one: ");
        p1_price_before_tax = Double.parseDouble(cin.readLine());
        System.out.print("Enter the before-tax price of product two: ");
        p2_price_before_tax = Double.parseDouble(cin.readLine());
        System.out.print("Enter the before-tax price of product three: ");
        p3_price_before_tax = Double.parseDouble(cin.readLine());
        p1_vat_amount = p1_price_before_tax * VAT;
        p2_vat_amount = p2_price_before_tax * VAT;
        p3_vat_amount = p3_price_before_tax * VAT;
        p1_price_after_tax = p1_price_before_tax + p1_vat_amount;
        p2_price_after_tax = p2_price_before_tax + p2_vat_amount;
        p3_price_after_tax = p3_price_before_tax + p3_vat_amount;
        average = (p1_price_after_tax + p2_price_after_tax + p3_price_after_tax)/3;
        System.out.println("The final after tax price for product 1 is " +p1_price_after_tax);
        System.out.println("The final after tax price for product 2 is " +p2_price_after_tax);
        System.out.println("The final after tax price for product 3 is " +p3_price_after_tax);
        System.out.println("The average of three final product prices are " +average);
    
    }
    
}
