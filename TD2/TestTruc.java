public class TestTruc {
    public static void main(String[] args) {
        Truc t = new Truc();
        Truc t2 = new Truc(2);
        double deux = 2;
        int i = 2.5;
        t.maMethode(2);
        t.maMethode(deux);
        t.maMethode(2.);
        t.maMethode(1, 2);
        t.maMethode(1, 2, 3);
        t.maMethode(1., 2, 3);
    }
}
