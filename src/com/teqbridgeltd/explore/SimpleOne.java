package com.teqbridgeltd.explore;

public class SimpleOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i=0; i<10; i++){
			System.out.println("Hello world" + i);
		}
	}
	
	public long computeAreaRectangle(long l, long b){
		
		return l * b;
	}

	public double computeAreaCircle( long r){
		double area = 22.0/7 * r * r;
		return Math.round(area);
	}
}
