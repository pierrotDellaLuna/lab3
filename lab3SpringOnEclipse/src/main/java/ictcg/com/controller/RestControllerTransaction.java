package ictcg.com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ictcg.com.entities.TransactionFinance;
import ictcg.com.service.TransactionFinanceService;

@RestController
@RequestMapping("/date")
public class RestControllerTransaction {
	
	@Autowired
	TransactionFinanceService service ;
	
	//TODO use camile case for names of endpoints (getDate)
	//Add parameter isUS if it true send response as am/pm
	@GetMapping("/getdate")
	public TransactionFinance getdate() {
		return service.getFirstTransaction();
		
		
	}

}
