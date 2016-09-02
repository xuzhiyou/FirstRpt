import java.util.Date;
import java.util.Random;

public class a {
	public static void main(String[] args){
		double num = 10;
		Random random = new Random(new Date().getTime());
		System.out.println("random: " + random);
		
		Random random2 = new Random(20);
		int i = random2.nextInt(100);
		int j = random2.nextInt(100);
		int z = random2.nextInt(100);
		System.out.println("random2:   " + "i: " + i + " j: " + j + " z: " + z);
		
		Random random3 = new Random(20);
		int i2 = random3.nextInt(100);
		int j2 = random3.nextInt(100);
		int z2 = random3.nextInt(100);
		System.out.println("random3:   " + "i: " + i2 + " j: " + j2 + " z: " + z2);
		

	}

}
