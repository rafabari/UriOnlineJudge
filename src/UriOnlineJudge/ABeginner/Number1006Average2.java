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
public class Number1006Average2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        final Double gradeA = Double.valueOf(br.readLine());
        final Double gradeB = Double.valueOf(br.readLine());
        final Double gradeC = Double.valueOf(br.readLine());
        Double result = ((gradeA*2) + (gradeB*3) + (gradeC*5))/10;
        System.out.printf("MEDIA = %.1f\n", result);
    }
    
}
