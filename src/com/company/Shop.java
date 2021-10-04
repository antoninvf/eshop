package com.company;

import java.util.ArrayList;

public class Shop {

    private String name;
    private ArrayList<Product> productList = new ArrayList<>();
    private int sales;
    private int allStockCost;

    public Shop(String name) {
        this.name = name;
    }

    public void addToStock(Product product) {
        productList.add(product);
        allStockCost += product.getPrice();
        System.out.println("[" + product.getName() + "] added to stock (Price: " + product.getPrice() + ")");
    }

    public void sell(Product product) {
        productList.remove(product);
        allStockCost -= product.getPrice();
        sales += product.getPrice();
        System.out.println("Sold [" + product.getName() + "] for " + product.getName());
    }

    public void checkAllStockCost() {
        System.out.println("Current cost of all stock: " + getAllStockCost());
    }

    public void checkSales() {
        System.out.println("Today's sales: " + getSales());
    }

    public int getAllStockCost() {
        return allStockCost;
    }

    public int getSales() {
        return sales;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
