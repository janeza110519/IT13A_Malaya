/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prelim;

/**
 *
 * @author Admin
 */
public class Lab_act1_Arithmetics {
     public static void main(String[] args) {
        int c = 10;
        int o = 4;
        int n = 6;
        int r = 3;
        
        int pul = c * o + n;
        int pat = (c - o ) % r;
        int pau = (c + o + n ) / r;
        int leg = c * n - ( o * o);
        
        System.out.println("10 * 4 + 6 =" + pul);
        System.out.println("10 - 4 % 6 =" + pat);
        System.out.println("10 + 4 + 6 =" + pau);
        System.out.println("10 * 6 - 4 * 4 =" + leg);
       
     }
     
}

