package com.mohit.library.studentlibrary.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mohit.library.studentlibrary.services.TransactionService;

@RestController
public class TransactionController {

	@Autowired
	TransactionService transactionService;
	
	@PostMapping("/issueBook")
	public ResponseEntity issueBook(@RequestParam("cardId") int cardId, @RequestParam("bookId") int bookId) throws Exception {
		String externalTransactionId = transactionService.issueBook(cardId, bookId);
		return new ResponseEntity<>("transaction completed, here is your transactionId - " + externalTransactionId, HttpStatus.CREATED);
	}
	
	@PostMapping("/returnBook")
	public ResponseEntity returnBook(@RequestParam("cardId") int cardId, @RequestParam("bookId") int bookId) throws Exception {
		String externalTransactionId = transactionService.returnBook(cardId, bookId);
		return new ResponseEntity<>("transaction completed, here is your transactionId - " + externalTransactionId, HttpStatus.CREATED);
	}
}
