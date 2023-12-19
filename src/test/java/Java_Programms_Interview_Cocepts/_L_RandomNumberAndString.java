package Java_Programms_Interview_Cocepts;

import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;

public class _L_RandomNumberAndString {

	public static void main(String[] args) {
		
	// Approach 1 Using Random classs
		
		Random rand = new Random();
		int rand_num = rand.nextInt(1000);
		System.out.println(rand_num);
		
		double rand_dbl = rand.nextDouble();
		System.out.println(rand_dbl);
		
		// Approach 2 Usisng Math Class
		
		System.out.println(Math.random());
		
		//Approach 3 Apche common slang API 
		
		String randNum=RandomStringUtils.randomNumeric(10);
		System.out.println(randNum);
		
		String randAlpNum = RandomStringUtils.randomAlphanumeric(20);
		System.out.println(randAlpNum);
		
		String randAlphabets =RandomStringUtils.randomAlphabetic(10);
		System.out.println(randAlphabets);
	}
}
