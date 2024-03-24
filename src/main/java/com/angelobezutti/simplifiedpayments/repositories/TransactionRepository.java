package com.angelobezutti.simplifiedpayments.repositories;

import com.angelobezutti.simplifiedpayments.domain.transaction.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
}
