public class Xndir267 {
    public static void main(String[] args) {
        int [] x = { 1,3,2,-6,-9,-10};
        int [] y = { 12,25,22,-12,-1,7};


        int sum = 0;
        for (int el:x ){
            if(el%7==0){
                sum+=el;
            }
        }
        for (int el : y){
            if (el%7==0){
                sum+=el;
            }
        }
        System.out.println(sum);
    }
}
