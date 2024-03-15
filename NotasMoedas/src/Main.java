import java.math.BigDecimal;
import java.nio.DoubleBuffer;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Integer[] notes = new Integer[]{100, 50, 20, 10, 5, 2}; //array com as notas
        int value;
        Double valueDouble;
        String[] cents = new String[] {"1.00", "0.50", "0.25", "0.10", "0.05", "0.01"};
        double money = -1;

        Scanner scanner = new Scanner(System.in);

        while(money < 0 || money > 1000000.00) {
            money = scanner.nextDouble();
        }
        System.out.println("NOTAS:");
        for(int i = 0; i < notes.length; i++) {
            value = (int)(money / notes[i]);
            System.out.println(value + " nota(s) de R$ " + notes[i] + ".00");
            money %= notes[i];
        }
        System.out.println("MOEDAS:");
        for(int i = 0; i < cents.length; i++) {
            value = (int)(money / Double.parseDouble(cents[i]));
            System.out.println(value + " moeda(s) de R$ " + cents[i]);
            //money %= Double.parseDouble(cents[i]);
            money %= new BigDecimal(cents[i]);
        }
        scanner.close();
    }
}