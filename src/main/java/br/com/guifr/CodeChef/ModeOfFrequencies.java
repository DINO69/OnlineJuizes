package br.com.guifr.CodeChef;

import java.util.Arrays;
import java.util.Scanner;

import java.util.*;
import java.lang.*;
import java.io.*;

public class ModeOfFrequencies {
//class Codechef{
	
	private String linkProblem = "https://www.codechef.com/problems/MODEFREQ";

	public static void main(String[] args) throws java.lang.Exception {
		
		Scanner in = new Scanner(System.in);
		
		int amountTest = in.nextInt();
		
		for (int i = 0; i <amountTest; i++) {
			
			int amountNumber = in.nextInt();
			
			int[] arrayNumbers = new int[amountNumber];
			
			long ini = System.currentTimeMillis();
			for (int j = 0; j < amountNumber; j++) {
				arrayNumbers[j] = in.nextInt();
			}
			long fim = System.currentTimeMillis();
			System.out.println(fim-ini);
			
			
			System.out.println(findMode(arrayNumbers));
			
		}

	}
	
	public static int findMode(int[] arrayNumbers) {
		
		int[] modeFrequence = new int[arrayNumbers.length + 1];
		
		Arrays.sort(arrayNumbers);
		
		int number = arrayNumbers[0];
				
		int amountFrequence = 0;
		
		int max = Integer.MIN_VALUE;
		
		for (int i : arrayNumbers) {
			
			if(i == number) {
				
				amountFrequence++;
				
			}else {
				
				modeFrequence[amountFrequence]++;
				
				if(modeFrequence[amountFrequence] > max) {
					max = modeFrequence[amountFrequence];
				}
				
				amountFrequence=1;
			}
			
			number = i;
			
		}
		
		modeFrequence[amountFrequence]++;
		
		if(modeFrequence[amountFrequence] > max) {
			max = modeFrequence[amountFrequence];
		}
		
		int findMode = max;
		for (int i = 1; i < modeFrequence.length; i++) {
			if (modeFrequence[i] == max) {
				findMode = i;
				break;
			}
		}
		
		return findMode;
		
	}
	
	public static void printArray(int[] arrayNumbers) {
		
		for (int i : arrayNumbers) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

}
