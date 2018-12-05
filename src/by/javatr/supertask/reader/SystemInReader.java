package by.javatr.supertask.reader;

import java.util.Scanner;

public class SystemInReader {
    private Scanner scanner = new Scanner(System.in);


    public  String readLine(){
        return scanner.next();
    }



    public  Double readDouble(){
        while (scanner.hasNextLine()){
            if(scanner.hasNextDouble()){
                return scanner.nextDouble();
            }
            scanner.next();
        }
        return null;
    }

    public Integer readCountingInteger(){
        while (scanner.hasNextLine()){
            if(scanner.hasNextInt()){
                int number = scanner.nextInt();
                if(number > 0){
                    return number;
                }
            }
            scanner.next();
        }
        return null;
    }
}
