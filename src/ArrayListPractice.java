import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListPractice {

	public static void main(String[] args) {
	
		
		ArrayList<String> arr = new ArrayList<String>();
				
		arr.add("Ram");
		arr.add("Sham");
		arr.add("Jadu");
		arr.add("Madhu");
		
		for (int i=0;i<arr.size();i++) {
			
			System.out.println(arr.get(i));
			
		}
		
		System.out.println(arr.indexOf("Ram"));
		System.out.println("Enter Name");
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		
       for (int k=0;k<arr.size();k++) {
			
			if (arr.get(k).contains(name)) {
				
				System.out.println("name Exists");
				break;
			}
			else {
				System.out.println("name NOT Exists");
				break;
			}
			}
			
		}
		
		}


