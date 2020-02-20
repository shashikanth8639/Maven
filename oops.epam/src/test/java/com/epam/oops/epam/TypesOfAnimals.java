package com.epam.oops.epam;

public class TypesOfAnimals {
	public static void main(String[] args) {
		Animals dog=new Animals("Dog","omnivorous","mammal","bark");
		Animals dog1=new Animals();//constructor overloading
		dog.name();
		dog.nature();
		dog.typeOfEater();
	}
}
