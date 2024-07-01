public class Xndir266 {
    public static void main(String[] args) {
        int [] x = { 1,3,2,-6,-9,-10};
        int [] y = { 12,25,22,-12,-1};


        int sum1 = 0;
        int sum2 = 0;

        for (int i = 0; i < x.length ; i++) {
            if (x[i]%2!=0){
                sum1 = sum1 + x[i];
            }

        }
        for (int i = 0; i < y.length; i++) {
            if(y[i]%2==0){
                sum2+=y[i];
            }

        }
        System.out.println(sum1-sum2);
    }
}
