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
public class Number1008Salary {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        final int number = Integer.valueOf(br.readLine());
        final int hours = Integer.valueOf(br.readLine());
        final Double valueHour = Double.valueOf(br.readLine());
        Double salary = hours*valueHour; 
        System.out.printf("NUMBER = %d\n", number);
        String a = String.format("SALARY = U$ %.2f\n", salary).replace(',', '.');
        System.out.printf(a);
    }
    
}
