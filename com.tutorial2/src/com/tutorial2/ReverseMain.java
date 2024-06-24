package com.tutorial2;

import java.util.*;

class ReverseMain {
    
    private void Rdm() {
        Scanner userInput = new Scanner(System.in);
        int N,R;
        
        System.out.print("Masukkan Nilai : ");
        N = userInput.nextInt();
        
        System.out.println("Nilai Before : " + N);
        System.out.print("Nilaia Reverse : ");
        while(N>0){
            R=N%10;
            System.out.print(R);
            N=N/10;
        }
        
  }
    void output(){
    Rdm();
}
}
