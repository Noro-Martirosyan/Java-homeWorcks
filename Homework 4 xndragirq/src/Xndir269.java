public class Xndir269 {
    public static void main(String[] args) {
        int [] x = { 1,3,2,-6,-9,-10};
        int [] y = { 12,25,22,-12,-1,7};

       int sum = 0;

        for (int i = 0; i < x.length; i++) {
            if(i%2==0){
                sum += x[i];

            }

        }
        for (int i = 0; i < y.length; i++) {
            if(i%2==0){
                sum += y[i];

            }

        }
        System.out.println(sum);
    }
}
