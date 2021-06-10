package cert;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class A {

	private String studentname;
	public A() {

	}
	public A(String studentname) {
		this.studentname = studentname;
	}
	public String getStudentname() {
		return studentname;
	}
	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}
	public static void main(String[] args) {
		ArrayList<A> arraylist = new ArrayList<A>();
		arraylist.add(new A("serkan"));
		arraylist.add(new A("serk"));
		arraylist.add(new A("seko"));
	}
}
