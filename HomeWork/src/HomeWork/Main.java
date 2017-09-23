package HomeWork;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	public static void main(String args[])throws NumberFormatException, InterruptedException{
		
		
try{
		Scanner scn = new Scanner(System.in);
		System.out.println("������� ����� �");
		double a = scn.nextDouble();
		System.out.println("������� ����");
		String tmp = scn.nextLine();
		String c = scn.nextLine();
		System.out.println("������� ����� b");
		double b = scn.nextDouble();

		String result = task1(c,a,b);
		
		System.out.println(result);
}catch(InputMismatchException exc){
	System.out.println("����� �����!!!");
}

	}


	public static String task1(String c,double a,double b) throws NumberFormatException, InterruptedException{

		Thread thread = new Thread(()->{
			String result = "";
			Double tmp = (double) 0;
			
			
			switch(c){
			case "+": tmp = (a + b);	
			result = tmp.toString();
			break;
			case "-": tmp = a - b;
			result = tmp.toString();
			break;
			case "*": tmp = a * b;	
			result = tmp.toString();
			break;
			case "/": tmp = a / b;
			result = tmp.toString();
			break;
			case "%": tmp = a % b;
			result = tmp.toString();
			break;
			case "==":  result  = a == b ? "true" :  "false";	
			break;
			case ">": result  = a > b ? "true" :  "false";			          
			break;
			case "<": result  = a < b ? "true" :  "false";		          
			break;
			
			default : System.out.println("���� �������");
			}

			
			Thread	threads = Thread.currentThread();
			threads.setName(result);
		});
		thread.start();
		thread.join();

		

		return thread.getName().toString();
	}	

}


