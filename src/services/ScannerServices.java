package services;


import com.sun.org.apache.xerces.internal.impl.xpath.regex.ParseException;
import utils.Prints;

import java.util.Scanner;

public class ScannerServices {

    Scanner in = new Scanner(System.in);

    public String scannerString(){
        boolean exit = false;
        int attempts = 0;
        String scanner = "";
        Prints prints = new Prints();
        do{
            scanner = in.nextLine();
            try {
                Integer.parseInt(scanner);
                attempts++;
                prints.failInputData(3-attempts);
            } catch (NumberFormatException e){
                exit = true;
            }
            if (attempts == 3){
                prints.outOfAttempts();
                scanner = null;
                exit = true;
            }
        }while (!exit);
        return scanner;
    }
    public int scannerInt(){
        boolean exit = false;
        int attempts = 0;
        int result = 0;
        Prints prints = new Prints();
        do{
            String scanner = in.nextLine();
            try {
                result = Integer.parseInt(scanner);
                exit = true;
            } catch (ParseException e){
                attempts++;
                prints.failInputData(3-attempts);
            }
            if (attempts ==3){
                prints.outOfAttempts();
                result = 0;
                exit = true;
            }
        }while (!exit);
        return result;
    }
}
