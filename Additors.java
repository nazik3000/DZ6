package alg;

import java.util.Scanner;

public class Additors {

    public static void Add(){
        int bool;
        Scanner sc = new Scanner(System.in);


        do{
        System.out.println("Do you need the additors?(0-Yes; 1-No): ");
        bool = sc.nextInt();
        int ch;
        if(bool==1){
            System.out.println("OK, add nothing");
        }else if(bool==0){
            Scanner c = new Scanner(System.in);
            do{
            System.out.println("Perfect, what kind of additors you want?(1-4): ");
            ch = c.nextInt();
            if(ch==1){
                System.out.println("Your choose the SUGAR");
            }else if(ch==2){
                System.out.println("Your choose the LEMON");
            }else if(ch==3){
                System.out.println("Your choose the MILK");
            }else if(ch==4){
                System.out.println("Your choose the HONEY");
            }else{
                System.out.println("You need to make a choice");
            }}while(ch>4);
        }else{
            System.out.println("Cmooon!!");
        }}while(bool>1);
    }
}
