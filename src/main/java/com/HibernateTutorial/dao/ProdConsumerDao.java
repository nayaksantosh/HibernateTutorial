package com.HibernateTutorial.dao;

import com.HibernateTutorial.domain.relation.Customer;
import com.HibernateTutorial.domain.relation.CustomerManyToMany;
import com.HibernateTutorial.domain.relation.Product;
import com.HibernateTutorial.domain.relation.ProductManyToMany;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;

@Repository
public class ProdConsumerDao {

    @Autowired
    private EntityManager entityManager;

    public void getConsumer() {

        Session currentSession = entityManager.unwrap(Session.class);
        Transaction tx = currentSession.beginTransaction();

        Product product = new Product();
        product.setProName("Laptop");
        product.setConsID(21);

        Customer customer = new Customer();
        customer.setCusname("Ravi");
        customer.setProID(543);

       // product.setCustomer(customer);
        customer.setProduct(product);

        currentSession.save(customer);
        tx.commit();

    }

    public Customer getConsumerByID(int id) {
        Session currentSession = entityManager.unwrap(Session.class);
        return currentSession.get(Customer.class,new Integer(id));
    }

    public Product getProductByID(int id) {
        Session currentSession = entityManager.unwrap(Session.class);
        Product prod = currentSession.get(Product.class, new Integer(id));
        System.out.println("Product==>"+prod.getProName());
        System.out.println("Customer Name==>"+prod.getCustomer().getCusname());
        System.out.println("ProductId==>"+prod.getCustomer().getCusid());
        return prod;
    }

    public void saveConsumer(Customer cusObj) {
        Session currentSession = entityManager.unwrap(Session.class);
        System.out.println("Customer is saving.....");
        System.out.println("Customer Name==>"+cusObj.getCusname());
        System.out.println("ProductId==>"+cusObj.getProID());

        //Product pr = cusObj.getProduct();

        Transaction tx= currentSession.beginTransaction();
       // pr.setCustomer(cusObj);
       // cusObj.setProduct(pr);
        currentSession.save(cusObj);
        tx.commit();
    }

    public void getConsumerMTM() {
        Session currentSession = entityManager.unwrap(Session.class);
        Transaction tx = currentSession.beginTransaction();

        CustomerManyToMany cus1 = new CustomerManyToMany();
        cus1.setCusname("Mohit");
        cus1.setProID(532);

        CustomerManyToMany cus2 = new CustomerManyToMany();
        cus2.setCusname("Rohit");
        cus2.setProID(479);

        CustomerManyToMany cus3 = new CustomerManyToMany();
        cus2.setCusname("Ram");
        cus2.setProID(922);



        ProductManyToMany p1 = new ProductManyToMany();
        p1.setProName("Mobile");
        p1.setConsID(632);

        ProductManyToMany p2 = new ProductManyToMany();
        p2.setProName("Tab");
        p2.setConsID(654);

        ProductManyToMany p3 = new ProductManyToMany();
        p2.setProName("LapTop");
        p2.setConsID(564);


  /*      List<CustomerManyToMany> cu1 = new ArrayList<CustomerManyToMany>();
        cu1.add(cus1);
        cu1.add(cus2);
        p1.setCustomerManyToMany(cu1);

        List<CustomerManyToMany> cu2 = new ArrayList<CustomerManyToMany>();
        cu2.add(cus1);
        cu2.add(cus3);
        p2.setCustomerManyToMany(cu2);

        List<CustomerManyToMany> cu3 = new ArrayList<CustomerManyToMany>();
        cu3.add(cus2);
        cu3.add(cus3);
        p3.setCustomerManyToMany(cu3);*/


        List<ProductManyToMany> ls = new ArrayList<ProductManyToMany>();
        ls.add(p1);
        ls.add(p2);
        cus1.setProduct(ls);

    /*  List<ProductManyToMany> ls1 = new ArrayList<ProductManyToMany>();
        ls1.add(p2);
        ls1.add(p3);
        cus2.setProduct(ls1);

     /*   List<ProductManyToMany> ls2 = new ArrayList<ProductManyToMany>();
        ls2.add(p1);
        ls2.add(p3);
        cus2.setProduct(ls1);*/

      /*  currentSession.save(p1);
        currentSession.save(p2);
        currentSession.save(p3);*/

        currentSession.save(cus1);
        currentSession.save(cus2);
        currentSession.save(cus3);

        tx.commit();
    }
}
