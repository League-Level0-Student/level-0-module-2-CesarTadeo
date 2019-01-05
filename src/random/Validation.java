//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package random;

import java.util.Random;

public class Validation {
	public static void main(String[] args) {

		Random randomMaker = new Random();

		int randomNumber = randomMaker.nextInt(500);

		System.out.println(randomNumber);

		// 1. Use each value of randomNumber to give the user a random compliment.

		// 2. Repeat all the code above 10 times
		for (int i = 0; i < 10; i++) {
			randomNumber = randomMaker.nextInt(500);
			System.out.println(randomNumber);
		}
		// 3. Find someone to test out your program. They will like it :)
	}
}
