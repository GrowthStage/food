package action;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import java.sql.Timestamp;
import java.util.List;
import java.util.Map;

import service.impl.RecipeService;
import service.impl.UserService;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;

import domain.Recipe;
public class RecipeAction implements Action {
	private int uid;
	private String rName;
	private RecipeService recipeService;
	private String state;
	private String objectStr;
	
	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

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

	public RecipeService getRecipeService() {
		return recipeService;
	}

	public void setRecipeService(RecipeService recipeService) {
		this.recipeService = recipeService;
	}


	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	//将Recipe类型转换成JSONObject类型
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
	//返回系统提供的单个菜谱
	public String getRecipe() throws Exception {
		
		Recipe re = recipeService.getRecipe(rName);
		objectStr= recipeToJson(re).toString();
		return SUCCESS;
	}
	
	public String favorite() throws Exception {
		System.out.print(uid+rName);
		if(recipeService.favorite(uid, rName))
			setState("succeed");
		else
			setState("failed");
		return SUCCESS;
	}


}
