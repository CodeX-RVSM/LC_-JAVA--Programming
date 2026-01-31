//WAP to take month number from user and print month name 
import java.util.*;

class Switch {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter month number:");
        int Month=sc.nextInt();

        String result=switch(Month){
        case 1->"Jan";
        case 2->"Feb";
        case 3->"Mar";
        case 4->"April";
        case 5->"May";
        case 6->"June";
        case 7->"July";
        case 8->"Aug";
        case 9->"Sep";
        case 10->"Oct";
        case 11->"Nov";
        case 12->"Dec";

        // case 4,9->"30 days";
        // case 2->"28/29 days";
        default ->"invalid month number";
    };
    System.out.println(result);


    }
    
}
