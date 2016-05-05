package dao;
/**
 * @author LiDongdong
 * */
import java.util.List;

import domain.User;

public interface IUserDao {
	/**
	 * @功能：登录
	 * @param：用户名，密码
	 * @return：用户登录是否成功，“true”代表成功，“false”代表失败
	 * */
    public User login(String name, String passwd);
    /**
     * @功能：注册
     * @param：用户名，密码
     * @return：注册是否成功，“true”代表成功，“false”代表失败
     * */
    public Boolean register(String name, String passwd);
    /**
     * @功能: 上传
     * @param:用户id，菜名，制作方法，图片地址
     * @return：上传是否成功，“true”代表成功，“false”代表失败
     * */
    public Boolean upLoad( int uid, String rName,String content,String picUrl);
    /**
     * @功能：添加关注
     * @param：用户uid1，被关注用户uid2
     * @return：添加关注是否成功，“true”代表成功，“false”代表失败
     * */
    public Boolean addConcern(int uid1, int uid2);
    /**
     * @功能：取消关注
     * @param:用户uid1，被关注用户uid2
     * @return:取消关注是否成功，“true”代表成功，“false”代表失败 
     * */
    public Boolean cancelConcern(int uid1, int uid2);
    /**
     * @功能：查询未审核菜谱
     * @param:无
     * @return:未审核菜谱列表
     * */
    public List unCheckList();
    /**
     * @功能：菜谱审核
     * @param:无
     * @return:审核返回结果，“true”代表成功，“false”代表失败
     * */
    public Boolean check(int rid);
}
