import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void  main(String[] args) {

        Scanner scaner = new Scanner(System.in);


        Sudent  Student  =  new Sudent();

        System.out.println("enter name");
        Student.setName(scaner.next());
        System.out.println("enter surname");
        Student.setSurname(scaner.next());
        System.out.println("enter age");
        Student.setAge(scaner.nextInt());
        System.out.println("enter mark");
        Student.setMark(scaner.nextDouble());
        System.out.println("enter sphere");
        Student.setSphere(scaner.next());



       

        Student.printinfo();



    }


    }

