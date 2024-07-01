public class Xndir216 {
    public static void main(String[] args) {
        int [] x = { 1,3,2,-6,-9,-10};
        int [] y = { 12,25,22,-12,-1};
        int sum1 = 0;
        int sum2 = 0;
        int count1 = 0;
        int count2 = 0;
        int tvabanakan1 = 0;
        int tvabanakan2 = 0;

        for (int i = 0; i < x.length; i++) {
            sum1 = sum1 + x[i];
            count1++;



        }

        tvabanakan1 = sum1/count1;

        for (int i = 0; i < y.length; i++) {
            sum2 = sum2 + y[i];
            count2++;


        }
        tvabanakan2 = sum2/count2;

        System.out.println(tvabanakan1*tvabanakan2);
    }
}
