package com.linkcode.inheritance;


public class Wipro extends Company {

    String founder;
    int noOfEmps;
    String department;

    public void develop() {
        System.out.println("Working on project");
    }

    public void display() {
        System.out.println("CTYPE:" + this.ctype);
        System.out.println("Founder:" + this.founder);
        System.out.println("No of Employees:" + this.noOfEmps);
        System.out.println("TurnOver:" + this.turnover);
    }

    public static void main(String[] args) {

        Wipro wipro = new Wipro();

        wipro.ctype = "IT";
        wipro.turnover = 2500000;
        wipro.origin = "India";

        wipro.founder = "Azim Premji";
        wipro.noOfEmps = 200000;
        wipro.department = "Development";

        wipro.service();
        wipro.develop();
        wipro.display();
    }

}
