package xzy;

import java.util.ArrayList;
import java.util.List;

import doctest.Test;

public class FreeTest {

	public static void main(String[] args) {

		// int a=3, b=5;
		// a=a^b;
		// b=a^b;
		// a=a^b;
		// System.out.println("a="+a+" b="+b);
		// int c;
		// c=b<<2;
		// System.out.println("b<<2="+c);
		// System.out.println(4/2*3);

		List<String> list = new ArrayList<String>();
		list.add("x");
		list.add("z");
		list.add("y");
		System.out.println(list.get(list.size() - 1));

		List<String> largelList = new ArrayList<String>();
		largelList.add("a");
		largelList.addAll(list);

		for (int i = 0; i < largelList.size(); i++)
			System.out.print(largelList.get(i) + " ");

		Test test = new Test(12, "xzy");
		String string = test.doctest_In_1("xzy");

		ExtendsTest extendsTest = new ExtendsTest();
		HighArray highArray = extendsTest.getHighArray();
		System.out.println("HighArray-nums: " + highArray.getNums());

	}

}
