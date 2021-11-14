package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class RandomNumber {

	public static void main(String[] args) {
		Scanner ui = new Scanner(System.in);
		Random rnd = new Random(500);
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for (int i = 0; i < 500; i++) {
			int num = rnd.nextInt(500)+1;
			list.add(num);
		}
		
		Collections.sort(list);
		System.out.println(list);
		System.out.println("Which smallest number would you like to see?");	
		int userinput = ui.nextInt()-1;
		int lowestnum = list.get(userinput);
		System.out.println(lowestnum);		
		System.out.println("Have a good day!");
	}

}
