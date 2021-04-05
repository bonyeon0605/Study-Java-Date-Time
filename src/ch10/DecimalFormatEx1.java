package ch10;

import java.text.DecimalFormat;

public class DecimalFormatEx1 {
    public static void main(String[] args) {
        double number = 1234567.89;
        String[] parttern = {
                "0",
                "#",
                "0.0",
                "#.#",
                "0000000000.0000",
                "##########.####",
                "#.#-",
                "-#.#",

        };

        for(int i = 0; i < parttern.length; i++) {
            DecimalFormat df = new DecimalFormat(parttern[i]);
            System.out.printf("%19s : %s\n", parttern[i], df.format(number));
        }
    }
}
