package com.tutorial;

public class Str {

    public static void main(String[] args) {
        StringBuffer Kt1 = new StringBuffer("Sistem Basis Data");
        StringBuffer Kt2 = new StringBuffer();
        char Kar;
        for(int I=0; I<Kt1.length(); I++){
            Kar=Kt1.charAt(I);
            if(Kar != ' '){
            Kt2.append(Kar);
            }else{
                System.out.print(Kt2.reverse());
                System.out.print(" ");
                Kt2.delete(0, Kt2.length());
            }
        }
        System.out.println(Kt2.reverse());
    }
    
}
