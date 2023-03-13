package dz4.Dz6;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Methods {

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int[] num = {1,5,17,22,35,12,6,88,95,42,136,781,215,3,75,102};
        
        System.out.println("Задание 7\nСумма каждого второго элемента масива: \n"+sumEverySecond(num));
        System.out.println("Задание 1\nЭлементы кратные числу: \n"+Arrays.toString(multiples(num, 3)));
        System.out.println("Задание 2\nСумма всех не парных элементов масива: \n"+sumNotPair(num));                   
        System.out.println("Задание 3\nИндексы элементов масива: \n"+Arrays.toString(index(num)));       
        System.out.println("Задание 4\nМасив отсортированый за увеличением: \n"+Arrays.toString(sort(num)));        
        System.out.println("Задание 4\nМасив отсортированый за уменьшением: \n"+Arrays.toString(sortBack(num)));       
        System.out.println("Задание 5\nКоличество парных элементов масива: \n"+pair(num));                        
        System.out.println("Задание 6\nКоличество не парных элементов масива: \n"+notPair(num));                     
                                 

    }

    // Делитель
    public static int[] multiples(int[] num, int in){ 
        int size =0;
        for (int i = 0; i < num.length; i++) {
            if(num[i]%in==0 ){
                size++;
            }
       }
       int[] newArray = new int[size];
 
       int count=0;
       for (int i = 0; i < num.length; i++) {
            if(num[i]%in == 0){   
                newArray[count] = num[i];
                count++;
        }
       }
       return newArray;
    }
    
    public static int sumNotPair(int[] num){
        int count=0;
        for (int i = 0; i < num.length; i++) {
            if (num[i] % 2 != 0) {
                count = count +num[i];
            }
        }
        return count;
    }

    public static int[] index(int[] num){
        int[] newArray  = new int[num.length];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = i;
        }
        return newArray;
    }

    public static int[]  sort(int[] num){
        Arrays.sort(num);
        return num;
    }

    public static int[] sortBack(int[] num){  
        boolean swap;
        do{  
            swap = false;
        for (int i = 0; i < num.length-1; i++) {
            if(num[i]<num[i+1]){
                int temp = num[i];
                num[i] = num[i+1];
                num[i+1] = temp;

                swap=true;
            }
        }
    
    }while(swap);
        
        return num;
    }

    public static int pair(int[] num) {
        int count=0;
        for (int i = 0; i < num.length; i++) {
            if (num[i] % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public static int notPair(int[] num){
        int count=0;
        for (int i = 0; i < num.length; i++) {
            if (num[i] % 2 != 0) {
                count ++;
            }
        }
        return count;
    }

    public static int sumEverySecond(int[] num) {  //1055
        int count=0;
        int ind =0;
        for (int i = 0; i < num.length; i++) {
            
            if (num[i] != num[0] && i%2!=0 ) {
                count = count + num[i];
            }
        }
        return count;
    }
}

