package com.rpf.gpt.fma.repository;

import com.rpf.gpt.fma.entity.Expense;
import org.springframework.data.repository.CrudRepository;

public interface ExpenseRepository extends CrudRepository<Expense, Long> {
    // Additional custom query methods can be defined here if needed
}
