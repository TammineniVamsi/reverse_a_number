public class revers {
    public static void main(String args[]){
        int n=10899;
        int remainder;
        int rev=0;

        while(n>0){
            remainder=n%10;
            rev = (rev*10) + remainder;
            n=n/10; 

        }
        System.out.println(rev);
    }
}
