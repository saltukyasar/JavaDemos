public class Main {

    public static void main(String[] args) {
        //6 mükemmek bir sayidir cünkü 1,2,3 tam bölünür ve bu sayıların toplamı 6 verir.
        int number = 219;
        int kontrol = 0;

        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                kontrol += i;
            }
        }
        if (number == kontrol) {
            System.out.println("sayiniz mükemmeldir.");
        } else {
            System.out.println("sayiniz mükemmel değil.");
        }

    }
}
