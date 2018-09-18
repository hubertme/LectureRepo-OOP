// package hubertwang;

import java.util.*;

public class Encapsulation{
	private int myProtectedNumber;

	// Encapsulation is here
	public void setMyProtectedNumber(int newValue){
		myProtectedNumber = newValue;
	}

	public void setMyProtectedNumber(){
		myProtectedNumber = 0;
	}

	public int getMyProtectedNumber(){
		return this.myProtectedNumber;
	}
}