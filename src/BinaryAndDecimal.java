
import java.util.Scanner;
public class BinaryAndDecimal {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Type 1 for Binary to Decimal or type 2 for Decimal to Binary: ");

        int menuChoice = input.nextInt();
        input.nextLine();
        if (menuChoice == 1){
            System.out.print("\nEnter a binary number: ");
            String binary = input.nextLine();
            System.out.println(binary2decimal(binary));
        }
        else {
            System.out.print("\nEnter a decimal number: ");
            int decimal = input.nextInt();
            System.out.println(decimal2binary(decimal));
        }

    }

    static double power(int b, int e){
        return Math.pow(b, e);
    }

    static double power2(int a){
        return power(2, a);
    }

    static int binary2decimal(String binaryNumber){
        int result = 0;
        for(int i = 0; i < binaryNumber.length(); i++){
            if(binaryNumber.charAt(i) == '1'){
                int power = binaryNumber.length() - (i + 1);
                result += (int) power2(power);
        }

        }
        return result;
    }

    static String decimal2binary(int num){
        String number = "";
        while (num > 0){
            number += num % 2;
            num = num / 2;
        }
        String binaryNumber = "";
        for (int i = number.length() - 1; i > -1; i--){
            binaryNumber += number.charAt(i);
        }
        return binaryNumber;
    }

}