package comp.csipl.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SortDate {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter input size");
		int inputSize = sc.nextInt();
		System.out.println("Enter Input");
		List<Object> dataInput = new ArrayList<Object>();
		for (int i = 0; i < inputSize; i++) {
			String data = sc.next();
			dataInput.add(data);
		}
		List<String> strList = new ArrayList<String>();
		List<Integer> intList = new ArrayList<Integer>();
		for (Object object : dataInput) {
			try {
				intList.add(Integer.parseInt(object.toString()));
			}catch(Exception e){
			    try {
					Double d=Double.parseDouble(object.toString());
			    }catch(Exception e1) {
					strList.add(object.toString());
			    }
			}
		}
		List<String> sortedStringList = strList.stream().sorted().collect(Collectors.toList());   
		List<Integer> sortedIntList = intList.stream().sorted().collect(Collectors.toList());   
		Collections.reverse(sortedStringList);
		List<Object> finalList=new ArrayList<Object>();
		finalList.addAll(sortedStringList);
		finalList.addAll(sortedIntList);
		System.out.println(dataInput);
		System.out.println(finalList);
	}

}
