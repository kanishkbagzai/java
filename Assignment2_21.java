class NoMatchFoundException extends Exception {
    public NoMatchFoundException(String message) {
        super(message);
    }
}
public class Assignment2_21 {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please enter a country name as a command-line argument.");
            return;
        }

        String country = args[0];
        String capital;

        try {
            if (country.equals("USA")) {
                capital = "Washington, D.C.";
            } else if (country.equals("Canada")) {
                capital = "Ottawa";
            } else if (country.equals("Mexico")) {
                capital = "Mexico City";
            } else if (country.equals("Germany")) {
                capital = "Berlin";
            } else if (country.equals("France")) {
                capital = "Paris";
            } else if (country.equals("Japan")) {
                capital = "Tokyo";
            } else {
                throw new NoMatchFoundException("No capital found for the country: " + country);
            }

            System.out.println("The capital of " + country + " is: " + capital);
        } catch (NoMatchFoundException e) {
            System.out.println("Caught NoMatchFoundException: " + e.getMessage());
        }
    }
}