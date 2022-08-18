package com.seleniumexpresss.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Human {
	
	 @Autowired
	 @Qualifier("humanHeart")
	private Heart heart;
	
	public Human() {
	
	}
	
	
    
	public Human(Heart heart) {
		
		this.heart = heart;
		System.out.println("Human  construction called");
	}

   
	public void setHeart(Heart heart) {
		this.heart = heart; 
		System.out.println("Setter method called");
	}
	
	public void startPumping() {
		
		if (heart != null) {
		heart.pump();
		System.out.println("name of animal is: "+ heart.getNameOfAnimal() +"  no Of Heart present: " +heart.getNoOfHeart());
		}
		else {
			System.out.println("you are dead");
		}
	}
	

}
