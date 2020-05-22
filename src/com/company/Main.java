package com.company;


class Name {
     String name;
     Name(String name){
         this.name = name;
     }
     void Showname(){
         System.out.println(name);
     }
}

public class Main {
    private String name;
    private int gpa;// private = restricted access


    // Getter
    public String getName() {
        System.out.println(name);
        return name;
    }

    public int getGpa() {
        return gpa;
    }

    // Setter
    public void setName(String newName) {
        this.name = newName;
    }

    public void setGpa(int newGpa){
        this.gpa= newGpa;
        for(int i=0; i<5; i++){
            System.out.println("your gpa " + gpa);
        }

    }

    public static void main (String args[]){
        Main name = new Main();
        Name name1= new Name("Ryanda");
        name1.Showname();
        name.setGpa(89);
        name.getGpa();


    }
}