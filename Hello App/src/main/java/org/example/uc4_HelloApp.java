public class uc4_HelloApp {

    public static void main(String[] args) {

        String name = "World"; // Default value when no input is given

        // If names are provided through command-line arguments
        if (args.length > 0) {

            StringBuilder nameBuilder = new StringBuilder();

            for (int i = 0; i < args.length; i++) {
                nameBuilder.append(args[i]);

                if (i < args.length - 1) {
                    nameBuilder.append(", ");
                }
            }

            name = nameBuilder.toString(); // Use the provided names
        }

        System.out.println("Hello, Kriti!");
    }
}