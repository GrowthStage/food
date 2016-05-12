package dao;

import domain.Recipe;

public interface IRecipeDao {
	Recipe getOneRecipe(String rName);
	boolean  addFavorite(int uid,String rName);
}
