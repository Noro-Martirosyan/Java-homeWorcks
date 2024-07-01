import java.util.Scanner;

public class Sudent {
    private String  name;
    private String surname;
    private int age;
    private double mark;
    private String sphere;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age>0) {
            this.age = age;
        }else{
            System.out.println("cuansh te du " + age);
            Scanner input = new Scanner(System.in);
            this.age = input.nextInt();
        }
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        if(mark>0)
        this.mark = mark;
    }

    public String getSphere() {
        return sphere;
    }

    public void setSphere(String sphere) {
        this.sphere = sphere;
    }


    public void printinfo(){

        System.out.println("Name -  "+name);
        System.out.println("Surname -  "+surname);
        System.out.println("Age -  "+age);
        System.out.println("Mark -  "+mark);
        System.out.println("Sphere -  "+sphere);
    }

}
