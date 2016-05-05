package dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;

import dao.IUserDao;
import domain.User;

public class UserDao implements IUserDao {
	private SessionFactory sessionFactory;
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public User login(String name, String passwd) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public Boolean register(String name, String passwd) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean upLoad(int uid, String rName, String content,
			String picUrl) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean addConcern(int uid1, int uid2) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean cancelConcern(int uid1, int uid2) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List unCheckList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean check(int rid) {
		// TODO Auto-generated method stub
		return null;
	}


}
