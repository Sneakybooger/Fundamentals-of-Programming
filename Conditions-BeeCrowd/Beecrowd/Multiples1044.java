package LabActivitySeclectionInJAVA;

import java.util.Scanner;

public class Multiples1044 {

	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
	       
	       int a = sc.nextInt();
	       int b = sc.nextInt();
	       
	       if(b % a == 0 || a % b == 0) {   
	           System.out.println("Sao Multiplos");
	       }
	       else {
	           System.out.println("Nao sao Multiplos");
	       }
	       
	}

}
