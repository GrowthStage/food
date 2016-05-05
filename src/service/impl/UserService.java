package service.impl;

import java.util.List;

import dao.impl.UserDao;
import domain.User;
import service.IUserService;

public class UserService implements IUserService {
	private UserDao userDao; 

	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public User login(String name, String passwd) {
		// TODO Auto-generated method stub
		return userDao.login(name, passwd);
	}

	@Override
	public Boolean register(String name, String passwd) {
		// TODO Auto-generated method stub
		return userDao.register(name, passwd);
	}

	@Override
	public Boolean upLoad(int uid, String rName, String content,
			String picUrl) {
		// TODO Auto-generated method stub
		return userDao.upLoad(uid, rName, content, picUrl);
	}

	@Override
	public Boolean addConcern(int uid1, int uid2) {
		// TODO Auto-generated method stub
		return userDao.addConcern(uid1, uid2);
	}

	@Override
	public Boolean cancelConcern(int uid1, int uid2) {
		// TODO Auto-generated method stub
		return userDao.cancelConcern(uid1, uid2);
	}

	@Override
	public List unCheckList() {
		// TODO Auto-generated method stub
		return userDao.unCheckList();
	}

	@Override
	public Boolean check(int rid) {
		// TODO Auto-generated method stub
		return userDao.check(rid);
	}

}
