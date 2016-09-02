import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
* Description:
* <br> 这是一个测试类
* 创建时间 2016-09-02
* this is a test
* @author xuzhiyou
* @version 1.0
* {@docRoot} d:\\test\\javadoc\\
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
	public String sex = "men";
	/**
	 * value只能在常亮中使用
	 * static final: {@value}  
	 * static ID: {@value #ID}
	 */
	public static final double ID = 12345678;

	/**
	* 构造函数，参数为password与 name
	* @param password int类型，密码
	* @param name String类型，姓名
	* this is for new Test(password,name)
	*
	*/
	public Test(int password ,String name){
		this.password = password;
		this.name = name;
	}
	

	/**
	* 方法：设置姓名  <br/>
	* {@code List<String>}   code-list  <br/>
	* {@literal Map<Strting, Double>}  literal-map
	* testttttttt &#10    &#010
	*   eeeee eeeee
	* @param name String类型，姓名
	* 查看下面三个的区别：
	* 此方法与{@link HighArray#find(long)} 中某一方法作用相同111；
	* 此方法与{@link HighArray#find(long) find} 中某一方法作用相同111-2；
	* 此方法与{@linkplain HighArray#find(long)} 中某一方法作用相同222；
	* 此方法与{@linkplain HighArray#find(long) find} 中某一方法作用相同222-2；
	* 此方法与 HighArray#find(long) 中某一方法作用相同333；
	* 
	* ttttttttttttttttttttttttttttt
	* 
	* 
	* 我们查看1:@see #getName()
	* 我们查看1: @see {@link #getName()}
	* {@link #getName()}
	* @see #getName()
	* @see #getName()         <br/>前面
	* @see #getName() getName1
	* @see #getName() getName2   前面
	* @see #getName() getName3 <br/>前面
    * @see String
    * @see String#equals
    * @see String#equals(Object) bbbbb
    * @see String#equals(Object)
    * @see #getName() getName4
    * 
    * ttttt
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
	 * 此方法继承 {@inheritDoc} Inherits a comment from the immediate surperclass 继承文档只能写在本类的方法前
	 * @param this-value
	 * @author xuzhiyou
	 * @return boolean
	 * @see #getName()
	 */
	public boolean delete(long value){
		return true;
	}

	/**
	 * 抛出异常
	 * @throws IOException when read file the exception would be occur
	 * @exception  test
	 * testtttttt
	 */
	public String firstLine(String file) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new FileReader(new File(file)));
		String line = bufferedReader.readLine();
		return line;
	}

	
	/**
	 * Save the state of this object to a stream (i.e., serialize it).
     *
     * @serialData The value returned by <code>getTime()</code>
     *		   is emitted (long).  This represents the offset from
     *             January 1, 1970, 00:00:00 GMT in milliseconds.
	 */
	public void output(){}
	
	
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
     * wawoooooooo
	 *
	 */
	
	public void output2(){}
	
	
}
