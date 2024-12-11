package Example01.src;

public class Example01 {
    public static void main(String[] args) {
        System.out.println("Example01 - Working with Java");

        String nameUser = "   John  Doe  Jones   ";
        String businessName = "My New Company";
        String domain = "com.abc";

        System.out.println("Final Email Result ");
        var normalizedName = nameUser.strip();
        normalizedName = normalizedName.replace("  ",".").toLowerCase();
        System.out.println("Name: " + normalizedName);
        var normalizedBusinessName = businessName.trim();
        normalizedBusinessName = normalizedBusinessName.replace(" ","").toLowerCase();
        System.err.println("Business: " + normalizedBusinessName);
        var finalEmail = normalizedName + "@" + normalizedBusinessName + "." + domain;
        System.out.println("Email: " + finalEmail);

        // printf: this method is used to format and print data.
        System.out.printf("Final Email Result: %s@%s.%s%n", normalizedName, normalizedBusinessName, domain);
    }
}