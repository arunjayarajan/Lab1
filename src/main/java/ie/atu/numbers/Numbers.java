package ie.atu.numbers;

//import java.util.Scanner;
//Added a comment line to test
//Test

// Added changes in Feature1 Branch to test

// Another test for merge conflicts

//to test the pull request from GitHub UI

// Testing merge conflicts

//Test merge conflicts for Aravind

//Test1

public class Numbers {

	//@SuppressWarnings("resource")
	public int sum(int a , int b ){
		
		return a+b; 
	}
	
	public  int subtract(int a , int b){
		return a-b;
	
	}
	
	public int largest(int n1, int n2){
		if(n1>n2) {
			return n1;
		}
		else {
			return n2;
		}
	}

	/*public static int smallest(){
		return 1;
		
	}
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Numbers abcd = new Numbers();
		int xyz = abcd.sum(2,3);
		System.out.println("Sum="+xyz);


	}

}
