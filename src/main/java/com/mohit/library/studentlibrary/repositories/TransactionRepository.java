package com.mohit.library.studentlibrary.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.mohit.library.studentlibrary.models.Transaction;
import com.mohit.library.studentlibrary.models.TransactionStatus;

public interface TransactionRepository extends JpaRepository<Transaction, Integer>{

	// sort on the basis of time to get the latest issual date
	// here we are considering no re-issue
	@Query("select t from Transaction t where t.card.id  =:cardId and t.book.id =:bookId and t.isIssueOperation =:isIssue and t.transactionStatus =:status")
	public List<Transaction> find(int cardId, int bookId, TransactionStatus status, boolean isIssue);
}
