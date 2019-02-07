/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication10;
import java.util.*;
/**
 *
 * @author Tejas
 */
public class LCS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        int i,j;
         String X = new String();  
        String Y = new String();   
        Scanner s = new Scanner(System.in);
        System.out.println("Enter String X");
        X=s.next();
        System.out.println("Enter String Y");
        Y=s.next(); 
        int n = X.length();
        int m = Y.length();
        int[][] C = new int[n+1][m+1];
        int[][] B = new int[n+1][m+1];
	
        
        for (i = 0; i <= n; i++) {
            C[i][0] = 0;
        }
	
       
        for (j = 0; j <= m; j++) {
            C[0][j] = 0;
        }
        
       
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= m; j++) {
                if (X.charAt(i-1) == Y.charAt(j-1)) {
                    C[i][j]=C[i-1][j-1]+1;
                    B[i][j]=1;  /* diagonal */
                }
                else if (C[i-1][j]>=C[i][j-1]) {
                    C[i][j]=C[i-1][j];
                    B[i][j] = 2;  /* up */
                }
                else {
                    C[i][j]=C[i][j-1];     
                    B[i][j]=3;   /* forword */
                }
            }
        }
        /* Backtracking */
        String lcs = new String();
        i=n;
        j=m;
        while (i!=0 && j!=0) {
            if (B[i][j] ==1) {   /* diagonal */
                lcs =X.charAt(i-1) + lcs;
                i = i - 1;
                j = j - 1;
            }
            if (B[i][j] == 2) {  /* up */
                i = i - 1;
            }
            if (B[i][j] == 3) {  /* backward */
                j = j - 1;
            }
        }
        
        /* print out the result */
        System.out.println("String X is " + X);
        System.out.println("String Y is " + Y);
        System.out.println("The length of LCS is " + C[n][m]);
        System.out.println("The LCS is " + lcs);
        
    }
}
        // TODO code application logic here
    
 