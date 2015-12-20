package com.purchase;

public class Shoes {
	String produser;
	String colors;
	int prise;
	int size;
	
	
	public void setPrise(int d){
		this.prise = d;
	}
	
	public void setSize(int d){
		this.size = d;
	}
	public void setProduser(String d){
		this.produser = d;
	}
	public void setColors(String d){
		this.colors = d;
	}
	public String getDescription(){
		
		
		return "Марка: " +this.produser + "  Цвет: "+ this.colors + "  Цена: "+this.prise;
	}

}
