package com.tutorial2;

class Main1
{
    protected void Max()
    {
        int[] N = {10,80,50,20,120};
        int Big = N[0];
        
        System.out.print("\nNilai : ");
        for(int i = 0; i < N.length; i++){
            System.out.print(N[i] + " ");
            
            Big = (N[i] > Big) ? N[i] : Big;
        }
        System.out.println("\nNilai Terbesar : " + Big);
    }
}
