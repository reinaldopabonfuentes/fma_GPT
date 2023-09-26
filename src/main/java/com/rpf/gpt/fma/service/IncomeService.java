package com.rpf.gpt.fma.service;

import com.rpf.gpt.fma.entity.Income;
import com.rpf.gpt.fma.repository.IncomeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class IncomeService {

    private final IncomeRepository incomeRepository;

    @Autowired
    public IncomeService(IncomeRepository incomeRepository) {
        this.incomeRepository = incomeRepository;
    }

    public Iterable<Income> getAllIncomes() {
        return incomeRepository.findAll();
    }

    public Optional<Income> getIncomeById(Long id) {
        return incomeRepository.findById(id);
    }

    public Income createIncome(Income income) {
        return incomeRepository.save(income);
    }

    public Income updateIncome(Long id, Income updatedIncome) {
        if (incomeRepository.existsById(id)) {
            updatedIncome.setIncome_id(id);
            return incomeRepository.save(updatedIncome);
        }
        return null; // Handle error when the income record with the given id does not exist
    }

    public void deleteIncome(Long id) {
        incomeRepository.deleteById(id);
    }
}
