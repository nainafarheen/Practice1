import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;

public class RandomNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Approach 1 Random
		Random rand=new Random();
		int rand_int=rand.nextInt(10);
		System.out.println(rand_int);
		double rand_double=rand.nextDouble(100);
		System.out.println(rand_double);
		
		//Approach 2 Math class
		System.out.println(Math.random()*101);
		
		//Approach 3 Apache Commons Lang API
		String randNum=RandomStringUtils.randomNumeric(10);
		System.out.println(randNum);
	}

}
