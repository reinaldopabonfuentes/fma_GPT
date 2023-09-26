package com.rpf.gpt.fma.repository;

import com.rpf.gpt.fma.entity.Income;
import org.springframework.data.repository.CrudRepository;

public interface IncomeRepository extends CrudRepository<Income, Long> {
    // Additional custom query methods can be defined here if needed
}
