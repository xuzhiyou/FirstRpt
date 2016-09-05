package xzy;
/**
 * javadoc: class HighArray
 * Array class test
 * @author xuzhiyou
 *
 */
public class HighArray {

	private long[] arr;
	private int nums;
	public HighArray(int max){
		arr=new long[max];
		nums=0;
	}
	
	public HighArray(){}
	
	public boolean insert(long newnum){
		if(nums==arr.length)
			return false;
		arr[nums]=newnum;
		nums++;
		return true;
	}
	
	public boolean find(long num){
		int i;
		for(i=0;i<nums;i++){
			if(arr[i]==num)
				break;
		}
		if(i==nums)
			return false;
		return true;
	}
	
	/**
	 * delete a value:
	 * @param value
	 * @return true or false
	 */
	public boolean delete(long value){
		int i;
		for(i=0;i<nums;i++){
			if(arr[i]==value)
				break;
		}
		if(i==nums)
			return false;
		for(int j=i;j<nums-1;j++)
			arr[j]=arr[j+1];
		nums--;
		return true;
	}
	
	public void show(){
		System.out.println("the arrays is: ");
		for(int i=0;i<nums;i++)
			System.out.print(arr[i]+" ");
		System.out.println();
	}
	
}
