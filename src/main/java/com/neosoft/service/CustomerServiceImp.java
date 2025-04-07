package com.neosoft.service;

import com.neosoft.entities.Customer;
import com.neosoft.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImp implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;


//    save
    @Override
    public Customer saveCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public Customer getCustomer(int id) {
         Customer customer = customerRepository.findById(id);
        return customer;
    }

    @Override
    public Customer updateCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public void deleteCustomer(int id) {
        customerRepository.deleteById(id);
    }

    @Override
    public List<Customer> getAllCustomers(Integer pageNumber, Integer pageSize) {

        Pageable p= PageRequest.of(pageNumber, pageSize);
       Page<Customer> c= this.customerRepository.findAll(p);
      List<Customer> list1= c.getContent();
      return list1;

    }


}
