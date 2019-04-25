package com.cg.BankSpringDatabase.service;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.RequestBody;

import com.cg.BankSpringDatabase.model.CustomerDetails;

public interface UserEntryService {
	public CustomerDetails register(@RequestBody CustomerDetails cd);

	public int login(CustomerDetails c);
}
