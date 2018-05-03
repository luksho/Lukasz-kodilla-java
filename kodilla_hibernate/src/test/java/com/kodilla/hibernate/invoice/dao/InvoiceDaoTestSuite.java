package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest

public class InvoiceDaoTestSuite {
    @Autowired
    private ProductDao productDao;
    @Autowired
    private InvoiceDao invoiceDao;


    @Test
    public void testInvoiceDaoSave() {
        //Given
        Product product1 = new Product("Pants");
        Product product2 = new Product("T-shirt");

        Item item1 = new Item(new BigDecimal(22.50), 2, new BigDecimal(1.0));
        Item item2 = new Item(new BigDecimal(55.55), 4, new BigDecimal(1.0));

        product1.getItem().add(item1);
        product2.getItem().add(item2);

        productDao.save(product1);
        int idP1 = product1.getId();
        productDao.save(product2);
        int idP2 = product2.getId();

        item1.setProduct(product1);
        item2.setProduct(product2);

        Invoice invoice = new Invoice("FV_1_05_2018");

        invoice.getItems().add(item1);
        invoice.getItems().add(item2);

        item1.setInvoice(invoice);
        item2.setInvoice(invoice);

        //When
        invoiceDao.save(invoice);

        //Then
        int id = invoice.getId();
        Assert.assertEquals(id, invoiceDao.findOne(id).getId());

        //Clean
        invoiceDao.delete(id);
        productDao.delete(idP1);
        productDao.delete(idP2);
    }
}