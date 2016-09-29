package xzy;

import java.sql.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class SensiAnalysisTest {

	private Map<String, double[]> originalDataMap;
	private Map<String, double[]> resultDataMap;
	
	Date fromDate1 ;
	Date toDate1 ;
	Date fromDate2 ;
	Date toDate2 ;
	
	public void setFromDate1(String string) {
		fromDate1 = Date.valueOf(string);
	}
	public void setToDate1(String string) {
		toDate1 = Date.valueOf(string);
	}
	public void setFromDate2(String string) {
		fromDate2 = Date.valueOf(string);
	}
	public void setToDate2(String string) {
		toDate2 = Date.valueOf(string);
	}
	
	public void setOriginalDataMap(Map<String, double[]> originalDataMap){
		this.originalDataMap = originalDataMap;
	}
	
	public Map<String, double[]> getResultDataMap() {
		return resultDataMap;
	}
	
	private void sensitivityAnalysis(){
		Map<String, double[]> newDataMap = new HashMap<String, double[]>();
		Map<String, double[]> oldDataMap = new HashMap<String, double[]>();
		String key = "";
		double[] value;
		
		//在调用的方法中，交叉使用map，两个map必须不能相同，即不同通过直接复制，所以此处的map，通过获取值并且put成一个新map，再操作。
		Map<String, double[]> copyOriginalDataMap = new HashMap<String, double[]>();
		for(Map.Entry<String, double[]> entry : originalDataMap.entrySet())
			copyOriginalDataMap.put(entry.getKey(), entry.getValue());
		
		
		for(Map.Entry<String, double[]> entry : originalDataMap.entrySet()){
			key = entry.getKey();
			value = entry.getValue();
			String dateString = key.split("---")[0];
			String nameString = key.split("---")[1];
			show(originalDataMap);
			Iterator<Entry<String, double[]>> iterator = copyOriginalDataMap.entrySet().iterator();
			boolean isInMap = false;
			while(iterator.hasNext()){
				Entry<String, double[]> entry2 = iterator.next();
				System.out.println("bbb");
				String key2 = entry2.getKey();
				String dateString2 = key2.split("---")[0];
				String nameString2 = key2.split("---")[1];
				double[] value2 = entry2.getValue();
				
				if(inside(dateString, dateString2)){
					if (nameString.equals(nameString2)) {
						System.out.println("cccccc");
						iterator.remove();
						newDataMap.put(nameString, sumValue(value, value2));
						isInMap = true;
					}
				}else if (inside2(dateString, dateString2)) {
					if (nameString.equals(nameString2)) {
						System.out.println("dddddddddddddd");
						iterator.remove();
						oldDataMap.put(nameString, sumValue(value, value2));
						isInMap = true;
					}
				}
			}
			if (!isInMap) {
				if (containsDate(Date.valueOf(dateString), fromDate1, toDate1)) {
					newDataMap.put(nameString, value);
				}else {
					oldDataMap.put(nameString, value);
				}
			}
		}
		
		
			/*for(Map.Entry<String, double[]> entry2 : originalDataMap.entrySet()){
				String key2 = entry2.getKey();
				String dateString2 = key2.split("---")[0];
				String nameString2 = key2.split("---")[1];
				if(inside(dateString, dateString2)){
					if (nameString.equals(nameString2)) {
						double[] value2 = originalDataMap.remove(key2);
						newDataMap.put(nameString, sumValue(value, value2));
					}
				}else if (inside2(dateString, dateString2)) {
					if (nameString.equals(nameString2)) {
						double[] value2 = originalDataMap.remove(key2);
						oldDataMap.put(nameString, sumValue(value, value2));
					}
				}
				
			}*/
		
		show(newDataMap);
		show(oldDataMap);
		show(originalDataMap);
	}
	
	private void show(Map<String, double[]> map) {
		// TODO Auto-generated method stub
		for(Entry<String, double[]> entry : map.entrySet()){
			String key = entry.getKey();
			double[] value = entry.getValue();
			System.out.print(key + ": ");
			for(int i = 0; i < value.length; i++){
				System.out.print(value[i] + " ");
			}
			System.out.println();
		}
		System.out.println("-------------------");
	}
	private double[] sumValue(double[] value, double[] value2) {
		// TODO Auto-generated method stub
		double[] sumValue = new double[value.length];
		for(int i = 0; i < value.length; i++ )
			sumValue[i] = value[i] + value2[i];
		return sumValue;
	}
	private boolean inside(String dateString, String dateString2) {
		// TODO Auto-generated method stub
		Date date = Date.valueOf(dateString);
		Date date2 = Date.valueOf(dateString2);
		
		if(containsDate(date, fromDate1, toDate1) && containsDate(date2, fromDate1, toDate1) && !(date.equals(date2)))
			return true;
		return false;
	}
	private boolean inside2(String dateString, String dateString2) {
		// TODO Auto-generated method stub
		Date date = Date.valueOf(dateString);
		Date date2 = Date.valueOf(dateString2);
		
		if(containsDate(date, fromDate2, toDate2) && containsDate(date2, fromDate2, toDate2) && !(date.equals(date2)))
			return true;
		return false;
	}

	
	private boolean containsDate(Date date, Date fromDate, Date toDate) {
		// TODO Auto-generated method stub
		if (date.equals(fromDate) || date.equals(toDate) || ( date.after(fromDate) && date.before(toDate)))
			return true;
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String, double[]> originalDataMap = new HashMap<String, double[]>();
		double[] ds1 = {1, 2, 3, 7};  double[] ds2 = {2, 3, 6, 4};
		double[] ds3 = {4, 7, 12, 14};  double[] ds4 = {8, 9, 12, 8};
		double[] ds5 = {3, 2, 7, 8};
		double[] ds11 = {4, 7, 9, 11};  double[] ds21 = {5, 5, 7, 9};
		double[] ds31 = {6, 8, 13, 15};  double[] ds41 = {5, 7, 16, 14};
		double[] ds51 = {6, 7, 9, 8};
		double[] ds12 = {1, 2, 8, 18};  double[] ds22 = {2, 3, 8, 15};
		double[] ds32 = {4, 7, 11, 13};  double[] ds42 = {8, 9, 10, 11};
		double[] ds52 = {3, 2, 13, 4};
		double[] ds13 = {4, 10, 9, 15};  double[] ds23 = {6, 5, 12, 16};
		double[] ds33 = {6, 8, 12, 16};  double[] ds43 = {5, 7, 9, 13};
		double[] ds53 = {6, 7, 11, 9};
		originalDataMap.put("2016-09-22---A", ds1);  originalDataMap.put("2016-09-22---B", ds2);
		originalDataMap.put("2016-09-22---C", ds3);  originalDataMap.put("2016-09-22---D", ds4);
		originalDataMap.put("2016-09-22---E", ds5);
		originalDataMap.put("2016-09-21---A", ds11);  originalDataMap.put("2016-09-21---B", ds21);
		originalDataMap.put("2016-09-21---C", ds31);  originalDataMap.put("2016-09-21---D", ds41);
		originalDataMap.put("2016-09-21---E", ds51);
		originalDataMap.put("2016-09-15---A", ds12);  originalDataMap.put("2016-09-15---B", ds22);
		originalDataMap.put("2016-09-15---C", ds32);  originalDataMap.put("2016-09-15---D", ds42);
		originalDataMap.put("2016-09-15---E", ds52);
		originalDataMap.put("2016-09-14---A", ds13);  originalDataMap.put("2016-09-14---B", ds23);
		originalDataMap.put("2016-09-14---C", ds33);  originalDataMap.put("2016-09-14---D", ds43);
		originalDataMap.put("2016-09-14---E", ds53);
		
//		Date fromDate1 = Date.valueOf("2016-09-21");
//		Date toDate1 = Date.valueOf("2016-09-22");
//		Date fromDate2 = Date.valueOf("2016-09-14");
//		Date toDate2 = Date.valueOf("2016-09-15");
		String fromDate1 = "2016-09-21";  String toDate1 = "2016-09-22";
		String fromDate2 = "2016-09-14";  String toDate2 = "2016-09-15";
		
		SensiAnalysisTest sAnalysisTest = new SensiAnalysisTest();
		sAnalysisTest.setOriginalDataMap(originalDataMap);
		sAnalysisTest.setFromDate1(fromDate1);
		sAnalysisTest.setToDate1(toDate1);
		sAnalysisTest.setFromDate2(fromDate2);
		sAnalysisTest.setToDate2(toDate2);
		
		sAnalysisTest.sensitivityAnalysis();
		
	}

}
