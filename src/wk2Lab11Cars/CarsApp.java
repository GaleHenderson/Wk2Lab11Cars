package wk2Lab11Cars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class CarsApp {

	public static void main(String[] args) {
		
		//create scanner
		Scanner scan = new Scanner(System.in);
		
		int userCount = 0;
		
		
		
		//Prompt user for # of cars
		userCount = Validator.getInt(scan,"Please enter the number of cars you've owned: ");
		
		//Create an Array for cars
		Cars [] carArr = new Cars[userCount];		
				
		for (int i = 0; i < carArr.length; i++) {
			int counter = i + 1;
			int year = Validator.getInt(scan, "Vehicle " + counter + " Year: ", 1908, 2019);
			//scan.nextLine();//garbage line
			String make = Validator.getString(scan, "Vehicle " + counter + " Make: ");
			String model = Validator.getString(scan, "Vehicle  " + counter + " Model: ");
			//scan.nextLine();//garbage line
			double price = Validator.getDouble(scan, "Vehicle " + counter + "  Price: ");
			carArr[i] = new Cars(year, make, model, price);
			
		}
	
		for(Cars car : carArr) {
			System.out.println(car);
		}
		//System.out.println(Arrays.toString(carArr));
		
		
	scan.close();	
	}

}
