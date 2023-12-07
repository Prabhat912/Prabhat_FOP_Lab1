package com.greatlearning.javafsd.emailapp.service;

import java.util.Random;

public class PasswordGenerator {
	
	//Method to generate Password inside PasswordGenerator Class

    public String generate() {
            
        String capitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String smallLetters = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";
        String specialCharacters = "~!@#$%^&*()-+[]|";
        
        
        // Combining all the character to create the password by picking
        // random value inside the total length of combined string 
        // and append that character to form a password
        String combinedString = 
            capitalLetters + smallLetters + numbers
                + specialCharacters;
            
        Random randomObj = new Random();
        
        StringBuilder passwordBuilder = new StringBuilder();
        
        int randomCharacterlength = combinedString.length();
                
        // Looping till 8 values to form password of length 8 
        for (int index = 1; index <= 8; index ++) {
            
            int randomCharacterIndex = randomObj.nextInt(randomCharacterlength);
            
            char charValue = 
                    combinedString.charAt(randomCharacterIndex);			
            
            passwordBuilder.append(charValue);						
        }
        
        String password = passwordBuilder.toString();
        
        return password;
    }
}