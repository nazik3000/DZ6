package alg;

import java.util.Scanner;

public class TeaBag {

   public static void Bag(){

    int x;

    Scanner sc = new Scanner(System.in);

    do{
    System.out.println("Choose your tea(1-4): ");
    x = sc.nextInt();
    if(x==1){
        System.out.printf("You put GREEN tea bag in the cup\n");
    }
    else if(x==2){
        System.out.printf("You put BLACK tea bag in the cup\n");
    }
    else if(x==3){
        System.out.printf("You put FRUIT tea bag in the cup\n");
    }
    else if(x==4){
        System.out.printf("You put CRAFT tea bag in the cup\n");
    }
    else{
        System.out.println("Make a choice from 1-4");
    }}while(x>4);
}}
