package com.epam.Clean_Code;

import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Construction_Cost {

	public static void Cost() {
		int ch;
		float area;
		float cost;
		Scanner sc = new Scanner(System.in);
		PrintStream p = new PrintStream(new FileOutputStream(FileDescriptor.out));
			p.println("Construction cost Quotation ");
			p.println("What is the area of the house? ");
			area = sc.nextInt();
			p.println("The materials available are ");
			p.println("1.Standard materials");
			p.println("2.Above standard material");
			p.println("3.High Standard materials");
			p.println("4.High standard material and fully automated");
			p.println("enter an option");
			ch = sc.nextInt();
			switch(ch){
			case 1:
				p.println("You have selected Standard materials!!");
				p.println("The cost estimation is " + (area * 1200) + "INR");
				break;
			case 2:
				p.println("Above standard material");
				p.println("The cost estimation is " + (area * 1500) + "INR");
				break;
			case 3:
				p.println("High Standard materials");
				p.println("The cost estimation is " + (area * 1800) + "INR");
				break;
			case 4:
				p.println("High standard material and fully automated");
				p.println("The cost estimation is " + (area * 2500) + "INR");
				break;
			default:
				p.println("Please enter a valid option ");
			}
		}
	}