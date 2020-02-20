package com.epam.oops.epam;

public class Animals implements Animal{
	String name,eat,nature,sound;
	
	Animals(String name,String eat,String nature,String sound){
		this.name=name;
		this.eat=eat;
		this.nature=nature;
		this.sound=sound;
	}
	Animals(){}
	public void name() {
		System.out.println("My name is "+name);
	}
	public void typeOfEater() {
		System.out.println("Iam a "+eat+" animal");
	}
	
	public void nature() {
		System.out.println("Iam a "+nature);
	}
	
	public void sound() {
		System.out.println("I make "+sound+" sounds");
	}
	
	

	
}
