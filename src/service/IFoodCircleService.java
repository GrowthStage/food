package service;

import java.util.List;

import domain.Recipe;

public interface IFoodCircleService {
	Recipe getRecipe(int uid,String rName);
	/*
	功能：返回个人上传的单个菜谱
	参数：用户id，菜名
	返回值：菜谱类，包含菜谱详细信息
	*/
	List personalRecipe();
	/*
	功能：返回个人上传菜谱列表
	参数：无参数
	返回值：个人上传菜谱列表
	*/
	List RecipeConcerned(int uid);
	/*
	功能：返回已关注用户上传菜谱列表
	参数：用户id
	返回值：已关注用户上传菜谱列表
	*/
	boolean addComment(String comment);
	/*
	功能：添加评论
	参数：评论字符串
	返回值：添加评论是否成功，“true”代表成功，“false”代表失败
	*/
	List getComment(int uid, String rName);
	/*
	功能：获取评论
	参数：用户id，菜名
	返回值：用户评论列表
	*/
}
