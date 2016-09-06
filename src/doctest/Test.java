package doctest;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import xzy.*;

/**
* Description:
* <br> ����һ������ ��
* ����ʱ�� 2016-09-02
* this is a test
* @author xuzhiyou
* @author x z y
* @author xzy--xzy2--xzy3
* @version 1.0
* See the <a href="{@docRoot}/../testDoc/overview-tree.html">Copyright</a>.<br>
*/
public class Test extends HighArray implements TestInterface{
	
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
	 * the num is 20
	 * HighArray.VALUE:{@value xzy.HighArray#VALUE}
	 */
	public static int num = 20;
	
	/**
	 * distances of point (x,y)
	 */
	public int x, y;
	
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
	* ��������������. <br>
	* {@code Map<Strting, Double>}   code-map  <br>
	* {@literal Map<Strting, Double>}  literal-map <br>
	* {@code Map<Strting, Double>}   code-map  <br>
	* test &#10    &# <br>
	* {@literal &#10    &#}<br>
	* #  $  %  ^  *   {  }  @   
	* @param name String���ͣ�����
	* �鿴��������������
	* �˷�����{@link HighArray#find(long)} ��ĳһ����������ͬ111��
	* �˷�����{@link HighArray#find(long) find} ��ĳһ����������ͬ111-2��
	* �˷�����{@linkplain HighArray#find(long)} ��ĳһ����������ͬ222��
	* �˷�����{@linkplain HighArray#find(long) find} ��ĳһ����������ͬ222-2��
	* �˷�����{@linkplain String#equals} ��ĳһ����������ͬ333��
	* �˷�����{@linkplain String#equals(Object)} ��ĳһ����������ͬ333-2��
	                �˷�    ���� HighArray#find(long) ��ĳһ����������ͬ333��
	* 
	* 
	* ���ǲ鿴1: @see #getName()
	* ���ǲ鿴1: @see {@link #getName()}
	* @see #getName()
	* @see #getName() {@link #getName()}
	* @see #getName()         <br>ǰ��
	* @see #getName() getName1  @see #getName() getName4
	* @see #getName() getName2   ǰ��
	* @see #getName() getName3 <br>ǰ��
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
	* ��������ȡ����
	* @return �������� name
	*/
	public String getName(){
		return name;
	}
	
	/**
	 * ��д HighArray ���е�delete������
	 * @param value ��Ǽ̳�-Test
	 * @return {@inheritDoc}
	 * @see #getName()
	 * @see "JAVA ���˼��"
	 * @see <a href="spec.html#section">Java Spec</a>
	 * @exception IOException exception-Test
	 * @throws FileNotFoundException file-exception-Test
	 */
	@Override
	public boolean delete(long value) throws IOException, FileNotFoundException{
		return true;
	}
	
	/**
	 * ��д HighArray ���е�find������
	 * @param num find the number
	 * @param n find the n �����
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
	 * type parameter-test ���Ͳ�����һ�����
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
	 * �׳��쳣
	 * @param file file-path
	 * @exception IOException test-exception
	 * @throws IOException when read file the exception would be occur ��һ���ᾯ��
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
	 * @throws IOException there-nothing
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
	  * No.2-new-no-code-�����<br>
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
	  * ���ۣ�code��literal�������ƣ�pre�����̶����пո����ʽ����ȥ.
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
