package action;
/**
 * @author LiDongdong
 * */

import java.util.List;
import java.util.Map;

import service.impl.UserService;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;

import domain.User;

public class UserAction implements Action {
	private String name;//用户名
	private String passwd;//用户密码
	private int uid;//用户id
	private String picUrl;//上传路径
	private String rName;//上传菜名
	private String content;//上传菜的制作方法
	private String state;//操作成功与否  succeed-成功  failed-失败
	private int uid1;//被关注者id
	private int rid;//菜谱id
	public int getRid() {
		return rid;
	}
	public void setRid(int rid) {
		this.rid = rid;
	}
	private UserService userService;
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	public String getPicUrl() {
		return picUrl;
	}
	public void setPicUrl(String picUrl) {
		this.picUrl = picUrl;
	}
	public int getUid1() {
		return uid1;
	}
	public void setUid1(int uid1) {
		this.uid1 = uid1;
	}
	public String getrName() {
		return rName;
	}
	public void setrName(String rName) {
		this.rName = rName;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public UserService getUserService() {
		return userService;
	}
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	
	public String login()throws Exception{
		System.out.print(name+passwd);
		if(userService.login(name, passwd) == null){
			setState(0);
			setUid(0);
		}
		else{
			User user = (User)userService.login(name, passwd);
			setState(1);
			setUid(user.getId().getUid());
		}
		return SUCCESS;
	}
	public String register()throws Exception{
		System.out.print(name+passwd);
		if(userService.register(name, passwd)){
			setState(1);
		}
		else
			setState(0);
		return SUCCESS;
	}
	public String upLoad()throws Exception{
		System.out.print(uid+rName+content+picUrl);
		if(userService.upLoad(uid, rName, content, picUrl))
			setState(1);
		else
			setState(0);
		return SUCCESS;
	}
	public String addConcern()throws Exception{
		System.out.print(uid+uid1);
		if(userService.addConcern(uid, uid1))
			setState(1);
		else
			setState(0);
		return SUCCESS;
	}
	public String cancel()throws Exception{
		System.out.print(uid+uid1);
		if(userService.cancelConcern(uid, uid1))
			setState(1);
		else
			setState(0);
		return SUCCESS;
	}
	public String unCheckList()throws Exception{
		List unckeckList = userService.unCheckList();
		Map request = (Map)ActionContext.getContext().get("request");
		request.put("unckeckList", unckeckList);
		return SUCCESS;
	}
	public String check()throws Exception{
		System.out.print(rid);
		if(userService.check(rid))
			setState(1);
		else
			setState(0);
		return SUCCESS;
	}
}
