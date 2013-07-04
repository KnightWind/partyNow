package com.bimaweng.party.entity;

import java.util.Date;

/**
 * @desc 
 * @author knight Wang
 * @Date 2013-7-1
 */
public class Party {
	
		private int partyId;
		private String name;
		private String description; //活动描述
		private String creator; //发起人
		private Date crateTime;
		private Date startTime;
		private Date endTime; //结束时间
		private float budget; //预算金额（每人）
		private int status;
		private int receiveSuccessCount;
		private int receiveFailedCount;
		private int isErased;
		private Date erasedTime;
		private int erasePeople;
		private String country;
		private String province;
		private String city;
		private String detailAddress;
		private int groupId;
		
		public int getPartyId() {
			return partyId;
		}
		public void setPartyId(int partyId) {
			this.partyId = partyId;
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
		public String getCreator() {
			return creator;
		}
		public void setCreator(String creator) {
			this.creator = creator;
		}
		public Date getCrateTime() {
			return crateTime;
		}
		public void setCrateTime(Date crateTime) {
			this.crateTime = crateTime;
		}
		public Date getStartTime() {
			return startTime;
		}
		public void setStartTime(Date startTime) {
			this.startTime = startTime;
		}
		public Date getEndTime() {
			return endTime;
		}
		public void setEndTime(Date endTime) {
			this.endTime = endTime;
		}
		public float getBudget() {
			return budget;
		}
		public void setBudget(float budget) {
			this.budget = budget;
		}
		public int getStatus() {
			return status;
		}
		public void setStatus(int status) {
			this.status = status;
		}
		public int getReceiveSuccessCount() {
			return receiveSuccessCount;
		}
		public void setReceiveSuccessCount(int receiveSuccessCount) {
			this.receiveSuccessCount = receiveSuccessCount;
		}
		public int getReceiveFailedCount() {
			return receiveFailedCount;
		}
		public void setReceiveFailedCount(int receiveFailedCount) {
			this.receiveFailedCount = receiveFailedCount;
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
		public int getErasePeople() {
			return erasePeople;
		}
		public void setErasePeople(int erasePeople) {
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
		public String getDetailAddress() {
			return detailAddress;
		}
		public void setDetailAddress(String detailAddress) {
			this.detailAddress = detailAddress;
		}
		public int getGroupId() {
			return groupId;
		}
		public void setGroupId(int groupId) {
			this.groupId = groupId;
		}
		
		@Override
		public String toString() {
			return "Party [partyId=" + partyId + ", name=" + name
					+ ", description=" + description + ", creator=" + creator
					+ ", crateTime=" + crateTime + ", startTime=" + startTime
					+ ", endTime=" + endTime + ", budget=" + budget
					+ ", status=" + status + ", receiveSuccessCount="
					+ receiveSuccessCount + ", receiveFailedCount="
					+ receiveFailedCount + ", isErased=" + isErased
					+ ", erasedTime=" + erasedTime + ", erasePeople="
					+ erasePeople + ", country=" + country + ", province="
					+ province + ", city=" + city + ", detailAddress="
					+ detailAddress + ", groupId=" + groupId + "]";
		}
		
		
		
	
}

