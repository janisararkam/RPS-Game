import java.util.Scanner;
import java.util.Random;

public class TTT {
    public static void main(String[] args) {
        
     Scanner sc=new Scanner (System.in);
     Random random=new Random();
     
    System.out.println("GAME START");
    System.out.println("HERE ARE THE RULES :- ");
    System.out.println("1=Rock");
    System.out.println("2=paper");
    System.out.println("3=Scissor");
    

    System.out.println("enter number between 1 and 3");
    
    int user = sc.nextInt();

    int computer = random.nextInt(1,3);
    

    if (computer==1) {
        System.out.println("computer choice is rock");
    }

    else if (computer==2){
        System.out.println("computer choice is paper");
    }
    else if (computer==3){

        System.out.println("computer choice is scissor");
    }

    if (user==1) {
        System.out.println("user choice is rock");
    }

    else if (user==2){
        System.out.println("user choice is paper");
    }

    else if (user==3){

        System.out.println("user choice is scissor");
    }
    
    if (user==1 && computer==1) {
        System.out.println("tie");
    }

    else if (user==1 && computer==2){
        System.out.println("computer won");

    }
    else if (user==1 && computer==3){
        System.out.println("you won");

    }

    else if (user==2 && computer==1){
        System.out.println("you won");

    }    
    else if (user==2 && computer==2){
        System.out.println("tie");
    }
    else if (user==2 && computer==3){
        System.out.println("computer won");

    }  
    else if (user==3 && computer==1){
        System.out.println("computer won");

    }   
    else if (user==3 && computer==2){
        System.out.println("you won");

    }    
    else if (user==3 && computer==3){
        System.out.println("tie");

    }

    sc.close();

    System.out.println("THANKS FOR PLAY");
}

    
    }

