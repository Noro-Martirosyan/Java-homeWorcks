//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {



        int[][] arr = {
                {14,34,25,22},
                {24,43,44,55},
                {12,23,46,65},
                {81,49,11,69,},
        };

        // glxavor ankyunadic

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(i==j){
                    System.out.print(" "+arr[i][j]);

            }else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }

        System.out.println("glxavor ankyunagic");

        for (int i = 0; i <= arr.length-1; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(i+j== arr.length-1){
                    System.out.print(" "+arr[i][j]);

                }else {
                    System.out.print(" ");
                }

            }

            System.out.println("erkrordalan ankyunagic");

        }
        System.out.println();


     //// erankyun No1

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if( j<=i){
                    System.out.print(" "+arr[i][j]);

                }else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }

        System.out.println();

     // erankyun No 2


        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if( j>=i){
                    System.out.print(" "+arr[i][j]);

                }else {
                    System.out.print("   ");
                }

            }
            System.out.println();
        }

        System.out.println( );
    // erankyun No 3


        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(j < arr.length/2 && j>= i ||j>=arr.length/2 && j<=arr[i].length-i-1){
                    System.out.print(" "+arr[i][j]);

                }else {
                    System.out.print("   ");
                }

            }
            System.out.println();
        }

        System.out.println();

      // erankyun No  4

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(i<arr.length/2 && j>= arr[i].length-1-i || i>= arr.length/2 &&i<=j){
                    System.out.print(" "+arr[i][j]);

                }else {
                    System.out.print("   ");
                }

            }
            System.out.println();
        }

        System.out.println();



     // erankyun  No 5


        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(j < arr[i].length/2 && j>= arr[i].length-1-i || j>= arr[i].length/2 && i>=j){
                    System.out.print(" "+arr[i][j]);

                }else {
                    System.out.print("   ");
                }

            }
            System.out.println();
        }


        System.out.println( );















        // erankyun No 6

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(i<arr.length/2 && i>=j|| i>=arr.length/2&&i+j<=arr[i].length-1){
                    System.out.print(" "+arr[i][j]);

                }else {
                    System.out.print("   ");
                }

            }
            System.out.println();
        }

        System.out.println();

    }
}