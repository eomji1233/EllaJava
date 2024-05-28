package org.ella.day08.oop.objectarray;

import java.util.Scanner;

public class Book {
	// 제목
	// 저자
	public String title;
	public String author;

	//public void Book() {}

	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
	public String toString() {
		return "("+this.title+","+this.author+")";
	}
}
