public class Lambdas {
    public static void main(String[] args) {

        Printable lambdaPrintable = (s) -> "Meow ";
        printThing(lambdaPrintable);
     }

    static void printThing(Printable thing) {
        System.out.println(thing.print("!"));
    }
}
