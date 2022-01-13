/**
* @author - 503043040 goes here (no names)
*
* 
* 
*/
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.*;
public class Movie2 {
	/**
	 * main method uses Scanner to read in user inputs like number of movies
	 * then their ratings from focus group and movie website
	 * , set critic rating as a math.random number, then prints their averages
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("How many movies are you rating?");
		
		int site1=0,site2=0,site3=0;
		double focus1=0,focus2=0;
		//int[]ans=new int[numMovies];
		int numMoviesUsedForIteration=0;
		double criticRate = Math.random()*99+1; //0 to 98.99 1 to 99.99
		/**
		 * try catch block is for when one inputs a input mismatch for a variable, whether its a website(ints only)
		 * or focus group (doubles and ints allowed)
		 * and it would call the input mismatch exception
		 */
		try {
		int numMovies = in.nextInt();
		numMoviesUsedForIteration=numMovies;
		System.out.println("Number of movies you are reviewing: "+numMovies);
		/**
		 * for block loops through the 5 variables - 3 for review website rating and 2 for focu group rating
		 * based on how many movies the user wants to rate
		 */
		double overallRate=0;
		double avgSite=0, avgFocus=0;
		
		for (int i = 1;i<=numMovies; i++) {
			System.out.println("Please enter ratings from the movie review website for movie #"+i);
			site1=in.nextInt();
			site2=in.nextInt();
			site3=in.nextInt();
			System.out.println("Please enter ratings from the focus group for movie #"+i);
			focus1=in.nextDouble();
			focus2=in.nextDouble();
			
			avgSite=(double)(site1+site2+site3)/(double)3;
			avgFocus=(focus1+focus2)/2;
			overallRate=0.2*avgSite+0.3*avgFocus+0.5*criticRate;
		System.out.println("Ratings for movie #"+i);
		System.out.format("Average website rating: " + "%.2f%n", avgSite);
		System.out.format("Average focus group rating: " + "%.2f%n", avgFocus);
		System.out.format("Average movie critic rating: " + "%.2f%n", criticRate);
		System.out.format("Overall movie rating: " + "%.2f%n", overallRate);
		System.out.println();
		}
		}
		catch (InputMismatchException e) {
			
			System.out.println("Incorrect data has been entered");
			System.exit(0);
			//System.out.println(e.getMessage());
		}
		
		/**
		 * this for loop calculates avg ratings for every movie then prints all the average ratings out for every movie to 2 deci places
		 */
		/*
		for (int i = 1;i<=numMoviesUsedForIteration; i++) {
			avgSite=(double)(site1+site2+site3)/(double)3;
			avgFocus=(focus1+focus2)/2;
			overallRate=0.2*avgSite+0.3*avgFocus+0.5*criticRate;
		System.out.println("Ratings for movie #"+i);
		System.out.format("Average website rating: " + "%.2f%n", avgSite);
		System.out.format("Average focus group rating: " + "%.2f%n", avgFocus);
		System.out.format("Average movie critic rating: " + "%.2f%n", criticRate);
		System.out.format("Overall movie rating: " + "%.2f%n", overallRate);
		System.out.println();
		*/
		/**
		 *  Count the average website rating as
20% of the overall rating, the average focus group rating as 30% of the overall rating, and the average movie
critic rating as 50% of the overall rating
		 */
		
		
	}

}
