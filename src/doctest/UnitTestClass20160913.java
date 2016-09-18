package doctest;

import java.io.FileNotFoundException;

public class UnitTestClass20160913 {
	public  TestInterface testInterface;
	
	public String unitTest1(String string) {
		return "1_" + string + testInterface.doctest_In_1(string);
	}
	
	public void unitTest2(String lString) {
		testInterface.doctest_In_2(lString);
		System.out.println("2_" + lString);
	}
	
	public void unitTest3(String line) throws FileNotFoundException {
		System.out.println("3_" + testInterface.getString(line));
	}

	public TestInterface getTestInterface() {
		return testInterface;
	}

	public void setTestInterface(TestInterface testInterface) {
		this.testInterface = testInterface;
	}
	

}
