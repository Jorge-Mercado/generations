package ejerciciosGenerations;
import java.util.*;
public class MyFirstVariableNaming {

	public static void main(String[] args) {
	
	Scanner SC = new Scanner(System.in);		

	// name, age, gender, job preference, nationality and blood type
	String name,gender,job,nationality,bloodType;
	int Age;
	
	System.out.println("introduce your name: ");
	name = SC.next();
	System.out.println("introduce  your age:");
	Age = SC.nextInt();
	System.out.println("introduce your gender: ");
	gender = SC.next();
	System.out.println(" whats is your Job?");
	job = SC.next();
	System.out.println("introduce your nationality:");
	nationality = SC.next();
	System.out.println("introduce yout blood type");
	bloodType = SC.next();
	System.out.println("My name is "+ name + ". I'm " + Age + " years old. My gender is " + gender + ". My job preference is " + job + " and I'm " + nationality + ". My blood type is " + bloodType + ".");
	
	
	}// end of main 

}
