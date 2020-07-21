package com.springcore;

public class Library {

	private Student st;
	private String bookName;

	public Library() {
		super();

	}

	public Library(Student st, String bookName) {
		super();
		this.st = st;
		this.bookName = bookName;
	}

	@Override
	public String toString() {
		return "Library [st=" + st + ", bookName=" + bookName + "]";
	}

	public Student getSt() {
		return st;
	}

	public void setSt(Student st) {
		this.st = st;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
}
