

public class Day5<T> {

    private T a;
    private T b;

    public Pair_Day5(T a, T b) {
        this.a = a;
        this.b = b;
    }

    public static <T> Pair_Day5<T> cons(T a, T b) {
        return new Pair_Day5<T>(a, b);
    }

    public static <T> T car(Pair_Day5 p) {
        return (T)p.a;
    }

    public static <T> T cdr(Pair_Day5 p) {
        return (T)p.b;
    }

    @Override
    public String toString() {
        return "(" + a + "," + b + ")";
    }
    
    public static void main(String[] args) {
        Pair_Day5<Integer> p = Pair_Day5.cons(3,4);
        System.out.println("The pair is: " + p);
        Integer a = Pair_Day5.car(p);
        System.out.println("Output of Pair.car(): " + a);
        Integer b = Pair_Day5.cdr(p);
        System.out.println("Output of Pair.cdr(): " + b);
    }
}