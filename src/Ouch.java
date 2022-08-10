public class Ouch {
    static int outch = 7;

    public static void main(String[] args) {
        new Ouch().go(outch);
        System.out.println(" "+ outch);
    }
    void go(int outch){
        outch++;
        for (outch = 3; outch < 6; outch++) ;


        System.out.println(" " + outch);
    }
}
