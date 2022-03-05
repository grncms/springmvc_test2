	package com.junefw.infra.modules.member;

	public class Member {
		
		private String ifmmSeq = "";
		private String ifmmId = "";
		private String ifmmName= "";
		private String ifmmPassword = "";
		private String ifmmChildrenNum = "";
		private Integer ifmmDelNy;
	//------------
		 @Override
		public String toString() {
			// TODO Auto-generated method stub
			return this.ifmmId + this.ifmmName;
		}
		
		public String getIfmmSeq() {
			return ifmmSeq;
		}
		public String getIfmmPassword() {
			return ifmmPassword;
		}
		public void setIfmmPassword(String ifmmPassword) {
			this.ifmmPassword = ifmmPassword;
		}
		public void setIfmmSeq(String ifmmSeq) {
			this.ifmmSeq = ifmmSeq;
		}
		public String getIfmmId() {
			return ifmmId;
		}
		public void setIfmmId(String ifmmId) {
			this.ifmmId = ifmmId;
		}
		public String getIfmmName() {
			return ifmmName;
		}
		public void setIfmmName(String ifmmName) {
			this.ifmmName = ifmmName;
		}
		public Integer getIfmmDelNy() {
			return ifmmDelNy;
		}
		public void setIfmmDelNy(Integer ifmmDelNy) {
			this.ifmmDelNy = ifmmDelNy;
		}

		public String getIfmmChildrenNum() {
			return ifmmChildrenNum;
		}

		public void setIfmmChildrenNum(String ifmmChildrenNum) {
			this.ifmmChildrenNum = ifmmChildrenNum;
		}
		
		
	}
