package com;
import com.purchase.*;
import com.purchase.Closes;
import com.purchase.Hats;
import com.purchase.Shoes;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Closes close = new Closes();
		Hats hat= new Hats();
		Shoes shoes = new Shoes();
		

		
		close.setColors("red");
		close.setProduser("Armani");
		close.setSize(45);
		close.setTypeOfClothing("pants");
		close.setPrise(543);
		
		hat.setColors("red");
		hat.setProduser("NoName");
		hat.setPrise(50);
		hat.setSize(58);
		
		shoes.setPrise(500);
		shoes.setProduser("guuci");
		shoes.setSize(45);
		
		System.out.println(close.getDescription());
		System.out.println(hat.getDescription());
		System.out.println(shoes.getDescription());
		

	}

}
