package com.aurionpro.test;

import com.aurionpro.model.IRepository;
import com.aurionpro.model.Repository;

public class IRepositoryTest {
	public static void main(String[] args) {
		Repository repo = new Repository();
		repo.show();
		
		repo.defaultMethod();
		
		IRepository.display();
	}

}
