package com.rpf.gpt.fma.service;

import com.rpf.gpt.fma.entity.Transaction;
import com.rpf.gpt.fma.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TransactionService {

    private final TransactionRepository transactionRepository;

    @Autowired
    public TransactionService(TransactionRepository transactionRepository) {
        this.transactionRepository = transactionRepository;
    }

    public Iterable<Transaction> getAllTransactions() {
        return transactionRepository.findAll();
    }

    public Optional<Transaction> getTransactionById(Long id) {
        return transactionRepository.findById(id);
    }

    public Transaction createTransaction(Transaction transaction) {
        return transactionRepository.save(transaction);
    }

    public Transaction updateTransaction(Long id, Transaction updatedTransaction) {
        if (transactionRepository.existsById(id)) {
            updatedTransaction.setTransaction_id(id);
            return transactionRepository.save(updatedTransaction);
        }
        return null; // Handle error when the transaction with the given id does not exist
    }

    public void deleteTransaction(Long id) {
        transactionRepository.deleteById(id);
    }
}

