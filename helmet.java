public class helmet {

    String cname;
    String Size;
    String type;
    int price;
    String color;

    helmet(String cname,String Size,String type,int price,String color){
        this.cname=cname;
        this.Size=Size;
        this.type=type;
        this.price=price;
        this.color=color;
    }

    public void getInfo(){
        System.out.println("Company_name: "+cname);
        System.out.println("Size : "+Size);
        System.out.println("type : "+type);
        System.out.println("price : "+price);
        System.out.println("Color : "+color);
        System.out.println("-------------");
    }

    public void protection(){
        System.out.println("hemet Protect while Accident");
    }



    
}
