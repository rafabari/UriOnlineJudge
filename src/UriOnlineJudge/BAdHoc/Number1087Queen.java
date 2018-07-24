package UriOnlineJudge.BAdHoc;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author rafael.barizon
 */
public class Number1087Queen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        Map<Integer, String> lines = new LinkedHashMap<>();
        Map<Integer, Integer> result = new LinkedHashMap<>();
        Integer linha = 0;
        while (true) {
            String readLine = br.readLine();
            if (readLine.contains("0 0 0 0")) {
                break;
            }
            lines.put(linha++, readLine);
        }

        lines.forEach((k, v) -> {
            final String[] split = v.split(" ");
            List<Integer> values = new ArrayList<>();
            for (String value : split) {
                values.add(Integer.valueOf(value));
            }
            final Integer x1 = values.get(0);
            final Integer y1 = values.get(1);
            final Integer x2 = values.get(2);
            final Integer y2 = values.get(3);

            if (x1.equals(x2) && y1.equals(y2)) {
                result.put(k, 0);
            } else {
                if (x1.equals(x2) || y1.equals(y2)) {
                    result.put(k, 1);
                } else if ((x1 + y1) == (x2 + y2)) {
                    result.put(k, 1);
                } else if ((x1 - x2) == (y1 - y2)) {
                    result.put(k, 1);
                } else {
                    result.put(k, 2);
                }
            }
        });

        result.forEach((k, v) -> System.out.println(v));
    }

}
