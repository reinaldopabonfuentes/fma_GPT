package com.rpf.gpt.fma.repository;

import com.rpf.gpt.fma.entity.Budget;
import org.springframework.data.repository.CrudRepository;

public interface BudgetRepository extends CrudRepository<Budget, Long> {
    // Additional custom query methods can be defined here if needed
}
