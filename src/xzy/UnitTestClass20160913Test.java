package xzy;


import java.io.FileNotFoundException;

import org.easymock.EasyMock;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import doctest.UnitTestClass20160913;

/**
 * 针对类UnitTestClass20160913 的单元测试，利用Mock.
 * UnitTestClass20160913 调用TestInterface 接口，就是在相当于不了解TestInterface接口实现的情况下，即使还没有类对其进行实现，，
 * 给TestInterface 赋值一个虚拟实现对象，设定特定值，进而测试类UnitTestClass20160913。
 * 利用EasyMock.
 * @author xuzhiyou
 *
 */
public class UnitTestClass20160913Test {

	//testInterface 用于后续对TestInterface 对象虚拟赋值。
	public EasyMockTestInerface easyMockTestInerface;
	
	//unitTestClass 验证UnitTestClass20160913类，即验证其中的方法等。
	UnitTestClass20160913 unitTestClass;
	HighArray highArray;
	//在執行下面的test()方法前執行,test()方法名可隨意.
	@Before
	public void setUp() throws Exception {
		System.out.println("Set Up:");
		
		unitTestClass = new UnitTestClass20160913();
		//获取TestInterface接口虚拟对象，即Mock接口/Mock对象
		easyMockTestInerface = EasyMock.createMock(EasyMockTestInerface.class);
	}

	/**
	 * 测试.
	 * @throws FileNotFoundException
	 * @author xuzhiyou
	 * @data 2016年9月13日 下午4:39:38
	 */
	@Test
	public void test() throws FileNotFoundException {
		
		

		//设置接口中doctest_In_1方法，解释为：对于输入"b"，希望其返回"a"，并且希望执行2次。(有返回值的方法)
		EasyMock.expect(easyMockTestInerface.doctest_In_1("b")).andReturn("a").times(2);
		//同上，解释为：对于输入任何字符串(或EasyMock.isA(String.class))，希望输出"fff"，可执行任意次数，也可不加。
		EasyMock.expect(easyMockTestInerface.getString(EasyMock.anyString())).andReturn("fff").anyTimes();
		//void类型方法，参数可为任何字符串。
		easyMockTestInerface.doctest_In_2(EasyMock.anyObject(String.class));
//		EasyMock.expectLastCall().anyTimes();
	
		//将Mock接口切换到replay状态.
		EasyMock.replay(easyMockTestInerface);
		
		//给其内的成员testInterface赋值.
		unitTestClass.setTestInterface(easyMockTestInerface);
		
		//调用方法，测试.
		unitTestClass.unitTest2("xxx");
		unitTestClass.unitTest3("d");
		
		String string = unitTestClass.unitTest1("b");
		String expString = "1_ba";
		
		//验证调用方法得到的结果string 与自己期望的结果expString是否相等。
		Assert.assertEquals(string, expString);
		//这是doctest_In_1方法第二次执行，因为上面设置了times(2)，因此必须有两次执行，否则会报错。
		Assert.assertEquals("a", easyMockTestInerface.doctest_In_1("b"));
		
		//验证Mock的行为,即验证Mock对象被调用即使用次数.
		EasyMock.verify(easyMockTestInerface);
		
	}
	
	//测试方法2.
	@Test
	public void test2(){
		System.out.println("Test2");  
		double[] value = {1,2,3};
		double[] realValue = {1,1};
		
		EasyMock.expect(easyMockTestInerface.getNum(EasyMock.anyInt())).andReturn(2);
		
//		EasyMock.expect(easyMockTestInerface.getArrays(value)).andReturn(realValue);
//		EasyMock.expect(easyMockTestInerface.getArrays(EasyMock.aryEq(value))).andReturn(realValue);
		EasyMock.expect(easyMockTestInerface.getArrays(EasyMock.isA(double[].class))).andReturn(realValue);
		
		EasyMock.replay(easyMockTestInerface);
		
		unitTestClass.setTestInterface(easyMockTestInerface);
		Assert.assertEquals(2, unitTestClass.getNums(1));
		Assert.assertEquals(realValue, unitTestClass.getArrays(value));
//		Assert.assertArrayEquals(realValue, unitTestClass.getArrays(value),0);
		
		EasyMock.verify(easyMockTestInerface);
	}
	
	
	@Test
	public void testClass(){
		
		//mock具体类对象，得添加 objenesis  jar包
		highArray = EasyMock.createMock(HighArray.class);

		EasyMock.expect(highArray.find(2)).andReturn(true);
		EasyMock.replay(highArray);

		Assert.assertEquals(true, highArray.find(2));
		EasyMock.verify(highArray);
	}
	
	
	
	//在测试方法执行完后执行.
	 @After 
    public void tearDown() throws Exception {  
        System.out.println("Tear down");  
    }  

	 
	 
//	   3. 记录void 方法的行为
//     Easymock.expect(userDao.getById("1001")) 这样的用法只能使用与mock对象的有返回值的方法，如果mock对象的方法是void，则需要使用expectLastCall()：
//     userDao.someVoidMethod();
//     Easymock.expectLastCall();
//     和Easymock.expect(***)一样，同样支持指定调用次数，抛出异常等：
//     Easymock.expectLastCall().times(3);
//     Easymock.expectLastCall().andThrow(new RuntimeException("some error"));
	 
//	 如果需要在相对复杂的测试用例中使用多个 Mock 对象，EasyMock 提供了另外一种生成和管理 Mock 对象的机制：
//	 IMocksControl control = EasyMock.createControl();
//	 java.sql.Connection mockConnection = control.createMock(Connection.class);
//	 java.sql.Statement mockStatement = control.createMock(Statement.class);
//	 java.sql.ResultSet mockResultSet = control.createMock(ResultSet.class);
//	 EasyMock 类的 createControl 方法能创建一个接口 IMocksControl 的对象，该对象能创建并管理多个 Mock 对象。
//	 如果需要在测试中使用多个 Mock 对象，我们推荐您使用这一机制，因为它在多个 Mock 对象的管理上提供了相对便捷的方法。
//	 如果 Mock 对象是通过 IMocksControl 接口提供的 createMock 方法生成的（第1节中介绍的第二种Mock对象生成方法），
//	 那么您依旧可以通过 IMocksControl 接口对它所创建的所有 Mock 对象进行切换：
//	 control.replay();
//	 以上的语句能将在第1节中生成的 mockConnection、mockStatement 和 mockResultSet 等3个 Mock 对象都切换成 Replay 状态。
//	 如果Mock对象是有 IMocksControl 接口所提供的 createMock 方法生成的，那么采用该接口提供的 verify 方法，例如第1节中的 IMocksControl 实例 control：
//	 control.verify();
//	 将对 control 实例所生成的 Mock 对象 mockConnection、mockStatement 和 mockResultSet 等进行验证
//	 
	 
//	 如果您要模拟的是一个具体类而非接口，那么您需要下载扩展包 EasyMock Class Extension 2.2.2。在对具体类进行模拟时，
//	 您只要用 org.easymock.classextension.EasyMock 类中的静态方法代替 org.easymock.EasyMock 类中的静态方法即可。
	 
	 
	 
	 //http://blog.csdn.net/vking_wang/article/details/9170979
	 //http://macrochen.iteye.com/blog/298032
	 
}
