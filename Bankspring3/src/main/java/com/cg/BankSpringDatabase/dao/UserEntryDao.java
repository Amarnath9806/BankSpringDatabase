package com.cg.BankSpringDatabase.dao;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.RequestBody;

import com.cg.BankSpringDatabase.model.CustomerDetails;

public interface UserEntryDao {
	public CustomerDetails register(@RequestBody CustomerDetails cd);
	public int login(CustomerDetails c);
}
