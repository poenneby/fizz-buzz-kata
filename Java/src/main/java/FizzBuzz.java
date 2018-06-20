public class FizzBuzz {
    public final static void main(String... args) {
        if (args.length > 0) {
            int count = Integer.parseInt(args[0]);
            for (int i = 0; i<count; i++) {
                System.out.print(String.format("%s\n", i+1));
            }
        } else {
            System.out.print("1");
        }
    }
}
