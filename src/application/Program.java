package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] mat = new int[n][m];
		
		for (int i = 0; i<mat.length; i++) {
			for(int j = 0; j<mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("-----------------------------------------");
		System.out.print("Main Diagonal: ");
		int aux = 0; 
		if(mat.length >= mat[1].length) {
			aux = mat[1].length;
		} else {
			aux = mat.length;
		}
		for (int i = 0; i<aux; i++) {
				System.out.print(mat[i][i] + ", ");
		}
		
		System.out.println();
		System.out.println("-----------------------------------------");
		int count = 0;
		for (int i = 0; i<mat.length; i++) {
			for(int j = 0; j<mat[i].length; j++) {
				if(mat[i][j] < 0 ) {
					count++;
				}
			}
		}
		System.out.println ("Negative Numbers = " + count);
		
		System.out.println("-----------------------------------------");
				int number = sc.nextInt();
		for (int i = 0; i<mat.length; i++) {
			for(int j = 0; j<mat[i].length; j++) {
				if(mat[i][j] == number) {
					System.out.println("Position " + i + ", " + j + ":");
					if(j>0) {
						System.out.println("Left: " + mat[i][j-1]);
					}
					if(j<mat[i].length-1) {
						System.out.println("Right: " + mat[i][j+1]);
					}
					if(i>0) {
						System.out.println("Up: " + mat[i-1][j]);
					}
					if(i<mat.length-1) {
						System.out.println("Down: " + mat[i+1][j]);
					}
				}				
			}
		}
		sc.close();
	}

}
