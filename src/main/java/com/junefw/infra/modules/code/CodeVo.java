	package com.junefw.infra.modules.code;

	public class CodeVo {
// ----- Vo infrCodeGroup
		private String ifcgSeq;
		
//		infrCodeGroup Search
		private String shIfcgName;
		private Integer shIfcgDelNy;
		
// ----- Vo infrCodeGroup
		private String ifcdSeq;
		
//		infrCode Search
		private String shIfcgSeq;
		
//		common
		private String shOption;
		private String shValue;
		
//		paging
		private Integer rowNumToShow;
		private Integer startRnumForMysql;
		
		// ----------
		
		public String getIfcgSeq() {
			return ifcgSeq;
		}
		public void setIfcgSeq(String ifcgSeq) {
			this.ifcgSeq = ifcgSeq;
		}
		public String getShIfcgName() {
			return shIfcgName;
		}
		public void setShIfcgName(String shIfcgName) {
			this.shIfcgName = shIfcgName;
		}
		public Integer getShIfcgDelNy() {
			return shIfcgDelNy;
		}
		public void setShIfcgDelNy(Integer shIfcgDelNy) {
			this.shIfcgDelNy = shIfcgDelNy;
		}
		public String getIfcdSeq() {
			return ifcdSeq;
		}
		public void setIfcdSeq(String ifcdSeq) {
			this.ifcdSeq = ifcdSeq;
		}
		public String getShIfcgSeq() {
			return shIfcgSeq;
		}
		public void setShIfcgSeq(String shIfcgSeq) {
			this.shIfcgSeq = shIfcgSeq;
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
		public Integer getRowNumToShow() {
			return rowNumToShow;
		}
		public void setRowNumToShow(Integer rowNumToShow) {
			this.rowNumToShow = rowNumToShow;
		}
		public Integer getStartRnumForMysql() {
			return startRnumForMysql;
		}
		public void setStartRnumForMysql(Integer startRnumForMysql) {
			this.startRnumForMysql = startRnumForMysql;
		}
		
		
		
	}
