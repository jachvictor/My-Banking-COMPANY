package com.codewithjach;

import java.util.ArrayList;
import java.util.Scanner;

public class MyBankServices {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("welcome to JACH UNITED BANK, here are the list of our services: ");
        System.out.println("(please, specify by typing the numberings)");
        System.out.println("1-register an account with us");
        System.out.println("if you have an account already:");
        System.out.println("2-deposit money");
        System.out.println("3-withdraw money");
        System.out.println("4-apply for a loan");
        System.out.print("click here to type_");
        short input1 = scan.nextShort();

        if (input1 <= 4) {
            if (input1 == 1) {
                System.out.println("Dear customer, welcome to JACH UNITED BANK,");
                System.out.println("please, kindly enter the following data:");
                Scanner scanner = new Scanner(System.in);
                System.out.println("Name:");
                String name1 = scan.next();
                System.out.println("age:");
                int db = scan.nextInt();
                System.out.println("mobile number/phone number");
                int phoneNo = scan.nextInt();
                System.out.println("thanks for providing us with your neccessary information");
                System.out.println("you can now create your account password and user name");

            }
            else if (input1 == 2) {
                ArrayList<String> namesRegister=new ArrayList<>();
                namesRegister.add("jachi");
                ArrayList<Integer> accountPassword = new ArrayList<>();
                accountPassword.add(1357);

                System.out.println("welcome to JACH UNITED BANK,enter your username and account passworrd");
                System.out.println("name");
                String nameinput = scan.next();
                System.out.println("account password(four digit code)");
                String accpass=scan.next();
                if (namesRegister.contains(nameinput)){
                    System.out.println("verification successful,how much are you depositing");
                    long amount= scan.nextLong();
                    System.out.println("the sum of cash that was successfully deposited to your account is "+amount);
                }else System.out.println("you are not registered with us(make sure to type correctly)");

            }
        } else System.out.println("not an option");

    }
}
