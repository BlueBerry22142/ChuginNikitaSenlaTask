package zadacha2;

import java.util.Scanner;

public class sol2 {
    public static void main() {

        final float USDCNY=7.1337f;
        final float USDRUB=83.4852f;
        final float USDGBP=0.7459f;
        final float USDINR=88.683f;
        final float USDKZT=545.790f;
        System.out.println("НИЖЕ ПРЕДСТАВЛЕН СПИСОК ТИКЕРОВ С РАСШИФРОВКОЙ И КУРСОМ.\n");
        System.out.print("CNY - КИТАЙСКИЙ ЮАНЬ, ОБМЕН 1 USD К " +USDCNY+" CNY\n");
        System.out.print("RUB - РОССИЙСКИЙ РУБЛЬ, ОБМЕН 1 USD К "+USDRUB+" RUB\n");
        System.out.print("GBP - БРИТАНСКИЙ ФУНТ, ОБМЕН 1 USD К "+USDGBP+" GBP\n");
        System.out.print("INR - ИНДИЙСКАЯ РУПИЯ, ОБМЕН 1 USD К "+USDINR+" INR\n");
        System.out.print("KZT - КАЗАХСТАНСКИЙ ТЕНГЕ, ОБМЕН 1 USD К "+USDKZT+" KZT\n");
        Scanner myScanner=new Scanner(System.in);
        float count;
        String ticker;
        float result;
        while (true){
            System.out.print("\nВВЕДИТЕ ВАШЕ КОЛИЧЕСТО ДОЛЛАРОВ США(USD), ДЕСЯТИЧНЫМ РАЗДЕЛИТЕЛЕМ ЯВЛЯЕТСЯ ЗАПЯТАЯ\n");
            count = myScanner.nextFloat();
            System.out.print("ВЕДИТЕ ТИКЕР ЦЕЛЕВОЙ ВАЛЮТЫ\n");
            ticker=myScanner.next();
            switch (ticker){
                case "CNY":{
                    result=USDCNY*count;
                    break;
                }
                case "RUB":{
                    result=USDRUB*count;
                    break;
                }
                case "INR":{
                    result=USDINR*count;
                    break;
                }
                case "GBP":{
                    result=USDGBP*count;
                    break;
                }
                case "KZT":{
                    result=USDKZT*count;
                    break;
                }
                default:{
                    System.out.print("ОШИБКА: ТИКЕР НЕ НАЙДЕН.\n");
                    continue;
                }

            }
            System.out.print(count+" USD = " +result+" "+ticker);
        }
    }
}
