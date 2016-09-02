import java.io.FileReader;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

public class jsTest {
	public static void main(String[] args) {
		ScriptEngineManager manager = new ScriptEngineManager();
	    ScriptEngine engine = manager.getEngineByName("js");
	    try {
	      FileReader reader = new FileReader("C:\\Users\\xuzhiyou\\Desktop\\trends_js.js");
	      System.out.println(engine.eval(reader).toString());
	      reader.close();
	    } catch (Exception e) {
	      e.printStackTrace();
	    }
	    System.out.println("over");
	}

}
