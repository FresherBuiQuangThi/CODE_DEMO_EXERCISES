package com.daoImpl;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.dao.StudentDao;
import com.entities.Students;

@Repository
@Transactional
public class StudentDaoImpl implements StudentDao {

	
	@Autowired
	SessionFactory session;
	
	public List<Students> list() {
		// TODO Auto-generated method stub
		return session.getCurrentSession().createQuery("from Students").list();
	}

	public boolean delete(Students students) {
		// TODO Auto-generated method stub
		try{
			session.getCurrentSession().delete(students);
		}
		catch(Exception ex){
			return false;
		}
		return true;
	}

	public boolean saveOrUpdate(Students students) {
		// TODO Auto-generated method stub
		session.getCurrentSession().saveOrUpdate(students);
		return true;
	}
}
