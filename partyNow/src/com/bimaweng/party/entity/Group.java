package com.bimaweng.party.entity;

import java.util.Date;

/**
 * @desc 
 * @author knight Wang
 * @Date 2013-7-1
 */
public class Group {
	
//	`group_id` INT NOT NULL AUTO_INCREMENT ,
	private int groupId;
//	  `name` VARCHAR(45) NOT NULL ,
	private String name;
//	  `description` VARCHAR(45) NULL ,
	private String description;
//	  `is_erased` INT NULL DEFAULT 0 COMMENT '是否注销：\n0 - 未注销\n1- 已注销' ,
	private int isErased;
//	  `erased_time` DATETIME NULL ,
	private Date erasedTime;
//	  `erase_people` VARCHAR(45) NULL ,
	private String erasePeople;
//	  `country` VARCHAR(45) NULL COMMENT '国家\n' ,
	private String country;
//	  `province` VARCHAR(45) NULL COMMENT '省\n' ,
	private String province;
//	  `city` VARCHAR(45) NULL COMMENT '市\n' ,
	private String city;
//	  `district` VARCHAR(45) NULL COMMENT '区县\n' ,
	private String district;
//	  `school` VARCHAR(45) NULL COMMENT '学校' ,
	private String school;
//	  `entry_year` INT NULL COMMENT '入学年份' ,
	private int entryYear;
//	  `major` VARCHAR(45) NULL COMMENT '专业' ,
	private String major;
//	  `class` VARCHAR(45) NULL COMMENT '班名' ,
	private String className;
//	  `department` VARCHAR(45) NULL COMMENT '学院、系别' ,
	private String department;
//	  `group_type` INT NULL COMMENT '0-同学\n1-同好(相同爱好的社会群体)' ,
	private String groupType;
//	  `tags` VARCHAR(45) NULL COMMENT '标签，如羽毛球爱好者' ,
	private String tags;
//	  `creator_id` VARCHAR(45) NOT NULL COMMENT '创建者' ,
	private String creatorId;
//	  `create_time` DATETIME NOT NULL COMMENT '创建时间' ,
	private String createTime;
//	  `parent_id` INT NULL COMMENT '父圈子，如通工四班是通工四班深圳组与通工四班北京组的父圈子' ,
	private String parentId;
	public int getGroupId() {
		return groupId;
	}
	public void setGroupId(int groupId) {
		this.groupId = groupId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getIsErased() {
		return isErased;
	}
	public void setIsErased(int isErased) {
		this.isErased = isErased;
	}
	public Date getErasedTime() {
		return erasedTime;
	}
	public void setErasedTime(Date erasedTime) {
		this.erasedTime = erasedTime;
	}
	public String getErasePeople() {
		return erasePeople;
	}
	public void setErasePeople(String erasePeople) {
		this.erasePeople = erasePeople;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	public int getEntryYear() {
		return entryYear;
	}
	public void setEntryYear(int entryYear) {
		this.entryYear = entryYear;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getGroupType() {
		return groupType;
	}
	public void setGroupType(String groupType) {
		this.groupType = groupType;
	}
	public String getTags() {
		return tags;
	}
	public void setTags(String tags) {
		this.tags = tags;
	}
	public String getCreatorId() {
		return creatorId;
	}
	public void setCreatorId(String creatorId) {
		this.creatorId = creatorId;
	}
	public String getCreateTime() {
		return createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	public String getParentId() {
		return parentId;
	}
	public void setParentId(String parentId) {
		this.parentId = parentId;
	}
	@Override
	public String toString() {
		return "Group [groupId=" + groupId + ", name=" + name
				+ ", description=" + description + ", isErased=" + isErased
				+ ", erasedTime=" + erasedTime + ", erasePeople=" + erasePeople
				+ ", country=" + country + ", province=" + province + ", city="
				+ city + ", district=" + district + ", school=" + school
				+ ", entryYear=" + entryYear + ", major=" + major
				+ ", className=" + className + ", department=" + department
				+ ", groupType=" + groupType + ", tags=" + tags
				+ ", creatorId=" + creatorId + ", createTime=" + createTime
				+ ", parentId=" + parentId + "]";
	}
	
	
	
}

