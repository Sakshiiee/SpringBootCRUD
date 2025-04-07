package com.neosoft.controller;

import com.neosoft.entities.Customer;
import com.neosoft.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @PostMapping("/save")
    public Customer saveCustomer(@RequestBody Customer customer){
        return customerService.saveCustomer(customer);
    }

    @GetMapping("/get/{id}")
    public  Customer getCustomer(@PathVariable int id){
        Customer customer = customerService.getCustomer(id);
        return  customer;
    }

    @PutMapping("/update")
    public Customer updateCustomer(@RequestBody Customer  customer){
        return  customerService.updateCustomer(customer);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteCustomer(@PathVariable int id){
        customerService.deleteCustomer(id);
    }


    //get all
    @GetMapping("/getall")
    public List<Customer> getAllCustomers() {
        return customerService.getAllCustomers();
    }


}
