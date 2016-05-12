package action;

import java.util.List;
import java.util.Map;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import service.impl.FoodCircleService;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;

import domain.Concern;
import domain.Recipe;
import domain.User;
import action.RecipeAction;

public class FoodCircleAction implements Action{
	private int uid;
	private String rName;
	private String comment;
	private String state;
	private FoodCircleService foodCircleService;
	private String objectStr;
	private String listStr;


	
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getrName() {
		return rName;
	}
	public void setrName(String rName) {
		this.rName = rName;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public FoodCircleService getFoodCircleService() {
		return foodCircleService;
	}
	public void setFoodCircleService(FoodCircleService foodCircleService) {
		this.foodCircleService = foodCircleService;
	}
	public String getObjectStr() {
		return objectStr;
	}
	public void setObjectStr(String objectStr) {
		this.objectStr = objectStr;
	}
	
	
	
	public JSONObject recipeToJson(Recipe re){
		JSONObject jsonObject = new JSONObject();
		
		jsonObject.put("rid", re.getRid());
		jsonObject.put("uid", re.getUid());
		jsonObject.put("uid", re.getUid());
		jsonObject.put("rname",re.getRname());
		jsonObject.put("content",re.getContent());
		jsonObject.put("pic",re.getPic());
		jsonObject.put("uptime",re.getUptime());
		jsonObject.put("season",re.getSeason());
		jsonObject.put("cuisine",re.getCuisine());
		jsonObject.put("info",re.getInfo());
		jsonObject.put("aid",re.getAid());
		jsonObject.put("isAudit",re.getIsAudit());
		jsonObject.put("auditResult",re.getAuditResult());
		jsonObject.put("auditTime",re.getAuditTime());
		return jsonObject;
	}
	/*
	功能：返回个人上传的单个菜谱
	参数：用户id，菜名
	返回值：菜谱类，包含菜谱详细信息
	*/

	String getRecipe(int uid,String rName)
	{
		
		Recipe re = foodCircleService.getRecipe(uid, rName);
		setObjectStr(recipeToJson(re).toString());
		return SUCCESS;
	}
	/*
	功能：返回个人上传菜谱列表
	参数：无参数
	返回值：个人上传菜谱列表
	*/
	String personalRecipe(){
		JSONArray jsons=new JSONArray();
		List<Recipe> recipeList = foodCircleService.personalRecipe();
		for (int i=0; i<recipeList.size();i++)
		{
			jsons.add(recipeToJson(recipeList.get(i)));
		}
		return SUCCESS;
	}
	/*
	功能：返回已关注用户上传菜谱列表
	参数：用户id
	返回值：已关注用户上传菜谱列表
	*/
	String RecipeConcerned()
	{
		JSONArray jsons=new JSONArray();
		List<Recipe> recipeConcerned = foodCircleService.RecipeConcerned(uid);
		for (int i=0; i<recipeConcerned.size();i++)
		{
			jsons.add(recipeToJson(recipeConcerned.get(i)));
		}
		return SUCCESS;
	}
	/*
	功能：添加评论
	参数：评论字符串
	返回值：添加评论是否成功，“true”代表成功，“false”代表失败
	*/
	String addComment()
	{
		System.out.print("comment");
		if (foodCircleService.addComment(comment))
		{
			setState("successed");
		}
		else {
			setState("failed");
		}
		return SUCCESS;
	}

	/*
	功能：获取评论
	参数：用户id，菜名
	返回值：用户评论列表
	*/
	String getCommentList()
	{
		System.out.print("uid"+"rName");
		List commentList= foodCircleService.getComment(uid, rName);
		JSONArray jsons=new JSONArray();
		for (int i=0; i<commentList.size();i++)
		{
			jsons.add(commentList.get(i));
		}
		return SUCCESS;
	}

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	public String getListStr() {
		return listStr;
	}
	public void setListStr(String listStr) {
		this.listStr = listStr;
	}

	
}
