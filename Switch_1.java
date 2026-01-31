class Switch_1{
    public static void main(String[] args){
        int month=4;
        String result=switch(month){
        case 1,3,5,7,8,12->"31 days";
        case 4,9->"30 days";
        case 2->"28/29 days";
        default ->"invalid month number";
    };
    System.out.println(result);


    }
    
}
