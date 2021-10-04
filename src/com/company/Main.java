package com.company;

public class Main {

    public static void main(String[] args) {

        Shop czc = new Shop("czc"); // originalita, víte co

        Product iphone13_128gb = new Product("iPhone 13 128GB", 22990, "Nová generace iPhone, 128GB Úložiště");
        Product iphone13_512gb = new Product("iPhone 13 512GB", 32190, "Nová generace iPhone, 512GB Úložiště");
        Product iphone13promax_1tb = new Product("iPhone 13 Pro Max 1TB", 47390, "Nová generace iPhone, Pro Max verze, 1TB Úložiště");
        // neptejte se proč prodávaj jenom iphony

        czc.addToStock(iphone13_128gb);
        czc.addToStock(iphone13_512gb);
        czc.addToStock(iphone13promax_1tb);

        czc.checkAllStockCost();
        czc.checkSales();

        czc.sell(iphone13_512gb);

        czc.checkAllStockCost();
        czc.checkSales();

    }
}
