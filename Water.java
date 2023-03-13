package alg;

import java.util.Scanner;

public class Water {
   
    
    public static void Pers(){
       
        
        Scanner sc =new Scanner(System.in);
        int person;    
        do{
            System.out.println("How many person?(1-5): ");
            person = sc.nextInt();
            if(person >5){
                System.out.println("Sorry, the kettle only holds 5 servings.");
            }
            else if(person==1){
                System.out.println("We prepare " + person + " cup ");
            }
            else{System.out.println("We prepare " + person + " cups ");}
        }while(person > 5);
    }
   
}
    // public int AnswerPer(){
    //     this.person=person;
    //     answer = person;
    //     return answer;
    // }


