package service.impl;
import dao.impl.RecipeDao;
import domain.Recipe;
import service.*;

public class RecipeService implements IRecipeService{
	private RecipeDao recipeDao; 
	
	 public Recipe getRecipe(String rName){
	/* 功能：返回系统提供的单个菜谱
	 参数：菜名
	 返回值：菜谱类，包含菜谱详细信息
	 */
		 return recipeDao.getOneRecipe(rName);
	 }
	public boolean favorite(int uid,String rName){
		/*
	 功能：收藏平台菜谱
	 参数：用户id，菜名
	 返回值：收藏菜谱是否成功，“true”代表成功，“false”代表失败
	 */
		return recipeDao.addFavorite(uid,rName);
	}
}
