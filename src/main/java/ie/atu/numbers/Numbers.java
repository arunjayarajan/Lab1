package ie.atu.numbers;

//import java.util.Scanner;
//Added a comment line to test
//Test

// Added changes in Feature1 Branch to test

// Another test for merge conflicts
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
	public void main(String[] args) {
		// TODO Auto-generated method stub
		sum(2,3);
	}

}
