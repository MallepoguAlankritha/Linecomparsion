package com.Alankritha;

import java.util.Scanner;

public class Linecomparsion {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the values:");
		double x1 = scan.nextDouble();
		double x2 = scan.nextDouble();
		double y1 = scan.nextDouble();
		double y2 = scan.nextDouble();
	    double a1 = scan.nextDouble();
	    double a2 = scan.nextDouble();
		double b1 = scan.nextDouble();
		double b2 = scan.nextDouble();
		
		double len1 = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
		double len2 = Math.sqrt((a2 - a1) * (a2 - a1) + (b2 - b1) * (b2 - b1));
		
		System.out.println("length is:" + len1);
		System.out.println("length is:" + len2);
		double compare = Double.compare(len1, len2);
		if (compare==0) {
			System.out.println("len1s are equal");
		} else {
			System.out.println("both lines are not equal");
		}
		}
	}
	
