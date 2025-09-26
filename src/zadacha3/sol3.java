package zadacha3;

import java.util.Random;
import java.util.Scanner;

public class sol3 {


    public static void main() {
        char[] uppercaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        char[] lowercaseLetters = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        char[] specialSymbols = "!№;%:?*()_+'[]".toCharArray();
        char[] digits = "0123456789".toCharArray();
        char[] alphabet = ("ABCDEFGHIJKLMNOPQRSTUVWXYZ" + "abcdefghijklmnopqrstuvwxyz" + "!№;%:?*()_+'[]"+"0123456789").toCharArray();
        Scanner myScanner = new Scanner(System.in);
        System.out.print("ВВЕДИТЕ ДЛИНУ ПАРОЛЯ ОТ 8 ДО 12.\n");
        int len = myScanner.nextInt();
        if (len > 12 || len < 8) {
            System.out.print("ОШИБКА");
            return;
        }
        String password;
        while (true) {
            password = "";
            for (int i = 0; i < len; i++) {
                password += getRandom(alphabet);
            }
            //System.out.println(password);
            boolean flagUpper=false;
            boolean flagLower=false;
            boolean flagSpecial=false;
            boolean flagDigit=false;
            char currentSymbol;
            for (int i=0; i<len;i++){
                currentSymbol=password.charAt(i);
                if (uppercaseLetters.toString().indexOf(currentSymbol)!=1){
                    flagUpper=true;

                }
                if (lowercaseLetters.toString().indexOf(currentSymbol)!=1){
                    flagLower=true;

                }
                if (digits.toString().indexOf(currentSymbol)!=1){
                    flagDigit=true;
                }
                if (specialSymbols.toString().indexOf(currentSymbol)!=1){
                    flagSpecial=true;
                }
            }
            if (flagUpper&&flagLower&&flagDigit&&flagSpecial&&password.length()==len){
                System.out.print("ВАШ ПАРОЛЬ: "+ password);
                return;
            }

        }

    }

    public static char getRandom(char[] array) {
        int rnd = new Random().nextInt(array.length);
        return array[rnd];
    }
}
