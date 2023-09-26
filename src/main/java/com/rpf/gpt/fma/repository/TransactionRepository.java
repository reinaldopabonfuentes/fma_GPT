package com.rpf.gpt.fma.repository;

import com.rpf.gpt.fma.entity.Transaction;
import org.springframework.data.repository.CrudRepository;

public interface TransactionRepository extends CrudRepository<Transaction, Long> {
    // Additional custom query methods can be defined here if needed
}
