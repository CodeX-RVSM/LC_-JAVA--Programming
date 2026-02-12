package com.linkcode.Home;

import java.util.Scanner;

public class BookMain {
	public static void main(String[] args) {
		
		
//		Book book1=new Book("harry Potter","J K rowing",500,1000);
//		Book book2=new Book("ikigai","abc",300,400);
//		Book book3=new Book("Shamchi AAi","Sane guruji",300,800);
//		book1.displayInfo();
//		book2.displayInfo();
//		book3.displayInfo();
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Book Management ");
		System.out.println("How many book details you want to Add");
		//non primative - String -4 , classes    Object , array
		int n=sc.nextInt();
		Book arr[]=new Book[n];
		for(int i =0;i<n;i++) {
			System.out.println("Enter  book Details :"+(i+1));
			System.out.println("ENter Book Name :");
			String name=sc.next();
			System.out.println("Enter Book Author Name :");
			String author=sc.next();
			System.out.println("ENter Book Price :");
			double price=sc.nextDouble();
			System.out.println("Enter No OF pages :");
			int no=sc.nextInt();
//			Book book=new Book(name, author,no,price);
//			arr[i]=book;
			arr[i] =new Book(name,author, no,price);
		}
		
		System.out.println("Book Details Added Successfully ");
		System.out.println("----------Book Details ---------");
		
//		for(int i=0;i<n;i++) {
//			System.out.println("Book name :"+arr[i].BookName);
//			System.out.println("Author :"+arr[i].author);
//			System.out.println("Price :"+arr[i].price);
//			System.out.println("No of Pages :"+arr[i].noOfPages);
//			System.out.println("-------------------");
//		}
		
		//advance For Loop
		//Book is datatype 
		for(Book a:arr) {
		System.out.println("Book name :"+a.BookName);
		System.out.println("Author :"+a.author);
		System.out.println("Price :"+a.price);
		System.out.println("No of Pages :"+a.noOfPages);
		System.out.println("-------------------");
		}
		
//		
	}
}
