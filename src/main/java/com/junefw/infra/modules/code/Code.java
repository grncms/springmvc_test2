	package com.junefw.infra.modules.code;

import org.springframework.web.multipart.MultipartFile;

public class Code {
// ----- DTO infrCodeGroup
		private String ifcgSeq;
		private String ifcgName;
		private String ifcgNameEng;
		private Integer ifcgDelNy;
		
//------ infrCode
		private String ifcdSeq;
		private String ifcdName;
		private String ifcdDelNy;
//		private String ifcgSeq;
		
		
		//for upload
		public MultipartFile file;
		public MultipartFile file1;
		
		//for cache		
		/* public static List<Code> cacheCodeArrayList = new ArrayList<code>(); */

		public String getIfcgSeq() {
			return ifcgSeq;
		}

		public void setIfcgSeq(String ifcgSeq) {
			this.ifcgSeq = ifcgSeq;
		}

		public String getIfcgName() {
			return ifcgName;
		}

		public void setIfcgName(String ifcgName) {
			this.ifcgName = ifcgName;
		}

		public String getIfcgNameEng() {
			return ifcgNameEng;
		}

		public void setIfcgNameEng(String ifcgNameEng) {
			this.ifcgNameEng = ifcgNameEng;
		}

		public Integer getIfcgDelNy() {
			return ifcgDelNy;
		}

		public void setIfcgDelNy(Integer ifcgDelNy) {
			this.ifcgDelNy = ifcgDelNy;
		}

		public String getIfcdSeq() {
			return ifcdSeq;
		}

		public void setIfcdSeq(String ifcdSeq) {
			this.ifcdSeq = ifcdSeq;
		}

		public String getIfcdName() {
			return ifcdName;
		}

		public void setIfcdName(String ifcdName) {
			this.ifcdName = ifcdName;
		}

		public String getIfcdDelNy() {
			return ifcdDelNy;
		}

		public void setIfcdDelNy(String ifcdDelNy) {
			this.ifcdDelNy = ifcdDelNy;
		}

		public MultipartFile getFile() {
			return file;
		}

		public void setFile(MultipartFile file) {
			this.file = file;
		}

		public MultipartFile getFile1() {
			return file1;
		}

		public void setFile1(MultipartFile file1) {
			this.file1 = file1;
		}

		/*
		 * public static List<Code> getCacheCodeArrayList() { return cacheCodeArrayList;
		 * }
		 * 
		 * public static void setCacheCodeArrayList(List<Code> cacheCodeArrayList) {
		 * Code.cacheCodeArrayList = cacheCodeArrayList; }
		 */
		
		
		//---------------	
		/*
		 * public String getIfcgSeq() { return ifcgSeq; } public void setIfcgSeq(String
		 * ifcgSeq) { this.ifcgSeq = ifcgSeq; } public String getIfcgName() { return
		 * ifcgName; } public void setIfcgName(String ifcgName) { this.ifcgName =
		 * ifcgName; } public String getIfcgNameEng() { return ifcgNameEng; } public
		 * void setIfcgNameEng(String ifcgNameEng) { this.ifcgNameEng = ifcgNameEng; }
		 * public Integer getIfcgDelNy() { return ifcgDelNy; } public void
		 * setIfcgDelNy(Integer ifcgDelNy) { this.ifcgDelNy = ifcgDelNy; } public String
		 * getIfcdSeq() { return ifcdSeq; } public void setIfcdSeq(String ifcdSeq) {
		 * this.ifcdSeq = ifcdSeq; } public String getIfcdName() { return ifcdName; }
		 * public void setIfcdName(String ifcdName) { this.ifcdName = ifcdName; } public
		 * String getIfcdDelNy() { return ifcdDelNy; } public void setIfcdDelNy(String
		 * ifcdDelNy) { this.ifcdDelNy = ifcdDelNy; } public MultipartFile getFile() {
		 * return file; } public void setFile(MultipartFile file) { this.file = file; }
		 * public MultipartFile getFile1() { return file1; } public void
		 * setFile1(MultipartFile file1) { this.file1 = file1; } public static
		 * List<Code> getCacheCodeArrayList() { return cacheCodeArrayList; } public
		 * static void setCacheCodeArrayList(List<Code> cacheCodeArrayList) {
		 * Code.cacheCodeArrayList = cacheCodeArrayList; }
		 */
		
			
		
		//------------

		
	}
