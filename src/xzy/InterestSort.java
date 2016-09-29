package xzy;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class InterestSort {
	
	private Map<String, Long> idAudienceMap;
	private Map<String, String> idInformationMap;

	private static String inputPath = "";
	
	public void initMap() throws IOException {
		
		BufferedReader bReader = new BufferedReader(new FileReader(new File(inputPath)));
		String line = "";
		JSONObject jsonObject;
		JSONArray jsonArray;
		
		while( (line = bReader.readLine()) != null){
			jsonObject = JSONObject.fromObject(line);
			jsonArray = JSONArray.fromObject(jsonObject.get("data"));
			if ( jsonArray.size() > 0 ) {
				for(Object object : jsonArray ){
					JSONObject  jObject = JSONObject.fromObject(object);
					
					String id = jObject.getString("id");
					Long audience = jObject.getLong("audience_size");
					
					String output = jObject.getString("name") +"\t";
					if (jObject.containsKey("topic")) {
						output += jObject.getString("topic") + "\t";
					} else {
						output += "-" + "\t";
					}
					
					JSONArray path = jObject.getJSONArray("path");
					if ( path.size() > 0) {
						String pString = "";
						for(Object pObject : path){
							pString += pObject + ",";
						}
						output += pString + "\n";
					} else {
						output += "-" + "\n";
					}
					
					if ( ! idAudienceMap.containsKey(id) ) {
						idAudienceMap.put(id, audience);
						idInformationMap.put(id, output);
					} else {
						Long oldAudience = idAudienceMap.get(id);
						idAudienceMap.put(id, audience + oldAudience);
					}
					
		
					
					
					
					
				}
			}
		}
		
		
	}
	
	public static void main(String[] args) {

	}

}
