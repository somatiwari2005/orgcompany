package org.company.implementation;

public class MainClass {

public static void main(String [] args) {
	UserLogin user =new UserLogin();
	boolean b =user.validLogin("abc", "Aricent");
	System.out.println("Result"+b);
}


}
