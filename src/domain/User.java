package domain;

/**
 * User entity. @author MyEclipse Persistence Tools
 */

public class User implements java.io.Serializable {

	// Fields

	private UserId id;
	private String passwd;
	private Integer type;
	private String head;

	// Constructors

	/** default constructor */
	public User() {
	}

	/** minimal constructor */
	public User(UserId id) {
		this.id = id;
	}

	/** full constructor */
	public User(UserId id, String passwd, Integer type, String head) {
		this.id = id;
		this.passwd = passwd;
		this.type = type;
		this.head = head;
	}

	// Property accessors

	public UserId getId() {
		return this.id;
	}

	public void setId(UserId id) {
		this.id = id;
	}

	public String getPasswd() {
		return this.passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	public Integer getType() {
		return this.type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public String getHead() {
		return this.head;
	}

	public void setHead(String head) {
		this.head = head;
	}

}