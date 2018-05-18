package com.github.epietras220.tree;

public class Tree {
    public void halfTree(int n){
        for (int i=0;i<n;i++){
            for (int j =0; j<=i;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }

    public void Tree(int n){
        for (int i =0; i<n;i++){
            for (int k=0; k<n-i;k++){
                System.out.print(" ");
            }
            for (int j =0; j<=i*2;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
