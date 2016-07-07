package ncs4.test1;

import java.util.*;


public class ListTest {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		
		list.add((int)(Math.random()*100)+1);
		list.add((int)(Math.random()*100)+1);
		list.add((int)(Math.random()*100)+1);
		list.add((int)(Math.random()*100)+1);
		list.add((int)(Math.random()*100)+1);
		list.add((int)(Math.random()*100)+1);
		list.add((int)(Math.random()*100)+1);
		list.add((int)(Math.random()*100)+1);
		list.add((int)(Math.random()*100)+1);
		list.add((int)(Math.random()*100)+1);
		
		for(int i = 0; i < list.size(); i++)
		System.out.println("정렬전 : " + list.get(i));
		System.out.println();
		for(int j = 0; j < list.size(); j++)
			Collections.sort(list,new Decending());
			System.out.println("정렬후 : " + list);
		

		
		
		
		

	}
	
public void display(List list){
	
}

}
