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
public class Number1002AreaOfCircle {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws Exception {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        final String readLine = br.readLine();
        Double pi = 3.14159;
        Double raio = Double.valueOf(readLine);
        Double raioAoQuadrado = raio * raio;
        Double result = pi * raioAoQuadrado;
        System.out.printf("A=%.4f\n", result);
    }

}
