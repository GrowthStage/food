package domain;

/**
 * Steps entity. @author MyEclipse Persistence Tools
 */

public class Steps implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer rid;
	private Integer num;
	private String pic;
	private String content;

	// Constructors

	/** default constructor */
	public Steps() {
	}

	/** full constructor */
	public Steps(Integer rid, Integer num, String pic, String content) {
		this.rid = rid;
		this.num = num;
		this.pic = pic;
		this.content = content;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getRid() {
		return this.rid;
	}

	public void setRid(Integer rid) {
		this.rid = rid;
	}

	public Integer getNum() {
		return this.num;
	}

	public void setNum(Integer num) {
		this.num = num;
	}

	public String getPic() {
		return this.pic;
	}

	public void setPic(String pic) {
		this.pic = pic;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

}