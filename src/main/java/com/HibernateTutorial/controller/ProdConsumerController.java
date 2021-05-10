package com.HibernateTutorial.controller;

import com.HibernateTutorial.dao.ProdConsumerDao;
import com.HibernateTutorial.domain.relation.Customer;
import com.HibernateTutorial.domain.relation.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProdConsumerController {

    @Autowired
    ProdConsumerDao prodConsumerDao;

    @GetMapping("/consumer")
    public void getConsumer()
    {
        System.out.println("Inside Consumer get method");
        prodConsumerDao.getConsumer();
    }

    @GetMapping("/consumer/{cid}")
    public Customer getConsumerId(@PathVariable("cid") int id)
    {
        System.out.println("Inside Congumer get bY ID");
        return prodConsumerDao.getConsumerByID(id);
    }

    @GetMapping("/product/{pid}")
    public Product getProductById(@PathVariable("pid") int id)
    {
        System.out.println("Inside Producer get bY ID");
        return prodConsumerDao.getProductByID(id);
    }

    @PostMapping("/consumer")
    public void saveConsumer(@RequestBody Customer cusObj)
    {
        System.out.println("Inside Customer save method");
         prodConsumerDao.saveConsumer(cusObj);
    }

    @GetMapping("/consumerMTM")
    public void getConsumerMTM()
    {
        System.out.println("Inside ConsumerMTM get method");
        prodConsumerDao.getConsumerMTM();
    }






}
