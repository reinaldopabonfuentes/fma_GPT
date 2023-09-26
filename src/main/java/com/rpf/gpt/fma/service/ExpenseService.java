package com.rpf.gpt.fma.service;

import com.rpf.gpt.fma.entity.Expense;
import com.rpf.gpt.fma.repository.ExpenseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ExpenseService {

    private final ExpenseRepository expenseRepository;

    @Autowired
    public ExpenseService(ExpenseRepository expenseRepository) {
        this.expenseRepository = expenseRepository;
    }

    public Iterable<Expense> getAllExpenses() {
        return expenseRepository.findAll();
    }

    public Optional<Expense> getExpenseById(Long id) {
        return expenseRepository.findById(id);
    }

    public Expense createExpense(Expense expense) {
        return expenseRepository.save(expense);
    }

    public Expense updateExpense(Long id, Expense updatedExpense) {
        if (expenseRepository.existsById(id)) {
            updatedExpense.setExpense_id(id);
            return expenseRepository.save(updatedExpense);
        }
        return null; // Handle error when the expense with the given id does not exist
    }

    public void deleteExpense(Long id) {
        expenseRepository.deleteById(id);
    }
}
