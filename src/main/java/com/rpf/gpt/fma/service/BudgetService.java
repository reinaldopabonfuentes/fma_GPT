package com.rpf.gpt.fma.service;

import com.rpf.gpt.fma.entity.Budget;
import com.rpf.gpt.fma.repository.BudgetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BudgetService {

    private final BudgetRepository budgetRepository;

    @Autowired
    public BudgetService(BudgetRepository budgetRepository) {
        this.budgetRepository = budgetRepository;
    }

    public Iterable<Budget> getAllBudgets() {
        return budgetRepository.findAll();
    }

    public Optional<Budget> getBudgetById(Long id) {
        return budgetRepository.findById(id);
    }

    public Budget createBudget(Budget budget) {
        return budgetRepository.save(budget);
    }

    public Budget updateBudget(Long id, Budget updatedBudget) {
        if (budgetRepository.existsById(id)) {
            updatedBudget.setBudget_id(id);
            return budgetRepository.save(updatedBudget);
        }
        return null; // Handle error when the budget with the given id does not exist
    }

    public void deleteBudget(Long id) {
        budgetRepository.deleteById(id);
    }
}
