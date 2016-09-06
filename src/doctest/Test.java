package doctest;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import xzy.*;

/**
* Description:
* <br> 这是一个测试 类
* 创建时间 2016-09-02
* this is a test
* @author xuzhiyou
* @author x z y
* @author xzy--xzy2--xzy3
* @version 1.0
* See the <a href="{@docRoot}/../testDoc/overview-tree.html">Copyright</a>.<br>
*/
public class Test extends HighArray implements TestInterface{
	
	/**
	* 对象成员，private:password
	*/
	private int password;
	
	/**
	* 公有成员：public:name
	*/
	public String name;
	protected String sex = "men";
	
	/**
	 * the num is 20
	 * HighArray.VALUE:{@value xzy.HighArray#VALUE}
	 */
	public static int num = 20;
	
	/**
	 * distances of point (x,y)
	 */
	public int x, y;
	
	/**
	 * value只能在常亮中使用
	 * static final: {@value}  
	 * static ID: {@value #ID}
	 */
	public static final double ID = 12345678;

	/**
	* 构造函数.参数为password与 name
	* @param password int类型，密码
	* @param name String类型，姓名
	*
	*/
	public Test(int password ,String name){
		this.password = password;
		this.name = name;
	}
	

	/**
	* 方法：设置姓名. <br>
	* {@code Map<Strting, Double>}   code-map  <br>
	* {@literal Map<Strting, Double>}  literal-map <br>
	* {@code Map<Strting, Double>}   code-map  <br>
	* test &#10    &# <br>
	* {@literal &#10    &#}<br>
	* #  $  %  ^  *   {  }  @   
	* @param name String类型，姓名
	* 查看下面三个的区别：
	* 此方法与{@link HighArray#find(long)} 中某一方法作用相同111；
	* 此方法与{@link HighArray#find(long) find} 中某一方法作用相同111-2；
	* 此方法与{@linkplain HighArray#find(long)} 中某一方法作用相同222；
	* 此方法与{@linkplain HighArray#find(long) find} 中某一方法作用相同222-2；
	* 此方法与{@linkplain String#equals} 中某一方法作用相同333；
	* 此方法与{@linkplain String#equals(Object)} 中某一方法作用相同333-2；
	                此方    法与 HighArray#find(long) 中某一方法作用相同333；
	* 
	* 
	* 我们查看1: @see #getName()
	* 我们查看1: @see {@link #getName()}
	* @see #getName()
	* @see #getName() {@link #getName()}
	* @see #getName()         <br>前面
	* @see #getName() getName1  @see #getName() getName4
	* @see #getName() getName2   前面
	* @see #getName() getName3 <br>前面
    * @see String
    * @see String#equals
    * @see String#equals(Object) bbbbb
    * @see String#equals(Object)
    * @see #getName() getName4
    * @see xzy.HighArray#insert(long)
    * @see HighArray#find(long)
    * @see HighArray
    * @see HighArray#find
    * @see xzy.MainTest#main(String[])
    * 
    * code test:
    * {@code List<String>}   code-list
    * {@literal Map<Strting, Double>}  literal-map
	*/
	public void setName(String name){
		this.name = name;
	}

	/**
	* 方法：获取名称
	* @return 返回姓名 name
	*/
	public String getName(){
		return name;
	}
	
	/**
	 * 重写 HighArray 类中的delete方法：
	 * @param value 标记继承-Test
	 * @return {@inheritDoc}
	 * @see #getName()
	 * @see "JAVA 设计思想"
	 * @see <a href="spec.html#section">Java Spec</a>
	 * @exception IOException exception-Test
	 * @throws FileNotFoundException file-exception-Test
	 */
	@Override
	public boolean delete(long value) throws IOException, FileNotFoundException{
		return true;
	}
	
