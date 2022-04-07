	package com.junefw.infra.modules.member;

	public class MemberVo {

		private String ifmmSeq;

		//---- infrMember Search
		
		private String shIfmmSeq;
		
		private String shOption;
		private String shValue;
		
		private String shIfmmName;
		private Integer shIfmmDelNy;
		
		
		
		//		-------
		public String getIfmmSeq() {
			return ifmmSeq;
		}

		public void setIfmmSeq(String ifmmSeq) {
			this.ifmmSeq = ifmmSeq;
		}

		public String getShIfmmSeq() {
			return shIfmmSeq;
		}

		public void setShIfmmSeq(String shIfmmSeq) {
			this.shIfmmSeq = shIfmmSeq;
		}

		public String getShOption() {
			return shOption;
		}

		public void setShOption(String shOption) {
			this.shOption = shOption;
		}

		public String getShValue() {
			return shValue;
		}

		public void setShValue(String shValue) {
			this.shValue = shValue;
		}

		public String getShIfmmName() {
			return shIfmmName;
		}

		public void setShIfmmName(String shIfmmName) {
			this.shIfmmName = shIfmmName;
		}

		public Integer getShIfmmDelNy() {
			return shIfmmDelNy;
		}

		public void setShIfmmDelNy(Integer shIfmmDelNy) {
			this.shIfmmDelNy = shIfmmDelNy;
		}
		
		
	}
