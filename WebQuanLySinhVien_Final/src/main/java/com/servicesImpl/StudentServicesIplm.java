package com.servicesImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.StudentDao;
import com.entities.Students;
import com.services.StudentServices;


@Service
public class StudentServicesIplm implements StudentServices {
	
	@Autowired
	StudentDao studentDao;
	public List<Students> list() {
		// TODO Auto-generated method stub
		return studentDao.list();
	}

	public boolean delete(Students students) {
		// TODO Auto-generated method stub
		return studentDao.delete(students);
	}

	public boolean saveOrUpdate(Students students) {
		// TODO Auto-generated method stub
		return studentDao.saveOrUpdate(students);
	}

	
}
