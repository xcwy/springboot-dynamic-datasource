package io.rai.repository;

import io.rai.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by rai on 16/12/25.
 */
public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}
