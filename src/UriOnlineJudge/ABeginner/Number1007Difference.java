/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UriOnlineJudge.ABeginner;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author rafael.barizon
 */
public class Number1007Difference {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        final int a = Integer.valueOf(br.readLine());
        final int b = Integer.valueOf(br.readLine());
        final int c = Integer.valueOf(br.readLine());
        final int d = Integer.valueOf(br.readLine());
        int result = a*b - c*d;
         
        System.out.printf("DIFERENCA = %d\n", result);
    }
    
}
