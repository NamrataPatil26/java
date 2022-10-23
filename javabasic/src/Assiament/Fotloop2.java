package Assiament;/** 1. count number of digits in an integer */ 

public class Fotloop2 {

public static void main(String[] args) {

    int count = 0, num = 12143456;

    for (; num != 0; num =num/ 10, ++count) {
    	 //++count;
    }

    System.out.println("Number of digits: " + count);
  }
	}


