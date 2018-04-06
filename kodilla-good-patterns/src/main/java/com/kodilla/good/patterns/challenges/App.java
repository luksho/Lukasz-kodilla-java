package com.kodilla.good.patterns.challenges;

public class App {
    public static void main(String[] args) {
        User Jan = new User("Jan", "Nowak");
        Product trousers = new Trousers("Black trousers", 24.99);
        ProductOrderService productOrderService = new ProductOrderService(new EmailService(), new ProductSaleService());

        productOrderService.process(Jan, trousers, 5);
    }
}
