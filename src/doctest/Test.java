/**
 * Provides the classes necessary to create an applet and the classes an applet uses 
 * to communicate with its applet context. 
 * <p>
 *��The applet framework involves two entities: 
 *��the applet and the applet context. An applet is an embeddable window (see the 
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
* <br> ����һ��������
* ����ʱ�� 2016-09-02
* this is a test
* @author xuzhiyou
* @version 1.0
*/
public class Test extends HighArray {
	
	/**
	* �����Ա��private:password
	*/
	private int password;
	
	/**
	* ���г�Ա��public:name
	*/
	public String name;
	protected String sex = "men";
	/**
	 * valueֻ���ڳ�����ʹ��
	 * static final: {@value}  
	 * static ID: {@value #ID}
	 */
	public static final double ID = 12345678;

	/**
	* ���캯��.����Ϊpassword�� name
	* @param password int���ͣ�����
	* @param name String���ͣ�����
	*
	*/
	public Test(int password ,String name){
		this.password = password;
		this.name = name;
	}
	

	/**
	* ��������������. <br/>
	* {@code Map<Strting, Double>}   code-map  <br/>
	* {@literal Map<Strting, Double>}  literal-map <br/>
	* {@code Map<Strting, Double>}   code-map  <br/>
	* test &#10    &# <br>
	* {@literal &#10    &#}<br>
	* #  $  %  ^  &  *   {  }  <  >  @   
	* @param name String���ͣ�����
	* �鿴��������������
	* �˷�����{@link HighArray#find(long)} ��ĳһ����������ͬ111��
	* �˷�����{@link HighArray#find(long) find} ��ĳһ����������ͬ111-2��
	* �˷�����{@linkplain HighArray#find(long)} ��ĳһ����������ͬ222��
	* �˷�����{@linkplain HighArray#find(long) find} ��ĳһ����������ͬ222-2��
	* �˷�����{@linkplain String#equals} ��ĳһ����������ͬ333��
	* �˷�����{@linkplain String#equals(Object)} ��ĳһ����������ͬ333-2��
	* �˷����� HighArray#find(long) ��ĳһ����������ͬ333��
	* 
	* 
	* ���ǲ鿴1: @see #getName()
	* ���ǲ鿴1: @see {@link #getName()}
	* @see #getName()
	* @see #getName() {@link #getName()}
	* @see #getName()         <br/>ǰ��
	* @see #getName() getName1  @see #getName() getName4
	* @see #getName() getName2   ǰ��
	* @see #getName() getName3 <br/>ǰ��
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
	* ��������ȡ����
	* @return �������� name
	* for return 
	*/
	public String getName(){
		return name;
	}
	
	@Override
	/**
	 * ��д HighArray ���е�delete������
	 * @param this-value
	 * �˷����̳� {@inheritDoc} Inherits a comment from the immediate surperclass �̳��ĵ�ֻ��д�ڱ���ķ���ǰ
	 * @return boolean
	 * @see #getName()
	 */
	public boolean delete(long value){
		return true;
	}

	/**
	 * �׳��쳣
	 * @exception IOException test-exception
	 * @throws IOException when read file the exception would be occur ����������
	 */
	public String firstLine(String file) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new FileReader(new File(file)));
		String line = bufferedReader.readLine();
		return line;
	}

	
	/**
	 * Save the state of this object to a stream.
     *
     * @serialData serialData-test ��֪������ã��˴�����ʾ�������������η������� serial�� serialField �����ԡ�
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
		 * line-test. �����ڲ���ע��û�����ã������ԡ�
		 */
		
		String line = str;
		
		/**
		 *  The X-coordinate of the component
		 *  @see #password
		 */
		int x = 10;
		
		/**
		 * for-���-test ͬ��
		 */
		for(int i = 0; i < 3; i++){
			System.out.println("Done.");
		}
	}
	
	 /**
	  * ���ԣ�code-literal-test.
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
	  * No.7 cc <br> dd <br/>  �����Ի���  <br>
	  * ���ۣ�code��literal������ͬ��pre�����̶����пո����ʽ����ȥ������<>���ַ������� @ code��literal��<code></code>�ɲ��ã���֮�����ԡ�
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
	 * ��̬�����-test.
	 * ����һ���ַ���������
	 */
	static {
		/**
		 * string-test
		 */
		String string = "abc";
	}
	
	
	
	
	
	/**
	 * �������
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
     * �������
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
