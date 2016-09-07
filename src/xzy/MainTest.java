package xzy;

import java.io.IOException;

public class MainTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		HighArray harr=new HighArray(20);
		harr.insert(77);harr.insert(99);harr.insert(44);harr.insert(55);harr.insert(22);
		harr.insert(88);harr.insert(11);harr.insert(00);harr.insert(66);harr.insert(33);
		harr.show();
		int value=35;
//		if(harr.find(35))
//			System.out.println("found "+value);
//		else
//			System.out.println("not found "+value);
		harr.delete(55);
		harr.delete(00);
		harr.delete(99);
		harr.delete(34);
		harr.show();
	}

}
