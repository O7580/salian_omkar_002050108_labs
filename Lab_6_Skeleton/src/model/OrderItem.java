/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author omkarsalian
 */
public class OrderItem {
    
    Product product;
    double salesPrice;
    int quantity;

    public OrderItem(Product product, double salesPrice, int quantity) {
        this.product = product;
        this.salesPrice = salesPrice;
        this.quantity = quantity;
    }
    
    
}
