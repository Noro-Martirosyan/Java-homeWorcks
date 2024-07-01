public class Xndir264 {
    public static void main(String[] args) {
        int [] x = { 1,3,2,-6,-9,-10};
        int [] y = { 12,25,22,-12,-1};

        int count1 = 0;
        int count2 = 0;

        for (int i = 0; i < x.length; i++) {
            if(x[i]<0){
                count1++;
            }


        }
        for (int i = 0; i < y.length; i++) {
            if (y[i]<0){
                count2++;
            }

        }
        System.out.println(count1+count2);
    }
}
