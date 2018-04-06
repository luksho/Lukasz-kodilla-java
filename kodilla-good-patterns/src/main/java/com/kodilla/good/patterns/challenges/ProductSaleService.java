package com.kodilla.good.patterns.challenges;

public class ProductSaleService implements SaleService {
    public boolean sell(Product product, User user, int amount) {
        if (product == null) {
            System.out.println("Product unavailable");
            return false;
        } else {
            System.out.println("Product- " + product.getName() + " Sold to- " + user + " Amount- " + amount + " Total Price- " + product.getPrice() * amount);
            return true;
        }

    }
}