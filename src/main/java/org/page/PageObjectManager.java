package org.page;

public class PageObjectManager {

	private Pom1 p1;
	private Pom2 p2;
	private Pom3 p3;
	private Pom4 p4;
	
	public Pom1 getInstancepom1() {

		return p1=new Pom1();
		
	}
	public Pom2 getInstancepom2() {

		return p2=new Pom2();
	}
	
	
	public Pom3 getInstancepom3() {

		return p3=new Pom3();
	}
	
	public Pom4 getInstancepom4() {

		return p4=new Pom4();
	}
	
}
