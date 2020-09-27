package br.com.guifr.CodeChef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class UncleJohny {
	
	private String link = "https://www.codechef.com/problems/JOHNY";
	
	private static Scanner sc = new Scanner(System.in);
	
	private static BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[] args) throws IOException {
		
		int numberTest = sc.nextInt();
		
		
		while(numberTest-- > 0) {
			
			int numberSongs = sc.nextInt();
			
			
			int[] listSongs = new int[numberSongs];
			for (int i = 0; i < numberSongs; i++) {
				listSongs[i] = sc.nextInt();
			}
			
			int positionSongUncleJonny = sc.nextInt();

			
			int songUncleJonny = listSongs[positionSongUncleJonny-1];
			
			System.out.println(findSongUncleJonny(listSongs,songUncleJonny));
			
			
		}
		
	}
	
	public static int findSongUncleJonny(int[] songs, int songUncleJonny) {
		
		 Arrays.sort(songs);
		
		for (int i = 0; i < songs.length; i++) {
			if(Integer.valueOf(songs[i]) == songUncleJonny ) {
				return i+1;
			}
		}
		
		return -1;
	}

}
