package com.smu.mscda;
import java.util.Scanner;
import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.lang3.StringUtils;

public class Main {
    public static void main(String[] args) {
        System.out.println("This program will capitalize the input and generate MD5hex");
        System.out.println("\nEnter the input string");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println("\nCapitalized string is: "+ Capital(input) );
        System.out.println("\nMD5 hex is: "+ Md5(input));

    }
    public static String Capital(String input){
        return StringUtils.capitalize(input);
    }

    public static String  Md5(String input){
        return DigestUtils.md5Hex(input);
    }

}
