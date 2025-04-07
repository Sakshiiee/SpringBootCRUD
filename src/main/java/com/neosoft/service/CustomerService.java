package com.neosoft.service;

import com.neosoft.entities.Customer;
import java.util.List;



public interface CustomerService {

//    save
    public Customer saveCustomer(Customer customer);

//    get
    public  Customer getCustomer(int id);

//    update
    public Customer updateCustomer(Customer  customer);

//    delete
    public void deleteCustomer(int id);

    //getall

    public List<Customer> getAllCustomers();


}
