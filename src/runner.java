public class runner {
    public static void main(String[] args) {
        int x = 15;
        int y = 15;

        System.out.println("-- Set A --");
        boolean what = (x >= 10) == (y == 10);
        System.out.println(what);

        what = (x < 10) != (y != 10);
        System.out.println(what);

        what = (x >= y) == (x == y);
        System.out.println(what);

        System.out.println("-- Set B --");
        y = 16;
        what = (x >= y) == (x == y);
        System.out.println(what);

        y = 14;
        what = (x >= y) == (x == y);
        System.out.println(what);

        what = (x != x) != (y == y);
        System.out.println(what);

        System.out.println("-- Set C --");
        boolean hi = (x != y);
        boolean bye = (hi != true);
        System.out.println((hi != false) == (bye != what));

        what = ((x <= y) == (y > 10)) != (hi == bye);
        System.out.println(what);

        Dog d1 = new Dog("Max", 5, false);
        Dog d2 = new Dog("Marcy", 8, true);
        int a = d2.getName().length();
        boolean b = (d1.getAge() > a);
        System.out.println(b);


    }
}
