package com.purchase;

public class Closes {
	String produser;
	String typeOfClothing;
	String colors;
	int prise;
	int size;
	
	
	public void setPrise(int d){
		this.prise = d;
	}
	public void setTypeOfClothing(String d){
		this.typeOfClothing = d;
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
		
		
		return "Марка: " +this.produser + "   Тип одежды: "+ this.typeOfClothing +"  Цена: "+this.prise;
	}

}
