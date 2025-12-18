package com.tnsif.oops.encapsulation;

public class OopsConceptDemo {
	    private int serialNum;
		private String name;
		private int age;
		
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		//Gzetter and Setter method
		public int getSerialNum() {
			return serialNum;
		}
		public void setSerialNum(int serialNum) {
			this.serialNum = serialNum;
			
		}
		@Override
		public String toString() {
			return "OopsConceptDemo [Serial Number ="+serialNum+","+"Name=" +name+","+"Age="+age+"]";
		}
	

//	public static void main(String[] args) {
//		
//		
//		// TODO Auto-generated method stub
//
//	}

}
