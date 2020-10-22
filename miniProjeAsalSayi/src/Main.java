public class Main {

    public static void main(String[] args) {
        //bug
        int number =10;
        int remainder = number % 2;
        //System.out.println(remainder);
        boolean isPrime = true;

        if (number<1){
            System.out.println("gecersiz sayi");
            return;
        }
        if (number==1){
            isPrime=false;
            System.out.println("sayi asal degildir");
            return;
        }
        for (int i=2;i<number;i++){
            if (number%i==0){
                isPrime = false;
            }
        }
        if (isPrime){
            System.out.println("sayi asaldir");
        }
        else {
            System.out.println("sayi asal degildir");
        }

    }
}
