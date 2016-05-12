package service.impl;

import java.util.List;

import domain.Recipe;
import service.IFoodCircleService;
import dao.impl.FoodCircleDao;
public class FoodCircleService implements IFoodCircleService {
	private FoodCircleDao foodCircleDao;
	@Override
	public Recipe getRecipe(int uid, String rName) {
		// TODO Auto-generated method stub
		return foodCircleDao.getPersonalOneRecipe(uid,rName);
	}

	@Override
	public List personalRecipe() {
		// TODO Auto-generated method stub
		return foodCircleDao.getPersonalRecipe();
	}

	@Override
	public List RecipeConcerned(int uid) {
		// TODO Auto-generated method stub
		return foodCircleDao.getConcernedRecipe(uid);
	}

	@Override
	public boolean addComment(String comment) {
		// TODO Auto-generated method stub
		return foodCircleDao.addOneComment(comment);
	}

	@Override
	public List getComment(int uid, String rName) {
		// TODO Auto-generated method stub
		return foodCircleDao.getAllComment(uid,rName);
	}

}
