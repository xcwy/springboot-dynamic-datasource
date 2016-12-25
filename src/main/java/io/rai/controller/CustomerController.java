package io.rai.controller;

import io.rai.entity.Customer;
import io.rai.model.CustomerDraft;
import io.rai.service.CustomerService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * Created by rai on 16/12/25.
 */
@RestController
public class CustomerController {
  @Autowired
  private CustomerService service;

  @ApiOperation("create customer")
  @PostMapping("/customers")
  public Customer createCustomer(@RequestBody
                                 @ApiParam(value = "Customer Draft", required = true)
                                 @Valid CustomerDraft draft) {
    return service.createCustomer(draft);
  }
}
