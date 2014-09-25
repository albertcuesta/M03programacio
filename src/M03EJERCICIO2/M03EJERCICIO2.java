/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package M03EJERCICIO2;

import java.io.IOException;

/**
 *
 * @author alumne
 */
public class M03EJERCICIO2 {
    static int[][] N;
    
    public static void main(String[] args) throws IOException {
    N = new int[2][50];   
    for (int i = 0; i < N.length; i++) {
        N[i][0] = (int) (Math.random() * 2 + 1);
        for (int x=0;x<N.length;x++){
          N[i][x] = (int) (Math.random() * 2 + 1); 
            
        }
    }
    for (int i = 0; i < N.length; i++) {
        for (int x=0;x<N.length;x++){
            System.out.println(N[i][x]);
        }}
    }
    
  
    
    
}
