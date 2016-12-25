package io.rai.service;

import io.rai.entity.Customer;
import io.rai.model.CustomerDraft;
import io.rai.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by rai on 16/12/25.
 */
@Service
public class CustomerService {
  @Autowired
  private CustomerRepository repository;

  public Customer createCustomer(CustomerDraft draft) {
    Customer customer = new Customer();
    customer.setName(draft.getName());
    customer.setAge(draft.getAge());
    Customer savedCustomer = repository.save(customer);
    return savedCustomer;
  }

  public Customer getCustomer(int id) {
    return repository.findOne(id);
  }

  public List<Customer> getAllCustomer() {
    return repository.findAll();
  }
}
