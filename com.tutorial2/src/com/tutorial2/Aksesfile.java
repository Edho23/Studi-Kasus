package com.tutorial2;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;



public class Aksesfile {

    public static void main(String[] args) throws IOException {
        
        File fileInput = new File ("C:/Users/tayoo/Documents/JAVA/com.tutorial2/src/com/tutorial2/input.txt");
        
        Scanner inputUser = new Scanner(fileInput);
        System.out.println(inputUser.nextLine());
        
    }
    
}
