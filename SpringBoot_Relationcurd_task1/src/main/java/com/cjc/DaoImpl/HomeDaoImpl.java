package com.cjc.DaoImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.cjc.DaoI.HomeDao;
import com.cjc.model.User;

@Repository
public class HomeDaoImpl implements HomeDao {
	
	@Autowired
	SessionFactory sf;


	@Override
	public int saveUser(User u) {
		Session ses=sf.openSession();
		Transaction tx = ses.beginTransaction();
		ses.saveOrUpdate(u);
		tx.commit();
		ses.close();
		
		return 1;
		
	}

}
