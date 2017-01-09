import java.math.BigInteger;
import java.util.Scanner;
/**
 * 
 * @author TJ Zimmerman
 * @version 1.0
 * Date: 4/11/2013
 * 
 * Does RSA encryption
 */
public class RSAThing {
    /**
     * @param args
     */
    public static void main(String[] args) {
        BigInteger b;
        BigInteger n;
        BigInteger m;
        Scanner in = new Scanner(System.in);

        System.out.print("Insert an integer (b): ");
        b = in.nextBigInteger();
        System.out.println();
        System.out.print("Insert another integer(n): ");
        n = in.nextBigInteger();
        System.out.println();
        System.out.print("Insert another integer(m): ");
        m = in.nextBigInteger();
        System.out.println();

        System.out.print(modExp(b, binaryConverter(n), m));

    }

    /**
     * Should it be BigInteger?
     * @param b
     * @param binaryBlob
     * @param m
     * @return
     */
    public static BigInteger modExp(BigInteger b, String binaryBlob, BigInteger m){
        BigInteger x = BigInteger.valueOf(1);
        BigInteger power = b.mod(m);
        BigInteger tempWhatever;
        String temp = "";
        int count = 0;

        for(int i = 0; i < binaryBlob.length(); i++){
            temp += binaryBlob.charAt(i);
            System.out.println("Temp: " + temp);

            if(Integer.parseInt(temp) == 1){
                //tempWhatever is used to hold values because I think I'd have to break up arithmetic down on
                //otherwise a single line
                tempWhatever = x.multiply(power);
                System.out.println("tempWhatever column*********");
                System.out.println("x: " + x);
                System.out.println("power: " + power);
                System.out.println("tempWhatever: " + tempWhatever);
                System.out.println();
                x = tempWhatever.mod(m);
                System.out.println("x  column*********");
                System.out.println("M: " + m);
                System.out.println("x: " + x);
                System.out.println();
                tempWhatever = power.multiply(power);
                System.out.println("tempWhatever2 column*********");
                System.out.println("Power: " + power);
                System.out.println("tempWhatever2: " + tempWhatever);
                System.out.println();
                power = tempWhatever.mod(m);
                System.out.println("Power column*********");
                System.out.println("m: " + m);
                System.out.println("Power: ");
                System.out.println();
            }

            temp = "";
            count++;
            System.out.println("Count: " + count);
            System.out.println("Restarting now\n\n\n");
        }

        return x;
        //System.out.println("X: " + x);
    }

    /**
     * Converts decimal to binary
     * @param n the number to be converted
     * @return the binary number
     */
    public static String binaryConverter(BigInteger n) {
        int k = 0;
        String result = "";
        String temp = "";
        BigInteger tempWhatever = null;
        while (n != BigInteger.ZERO) {
            tempWhatever = n;
            tempWhatever = tempWhatever.mod(BigInteger.valueOf(2));
            temp += tempWhatever.toString();
            n = n.divide(BigInteger.valueOf(2));
            k++;
        }

        while(k > 0) {
            k--;
            result += temp.charAt(k);
        }

        return result;
    }
}
