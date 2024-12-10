import java.util.logging.Level;
import java.util.logging.Logger;

public class StringMethods {
    static final String DOT_LINES = "---------------------------";
    static final Logger logger = Logger.getLogger(DOT_LINES);

    public static void main(String[] args) {

        logger.log(Level.INFO, DOT_LINES);
        logger.log(Level.INFO, "---String methods in Java---");
        logger.log(Level.INFO, DOT_LINES);

        var collection1 = "Collection 1";

        // length: Returns the length of a specified string.
        logger.log(Level.INFO, "---length in Java---");
        // length in Java is determined by the number of characters in the string. 
        logger.log(Level.INFO, "collection1 length: {0}", collection1.length());


        // replace: Searches a string for a specified value, and returns a new string where the specified values are replaced.
        logger.log(Level.INFO, "---replace in Java---");
        // replace is used to replace all occurrences of a specified value with another value in a string
        var newCollection1 = collection1.replace("1", "2 new String");
        logger.log(Level.INFO, "old collection1: {0}", collection1);
        logger.log(Level.INFO, "new collection1 with replaced: {0}", newCollection1);


        // toUpperCase: Converts a string to upper case.
        logger.log(Level.INFO, "---toUpperCase in Java---");
        // toUpperCase is used to convert a string to uppercase
        var newCollection2 = collection1.toUpperCase();
        logger.log(Level.INFO, "collection1: {0}", collection1);
        logger.log(Level.INFO, "new collection2 with toUpperCase: {0}", newCollection2);


        // toLowerCase: Converts a string to lower case.
        logger.log(Level.INFO, "---toLowerCase in Java---");
        // toLowerCase is used to convert a string to lowercase
        var newCollection3 = newCollection2.toLowerCase();
        logger.log(Level.INFO, "old newCollection2: {0}", newCollection2);
        logger.log(Level.INFO, "new collection3 with toLowerCase: {0}", newCollection3);


        // trim: Removes whitespace from both ends of a string.
        logger.log(Level.INFO, "---trim in Java---");
        // trim is used to remove whitespace from both ends of a string
        var newCollection4 = "   collection1    ";
        logger.log(Level.INFO, "collection4: {0}", newCollection4);
        logger.log(Level.INFO, "new collection4 with trim: {0}", newCollection4.trim());


        // substring: Returns a new string that is a substring of this string.
        logger.log(Level.INFO, "---substring in Java---");
        // substring is used to extract a substring from a string. If the end argument is not specified then the substring will end at the end of the string. The first argument is required and is the index of the character at which the substring starts. The second argument is optional and is the index after the last character of the substring.
        String newString1 = "Laboris laboris est id mollit aliqua.";
        logger.log(Level.INFO, "Original newString1: {0}", newString1);
        var newCollection5 = newString1.substring(0, 7);
        logger.log(Level.INFO, "new newString1 with substring: {0}", newCollection5);


        // indexOf: Returns the index within this string of the first occurrence of the specified character or Returns the position of the first found occurrence of specified characters in a string.
        logger.log(Level.INFO, "---indexOf in Java---");
        // indexOf is used to find the index of a character or characters in a string.
        // Use the lastIndexOf method to return the position of the last occurrence of specified character(s) in a string.
        var newCollection6 = newString1.indexOf("is");
        logger.log(Level.INFO, "new newString1 with indexOf: {0}", newCollection6);


        // lastIndexOf: Returns the index within this string of the last occurrence of the specified character or Returns the position of the last found occurrence of specified characters in a string.
        logger.log(Level.INFO, "---lastIndexOf in Java---");
        // lastIndexOf is used to find the index of a character or characters in a string.
        // Use the lastIndexOf method to return the position of the last occurrence of specified character(s) in a string.
        // An int value, representing the index of the first occurrence of the character in the string, or -1 if it never occurs
        var newCollection7 = newString1.lastIndexOf("is");
        logger.log(Level.INFO, "new newString1 with lastIndexOf: {0}", newCollection7);


        // 

    }
}
