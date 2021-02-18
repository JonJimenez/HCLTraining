package liss.lissServices;

import java.util.Random;
import java.util.ArrayList;
import java.util.List;

public class LissService {
	private int length = 0;
	private ArrayList<Integer> array;
	private ArrayList<Integer> liss = new ArrayList();
	
	public void generateRandomArray(int len) {
		this.length = len;
		Random rand = new Random();
		ArrayList<Integer> arr = new ArrayList<Integer>();
		for(int i= 0;i<this.length;i++) {
			arr.add(rand.nextInt(100));
		}
		arr.add(0);//add zero at the end since it is Longest Increasing Subsequence and since 0 is the lowest number that can be recorded
		//then 0 would never count in the Longest Increasing Subsequence so it will be ignored but solve the index out of bound issue 
		this.array = (ArrayList<Integer>) arr;
	}
	public void printArray() {
			System.out.println(this.array.toString());
	}
	
	public void findLiss() {
		int currentMax;
        int highestCount = 0;
        ArrayList<Integer> sublist = new ArrayList<Integer>();
		
		for(int i = 0; i < array.size();i++)
        {
            currentMax = Integer.MIN_VALUE;
            for(int j = i;j < array.size(); j++)
            {
                if(array.get(j) > currentMax)
                {
                    sublist.add(array.get(j));
                    currentMax = array.get(j);
                }
            }
            //Compare previous highest subsequence 
            if(highestCount < sublist.size())
            {
                highestCount = sublist.size();
                liss = new ArrayList<Integer>(sublist);  
            }   
            sublist.clear();
        } 
	}
	public void printLiss() {
		System.out.println("The Longest SubSequence is:"+liss.toString());
	}
}
