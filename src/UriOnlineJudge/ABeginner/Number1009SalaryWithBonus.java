/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UriOnlineJudge.ABeginner;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 *
 * @author rafael.barizon
 */
public class Number1009SalaryWithBonus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        final String name = br.readLine();
        final BigDecimal salary = new BigDecimal(br.readLine()).setScale(2);
        final BigDecimal valueSold = new BigDecimal(br.readLine()).setScale(2);
        final BigDecimal salaryWithBonus = salary.add(valueSold.multiply(new BigDecimal("0.15"))).setScale(2, RoundingMode.HALF_EVEN);
        String salaryWithBonusString = salaryWithBonus.toString();
        System.out.printf("TOTAL = R$ "+salaryWithBonusString+"\n");
    }
    
}
