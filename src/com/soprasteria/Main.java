package com.soprasteria;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Inserisci il mese di cui vuoi sapere i giorni.");
		String month = in.nextLine();
		if(month.equalsIgnoreCase("Novembre")||month.equalsIgnoreCase("Aprile")||month.equalsIgnoreCase("Giugno")||month.equalsIgnoreCase("Settembre")) {
			System.out.println("30");
		}
		else if(month.equalsIgnoreCase("Febbraio")) {
			System.out.println("28");
		}
		else {
			System.out.println("31");
		}
	}
}
