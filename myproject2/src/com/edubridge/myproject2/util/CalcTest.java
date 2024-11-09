package com.edubridge.myproject2.util;

import com.edubridge.myproject1.util.Calc;

public class CalcTest {
	public static void main(String[] args) {
		int square = Calc.findSquare(10);
		int cube = Calc.findCube(10);
		
		System.out.println(square);
		System.out.println(cube);
	}
}