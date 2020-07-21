package com.springwithoutxml;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Subject {
	@Value("java")
	private String subjectName;
	@Value("java start")
	private String bookName;
	public String getSubjectName() {
		return subjectName;
	}
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	public void study() {
		System.out.println("student is studying");
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	@Override
	public String toString() {
		return "Subject [subjectName=" + subjectName + ", bookName=" + bookName + "]";
	}

}
