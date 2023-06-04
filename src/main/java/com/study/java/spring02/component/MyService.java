package com.study.java.spring02.component;

public class MyService {
	private MyDao myDao; // 필
	
	// setter 메소드
	// myDao 프로퍼티 
	public void setMyDao(MyDao myDao) {
		this.myDao = myDao;
	}


	public void service() {
		System.out.println("MyService.service()");
		// myDao를 주입하지 않았다면 NullPointerException 발생
		myDao.get();
	}
}
