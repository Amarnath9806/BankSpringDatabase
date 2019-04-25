package com.cg.BankSpringDatabase.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cg.BankSpringDatabase.dao.UserEntryDao;
import com.cg.BankSpringDatabase.model.CustomerDetails;

@Transactional
@Service("bankService")
public class UserEntryServiceImpl implements UserEntryService {

	@Autowired
	UserEntryDao bankDao;
	public CustomerDetails register(CustomerDetails cd) {
		// TODO Auto-generated method stub
		return bankDao.register(cd);
	}
	public int login(CustomerDetails c) {
		// TODO Auto-generated method stub
		return bankDao.login(c);
	}


}
