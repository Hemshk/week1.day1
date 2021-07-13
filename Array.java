package week1.day2;

import java.util.Arrays;

import javax.naming.ldap.SortControl;

public class Array {

	//Missing elements in an array
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] sortArr = {1,2,3,4,6,7,8};
		Arrays.sort(sortArr);
		
		for (int i = sortArr[0]; i < sortArr.length; i++) {
			if(i != sortArr[i-1])
			{
				System.out.println(i);
				break;
			}
		}
		
		}
		
	}


