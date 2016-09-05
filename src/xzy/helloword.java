package xzy;


public class helloword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello world!");
		
		
		int a=3, b=5;
		/*a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("a="+a+"  b="+b);*/
		
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println("a="+a+"  b="+b);
		
		int c;
		c=b<<2;
		System.out.println("b<<2="+c);
		
		System.out.println("args[0]: " + args[0]);   //在Run Configurations 下选中对应的类的 arguments 填入参数，空格隔开，即可使用args[0]等


		System.out.println(4/2*3);
		

	}
	


}
