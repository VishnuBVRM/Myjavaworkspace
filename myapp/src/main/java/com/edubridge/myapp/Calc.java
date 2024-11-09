package com.edubridge.myapp;

import javax.swing.event.InternalFrameEvent;

public class Calc {
	
	public Calc () {
		System.out.println("Calc object is created.");
	}
	public int findSquare(int num){
		return num * num;
	}
	
	public int findCube(int num) {
		return num * num * num;
	}
}
