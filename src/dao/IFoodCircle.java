package dao;

import java.util.List;

import domain.Recipe;

public interface IFoodCircle {
	Recipe getPersonalOneRecipe(int uid,String rName);
	List getPersonalRecipe();
	List getConcernedRecipe(int uid);
	boolean addOneComment(String comment);
	List getAllComment(int uid,String rName);
	
}
