/**
 * Provides the classes necessary to create an applet and the classes an applet uses 
 * to communicate with its applet context. 
 * <p>
 *　The applet framework involves two entities: 
 *　the applet and the applet context. An applet is an embeddable window (see the 
 * {@link java.awt.Panel} class) with a few extra methods that the applet context 
 * can use to initialize, start, and stop the applet.
 * @since 1.0
 * @see java.awt
 */
package doctest;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import xzy.*;

/**
* Description:
* <br> 这是一个测试类
* 创建时间 2016-09-02
* this is a test
* @author xuzhiyou
* @version 1.0
*/
public class Test extends HighArray {
	
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
	* 方法：设置姓名. <br/>
	* {@code Map<Strting, Double>}   code-map  <br/>
	* {@literal Map<Strting, Double>}  literal-map <br/>
	* {@code Map<Strting, Double>}   code-map  <br/>
	* test &#10    &# <br>
	* {@literal &#10    &#}<br>
	* #  $  %  ^  &  *   {  }  <  >  @   
	* @param name String类型，姓名
	* 查看下面三个的区别：
	* 此方法与{@link HighArray#find(long)} 中某一方法作用相同111；
	* 此方法与{@link HighArray#find(long) find} 中某一方法作用相同111-2；
	* 此方法与{@linkplain HighArray#find(long)} 中某一方法作用相同222；
	* 此方法与{@linkplain HighArray#find(long) find} 中某一方法作用相同222-2；
	* 此方法与{@linkplain String#equals} 中某一方法作用相同333；
	* 此方法与{@linkplain String#equals(Object)} 中某一方法作用相同333-2；
	* 此方法与 HighArray#find(long) 中某一方法作用相同333；
	* 
	* 
	* 我们查看1: @see #getName()
	* 我们查看1: @see {@link #getName()}
	* @see #getName()
	* @see #getName() {@link #getName()}
	* @see #getName()         <br/>前面
	* @see #getName() getName1  @see #getName() getName4
	* @see #getName() getName2   前面
	* @see #getName() getName3 <br/>前面
    * @see String
    * @see String#equals
    * @see String#equals(Object) bbbbb
    * @see String#equals(Object)
    * @see #getName() getName4
    * @see xzy.HighArray#insert(long)
    * @see HighArray#find(long)
    * @see HighArray
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
	* for return 
	*/
	public String getName(){
		return name;
	}
	
	@Override
	/**
	 * 重写 HighArray 类中的delete方法：
	 * @param this-value
	 * 此方法继承 {@inheritDoc} Inherits a comment from the immediate surperclass 继承文档只能写在本类的方法前
	 * @return boolean
	 * @see #getName()
	 */
	public boolean delete(long value){
		return true;
	}

	/**
	 * 抛出异常
	 * @exception IOException test-exception
	 * @throws IOException when read file the exception would be occur 两个都可以
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
	 * @throws IOException
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
	  * <br/>
	  * No.1<br/>
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
	  * No.2-new-no-code<br/>
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
	  *  No.3-no-code<br/>
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
	  *  No.4-no-pre<br/>
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
	  *  No.5-new-literal<br/>
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
	  * No.6-Override-code<br/>
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
	  * No.7 cc <br> dd <br/>  都可以换行  <br>
	  * 结论：code与literal作用相同，pre用来固定换行空格等样式不可去，对于<>等字符若已用 @ code或literal，<code></code>可不用，反之不可以。
	  * <br><br>
	  * 
	  * N0.8-code
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
	 * 随意添加
	 * Returns the offset, measured in minutes, for the local time zone 
     * relative to UTC that is appropriate for the time represented by 
     * this <code>Date</code> object. 
     * <blockquote><pre>
     * new Date(96, 1, 14).getTimezoneOffset() returns 300</pre></blockquote>
     * because on June 1, 1996, daylight saving time (Eastern Daylight Time) 
     * is in use, which is offset only four hours from UTC.<p>
     * This method produces the same result as if it computed:
     * <blockquote><pre>
     * (this.getTime() - UTC(this.getYear(), 
     *                       this.getMonth(), 
     *                       this.getDate(),
     *                       this.getHours(), 
     *                       this.getMinutes(), 
     *                       this.getSeconds())) / (60 * 1000)
     * </pre></blockquote>
     *
     * @deprecated As of JDK version 1.1,
     * replaced by <code>-(Calendar.get(Calendar.ZONE_OFFSET) +
     * Calendar.get(Calendar.DST_OFFSET)) / (60 * 1000)</code>. 
     * This is add by myself
     * 随意添加
     * where:<ul>
     * <li><i>d</i> is the day of the month (<tt>1</tt> through <tt>31</tt>), 
     *     as one or two decimal digits.
     * <li><i>mon</i> is the month (<tt>Jan, Feb, Mar, Apr, May, Jun, Jul, 
     *     Aug, Sep, Oct, Nov, Dec</tt>).
     * <li><i>yyyy</i> is the year, as four decimal digits.
     * <li><i>hh</i> is the hour of the day (<tt>00</tt> through <tt>23</tt>), 
     *     as two decimal digits.
     * <li><i>GMT</i> is exactly the ASCII letters "<tt>GMT</tt>" to indicate 
     *     Greenwich Mean Time.
     * </ul><p>
     * 
     * replaced by <code>Calendar.set(Calendar.DAY_OF_MONTH, int date)</code>.
     * @since   1.2
	 *
	 */
	
	public void output2(){}
	
	
}
