package domain;

import java.sql.Timestamp;

/**
 * Recipe entity. @author MyEclipse Persistence Tools
 */

public class Recipe implements java.io.Serializable {

	// Fields

	private Integer rid;
	private Integer uid;
	private String rname;
	private String content;
	private String pic;
	private Timestamp uptime;
	private String season;
	private String cuisine;
	private String info;
	private Integer aid;
	private String isAudit;
	private Integer auditResult;
	private Timestamp auditTime;

	// Constructors

	/** default constructor */
	public Recipe() {
	}

	/** minimal constructor */
	public Recipe(Integer uid) {
		this.uid = uid;
	}

	/** full constructor */
	public Recipe(Integer uid, String rname, String content, String pic,
			Timestamp uptime, String season, String cuisine, String info,
			Integer aid, String isAudit, Integer auditResult,
			Timestamp auditTime) {
		this.uid = uid;
		this.rname = rname;
		this.content = content;
		this.pic = pic;
		this.uptime = uptime;
		this.season = season;
		this.cuisine = cuisine;
		this.info = info;
		this.aid = aid;
		this.isAudit = isAudit;
		this.auditResult = auditResult;
		this.auditTime = auditTime;
	}

	// Property accessors

	public Integer getRid() {
		return this.rid;
	}

	public void setRid(Integer rid) {
		this.rid = rid;
	}

	public Integer getUid() {
		return this.uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	public String getRname() {
		return this.rname;
	}

	public void setRname(String rname) {
		this.rname = rname;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getPic() {
		return this.pic;
	}

	public void setPic(String pic) {
		this.pic = pic;
	}

	public Timestamp getUptime() {
		return this.uptime;
	}

	public void setUptime(Timestamp uptime) {
		this.uptime = uptime;
	}

	public String getSeason() {
		return this.season;
	}

	public void setSeason(String season) {
		this.season = season;
	}

	public String getCuisine() {
		return this.cuisine;
	}

	public void setCuisine(String cuisine) {
		this.cuisine = cuisine;
	}

	public String getInfo() {
		return this.info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public Integer getAid() {
		return this.aid;
	}

	public void setAid(Integer aid) {
		this.aid = aid;
	}

	public String getIsAudit() {
		return this.isAudit;
	}

	public void setIsAudit(String isAudit) {
		this.isAudit = isAudit;
	}

	public Integer getAuditResult() {
		return this.auditResult;
	}

	public void setAuditResult(Integer auditResult) {
		this.auditResult = auditResult;
	}

	public Timestamp getAuditTime() {
		return this.auditTime;
	}

	public void setAuditTime(Timestamp auditTime) {
		this.auditTime = auditTime;
	}

}