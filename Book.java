package com.linkcode.Home;

public class Book {
	String BookName;
	String author;
	int noOfPages;
	double price;
	
	

	public Book(String bookName, String author, int noOfPages, double price) {
		BookName = bookName;
		this.author = author;
		this.noOfPages = noOfPages;
		this.price = price;
	}



	public void read() {
		System.out.println("reading");
		
	}



	public void displayInfo() {
		System.out.println("Book Name :"+BookName);
		System.out.println("Author :"+author);
		System.out.println("Price :"+price);
		System.out.println("No  OF Pages :"+noOfPages);
		System.out.println("----------");
		
	}

}