	/**
	 * 重写 HighArray 类中的find方法：
	 * @param num find the number
	 * @param n find the n 多余的
	 */
	public boolean find(long num){
		return true;
	}

	
	@Override
	/**
	 * this method contains override
	 * @param string input a string
	 */
	public String doctest_In_1(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * this method no override.
	 * implements interface
	 * @param line the inputtttttt
	 */
	public void doctest_In_2(String line) {
		// TODO Auto-generated method stub
		
	}
	
	/**
	 * comments-Test {@inheritDoc}
	 * @param line input-Test 
	 */
	public String getString(String line) throws FileNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	/**
	 * the method override object method-Test
	 * @return nothing-Test
	 */
	public String toString() {
		return "";
	}
	
	/**
	 * seTest-Test
     * @serial include
     */
	public void seTest(){
		
	}
	
	/**
	 * type parameter-Test
	 * @param highRrary parameter-Test
	 */
	public void typePara(HighArray highRrary){
		
	}

	
	/**
	 * type parameter-test 类型参数与一般参数
	 * @param string the string to be converted-Test
	 * @param type the type to convert the string to-Test
	 * @param <T>     the type of the element
     * @param <V>     the value of the elemen
	 * @return nothing-Test
	 */
	public <T, V extends T> V convert(String string, Class<T> type) {
		return null;
    }
	
	/**
	 * two parameter test
	 * @param s1 the first parameter
	 */
	public void twoPara(String s1,String s2){
		
	}
	
	
	
	
	
	/**
	 * 抛出异常
	 * @param file file-path
	 * @exception IOException test-exception
	 * @throws IOException when read file the exception would be occur 后一个会警告
	 * @return a string line
	 */
	public String firstLine(String file) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new FileReader(new File(file)));
		String line = bufferedReader.readLine();
		return line;
	}

	
	/**
	 * Save the state of this object to a stream.
     *
     * @serialData serialData-test 不知道如何用，此处无显示，可以用来修饰方法，但 serial、 serialField 不可以。
	 */
	public void output(){}
	
	/**
	 * native-method-test
	 * @return nothing
	 */
	public native static double getPassword();
	
	/**
	 * synchronized-test
	 * @return nothing
	 * @throws IOException there-nothing
	 */
	public static int get() throws IOException{
		synchronized (Test.class) {
			return 0;
		}
	}
	
	
	protected void dispaly(String str){

		/**
		 * line-test. 对于内部的注释没有作用，被忽略。
		 */
		
		String line = str;
		
		/**
		 *  The X-coordinate of the component
		 *  @see #password
		 */
		int x = 10;
		
		/**
		 * for-语句-test 同上
		 */
		for(int i = 0; i < 3; i++){
			System.out.println("Done.");
		}
	}
	
	 /**
	  * 测试：code-literal-test.
	  * <br>
	  * No.1<br>
	  * <pre>
	  * <code>new BeanTranslator.Builder()
	  *   .translate(
	  *     new{@code Translator<String, Integer>}(String.class, Integer.class){
	  *      {@literal @}Override
	  *       public Integer translate(String instance) {
	  *         return Integer.valueOf(instance);
	  *       }})
	  *   .build();
	  * </code>
	  * </pre>
	  * 
	  * No.2-new-no-code-会出错<br>
	  * <pre>
	  * <code>new BeanTranslator.Builder()
	  *   .translate(
	  *     new Translator<String, Integer>(String.class, Integer.class){
	  *      {@literal @}Override
	  *       public Integer translate(String instance) {
	  *         return Integer.valueOf(instance);
	  *       }})
	  *   .build();
	  * </code>
	  * </pre>
	  * 
	  *  No.3-no-code<br>
	  * <pre>
	  * new BeanTranslator.Builder()
	  *   .translate(
	  *     new{@code Translator<String, Integer>}(String.class, Integer.class){
	  *      {@literal @}Override
	  *       public Integer translate(String instance) {
	  *         return Integer.valueOf(instance);
	  *       }})
	  *   .build();
	  * </pre>
	  * 
	  *  No.4-no-pre<br>
	  * <code>new BeanTranslator.Builder()
	  *   .translate(
	  *     new{@code Translator<String, Integer>}(String.class, Integer.class){
	  *      {@literal @}Override
	  *       public Integer translate(String instance) {
	  *         return Integer.valueOf(instance);
	  *       }})
	  *   .build();
	  * </code>
	  * 
	  * <br>
	  *  No.5-new-literal<br>
	  * <pre>
	  * <code>new BeanTranslator.Builder()
	  *   .translate(
	  *     new{@literal Translator<String, Integer>}(String.class, Integer.class){
	  *      {@literal @}Override
	  *       public Integer translate(String instance) {
	  *         return Integer.valueOf(instance);
	  *       }})
	  *   .build();
	  * </code>
	  * </pre>
	  * 
	  * No.6-Override-code<br>
	  * <pre>
	  * <code>new BeanTranslator.Builder()
	  *   .translate(
	  *     new{@code Translator<String, Integer>}(String.class, Integer.class){
	  *      {@code @}Override
	  *       public Integer translate(String instance) {
	  *         return Integer.valueOf(instance);
	  *       }})
	  *   .build();
	  * </code>
	  * </pre>
	  * 
	  * No.7-no-*-<br>
	  <pre>
	   <code>new BeanTranslator.Builder()
	     .translate(
	       new{@code Translator<String, Integer>}(String.class, Integer.class){
	        {@code @}Override
	         public Integer translate(String instance) {
	           return Integer.valueOf(instance);
	         }})
	     .build();
	   </code>
	  </pre>
	  * No.8 <br>
	  * 结论：code与literal作用相似，pre用来固定换行空格等样式不可去.
	  * <br><br>
	  * 
	  * N0.9-code
	  * <pre>
	  * {@code
	  * public List<Object> getObjects() {
      *    return objects;
	  *    }
	  * }
	  * </pre>
	  * 
	  * {@code public List<Object> getObjects()} <br>
	  * {@literal public List<Object> getObjects()} <br>
	  *  public List<Object> getObjects()<br>
	  *  <pre> public List<Object> getObjects() </pre><br>
	  * 
	  * <code>{@code public List<Object> getObjects()} </code><br>
	  * <code>{@literal public List<Object> getObjects()} </code><br>
	  * 
	  * 
	  * @param line input-string
	  */
	public void codeTest(String line) {
		
	}
	
	/**
	 * 静态代码块-test.
	 * 包含一个字符串变量。
	 */
	static {
		/**
		 * string-test
		 */
		String string = "abc";
	}
	
	
	
	
	
	/**
     * this <code>Date</code> object. 
     * <blockquote><pre>
     * (this.getTime() - UTC(this.getYear(), 
     *                       this.getMonth(), 
     *                       this.getDate(),
     *                       this.getHours(), 
     *                       this.getMinutes(), 
     *                       this.getSeconds())) / (60 * 1000)
     * </pre></blockquote>
     *
     * @deprecated As of JDK version 1.1.
     * <br>
     * replaced by {@link #output()}.
     * @since   1.2
	 *
	 */
	
	public void output2(){}




	
	
}
