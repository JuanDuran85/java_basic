package BasicTheory.StringMethods.src;

import java.util.logging.Level;
import java.util.logging.Logger;

public class StringMethods {
    static final String DOT_LINES = "---------------------------";
    static final Logger logger = Logger.getLogger(DOT_LINES);

    public static void main(String[] args) {

        logger.log(Level.INFO, DOT_LINES);
        logger.log(Level.INFO, "---String Creation in Java---");
        logger.log(Level.INFO, DOT_LINES);

        var collection1 = "Collection 1";
        var collection2 = new String("Collection 2");
        logger.log(Level.INFO, "collection1: {0}", collection1);
        logger.log(Level.INFO, "collection2: {0}", collection2);

        var collection3 = collection1 + " " + collection2;
        logger.log(Level.INFO, "collection3: {0}", collection3);

        String textBlock = """
                This is a textBlock or multiline
                string. It uses
                triple quotes.
                """;

        logger.log(Level.INFO, "textBlock: {0}", textBlock);
        logger.log(Level.INFO, DOT_LINES);
        logger.log(Level.INFO, "---charAt in Java---");
        logger.log(Level.INFO, DOT_LINES);
        /*
         * The charAt() method returns the character at the specified index in the
         * string. The index is zero based.
         */
        String usingCharAt = "Non reprehenderit nulla enim nulla.";
        logger.log(Level.INFO, "usingCharAt.charAt(0): {0}", usingCharAt.charAt(0));
        logger.log(Level.INFO, DOT_LINES);

        logger.log(Level.INFO, DOT_LINES);
        logger.log(Level.INFO, "---comparator string in Java---");
        logger.log(Level.INFO, DOT_LINES);

        /*
         * If we use "==" operator to compare two strings, it will compare their memory
         * addresses or references.
         * If we use the equals() method, it will compare their characters.
         */

        var compare1 = "Hello";
        var compare2 = "Hello";
        var compare3 = new String("Hello");

        logger.log(Level.INFO, "compare1 == compare2: {0}", compare1 == compare2);
        logger.log(Level.INFO, "compare1.equals(compare2): {0}", compare1.equals(compare2));
        logger.log(Level.INFO, "compare1 == compare3: {0}", compare1 == compare3);

        logger.log(Level.INFO, DOT_LINES);
        logger.log(Level.INFO, "---Spacial characters in Java---");
        logger.log(Level.INFO, DOT_LINES);


        /*
         * Java supports Unicode characters, including special characters.
         */

        // Special Character \n: insert a new line
        var newLineString = "Ea sit nostrud eiusmod.\nEa sit nostrud eiusmod irure.";
        logger.log(Level.INFO, "newLineString \\n: {0}", newLineString);
        // Special Character \t: insert a tab
        var tabString = "\tEa sit nostrud eiusmod.\tEa sit nostrud.";
        logger.log(Level.INFO, "tabString \\t: {0}", tabString);
        // Special Character \r: insert a return
        var returnString = "Ea sit nostrud eiusmod.\rEa sit nostrud eiusmod irure.";
        logger.log(Level.INFO, "returnString \\r: {0}", returnString);
        // Special Character \f: insert a form feed
        var formFeedString = "Ea sit nostrud eiusmod.\fEa sit nostrud eiusmod irure.";
        logger.log(Level.INFO, "formFeedString \\f: {0}", formFeedString);
        // Special Character \b: insert a backspace
        var backSpaceString = "Ea sit nostrud eiusmod irure.\bEa sit nostrud eiusmod irure.";
        logger.log(Level.INFO, "backSpaceString \\b: {0}", backSpaceString);
        // Special Character \: insert a literal backslash
        var backSlashString = "Ea sit nostrud eiusmod irure.\\Ea sit nostrud eiusmod irure.";
        logger.log(Level.INFO, "backSlashString \\\\: {0}", backSlashString);
        // Special Character \': insert a single quote
        var singleQuoteString = "Ea sit nostrud eiusmod irure.'Ea sit nostrud eiusmod irure.";
        logger.log(Level.INFO, "singleQuoteString \'': {0}", singleQuoteString);
        logger.log(Level.INFO, DOT_LINES);
        // Special Character \s: insert a whitespace
        var whitespaceString = "Ea sit nostrud eiusmod irure.\sEa sit nostrud eiusmod irure.";
        logger.log(Level.INFO, "whitespaceString \\s: {0}", whitespaceString);


        logger.log(Level.INFO, DOT_LINES);
        logger.log(Level.INFO, "---String methods in Java---");
        logger.log(Level.INFO, DOT_LINES);

        var collection11 = "Collection 1";

        // length: Returns the length of a specified string.
        logger.log(Level.INFO, "---length in Java---");
        // length in Java is determined by the number of characters in the string.
        logger.log(Level.INFO, "collection11 length: {0}", collection11.length());

        // replace: Searches a string for a specified value, and returns a new string
        // where the specified values are replaced.
        logger.log(Level.INFO, "---replace in Java---");
        // replace is used to replace all occurrences of a specified value with another
        // value in a string
        var newCollection1 = collection11.replace("1", "2 new String");
        logger.log(Level.INFO, "old collection11: {0}", collection11);
        logger.log(Level.INFO, "new collection11 with replaced: {0}", newCollection1);

        // repeat: Repeats a specified string a specified number of times.
        logger.log(Level.INFO, "---repeat in Java---");
        // repeat is used to repeat a string a specified number of times
        var newCollection6 = "collection1".repeat(3);
        logger.log(Level.INFO, "collection1: {0}", collection11);
        logger.log(Level.INFO, "new collection6 with repeat: {0}", newCollection6);

        // toUpperCase: Converts a string to upper case.
        logger.log(Level.INFO, "---toUpperCase in Java---");
        // toUpperCase is used to convert a string to uppercase
        var newCollection2 = collection11.toUpperCase();
        logger.log(Level.INFO, "collection11: {0}", collection11);
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
        // substring is used to extract a substring from a string. If the end argument
        // is not specified then the substring will end at the end of the string. The
        // first argument is required and is the index of the character at which the
        // substring starts. The second argument is optional and is the index after the
        // last character of the substring.
        String newString1 = "Laboris laboris est id mollit aliqua.";
        logger.log(Level.INFO, "Original newString1: {0}", newString1);
        var newCollection5 = newString1.substring(0, 7);
        logger.log(Level.INFO, "new newString1 with substring: {0}", newCollection5);

        // indexOf: Returns the index within this string of the first occurrence of the
        // specified character or Returns the position of the first found occurrence of
        // specified characters in a string.
        logger.log(Level.INFO, "---indexOf in Java---");
        // indexOf is used to find the index of a character or characters in a string.
        // Use the lastIndexOf method to return the position of the last occurrence of
        // specified character(s) in a string.
        var newCollection11 = newString1.indexOf("is");
        logger.log(Level.INFO, "new newString1 with indexOf: {0}", newCollection11);

        // lastIndexOf: Returns the index within this string of the last occurrence of
        // the specified character or Returns the position of the last found occurrence
        // of specified characters in a string.
        logger.log(Level.INFO, "---lastIndexOf in Java---");
        // lastIndexOf is used to find the index of a character or characters in a
        // string.
        // Use the lastIndexOf method to return the position of the last occurrence of
        // specified character(s) in a string.
        // An int value, representing the index of the first occurrence of the character
        // in the string, or -1 if it never occurs
        var newCollection7 = newString1.lastIndexOf("is");
        logger.log(Level.INFO, "new newString1 with lastIndexOf: {0}", newCollection7);

        // concat: Returns a new string that is the concatenation of two strings.
        logger.log(Level.INFO, "---concat in Java---");
        // concat is used to concatenate two strings
        var newCollection8 = newString1.concat(" concat new string.");
        logger.log(Level.INFO, "new newString1 with concat: {0}", newCollection8);

        // stringBuilder: Returns a new string that is a copy of this string.
        logger.log(Level.INFO, "---StringBuilder in Java---");
        // StringBuilder is used to create a new string that is a copy of this string,
        // used to manipulate and create strings.
        // The String class is immutable. So, the StringBuilder provides methods to
        // modify and operate on the same string instance without creating additional
        // instances. Also, is used to create strings more efficiently than
        // concatenating strings using the + operator. When performing repeated
        // concatenations, StringBuilder prevents the creation of multiple string
        // objects. Unlike StringBuffer, StringBuilder is not synchronized, which means
        // it is not safe when using Threads.
        StringBuilder newCollection9 = new StringBuilder();
        newCollection9.append(newString1);
        newCollection9.append(" stringBuilder new string.");
        String newString2 = newCollection9.toString();
        logger.log(Level.INFO, "new newString2 from StringBuilder: {0}", newString2);

        // StringBuffer: Returns a new character sequence that is a subsequence of this
        // sequence.
        logger.log(Level.INFO, "---StringBuffer in Java---");
        // StringBuffer is used to create a new character sequence that is a subsequence
        // of this sequence, used to manipulate and create character sequences.
        // StringBuffer is synchronized, which means it is safe when using Threads.
        String newCollection10 = new StringBuffer(newString1).append(" StringBuffer new string")
                .append(" byte sequence").toString();
        logger.log(Level.INFO, "new newCollection10 from StringBuffer: {0}", newCollection10);

        // join: Returns a new string consisting of all the elements of this array.
        logger.log(Level.INFO, "---join in Java---");
        // join is used to create a new string that is a concatenation of all the
        // elements
        var newStringWithJoin = String.join(", ", "one", " two", " three", newCollection10);
        logger.log(Level.INFO, "new newStringWithJoin from join: {0}", newStringWithJoin);

        // strip: Returns a new string with leading and trailing whitespace removed.
        logger.log(Level.INFO, "---strip in Java---");
        // strip removes all Unicode whitespace characters (but not all control
        // characters, such as \0).
        var nameUser = "   John Doe Jones   ";
        var newStringWithStrip = nameUser.strip();
        logger.log(Level.INFO, "new nameUser from strip: {0}", newStringWithStrip);

        // format: Returns a formatted string using the given arguments.
        logger.log(Level.INFO, "---format in Java---");
        // format is used to create a new string that is a formatted string using the
        // given arguments.
        var newStringWithFormat = String.format("The name of the user is %s", nameUser.strip());
        logger.log(Level.INFO, "new newStringWithFormat from format: {0}", newStringWithFormat);
        var ageUser = 20;
        var salaryUser = 50000.87654321;
        var newMessageFormatted = String.format("The age of the user is %d, and the salary is %.2f", ageUser,
                salaryUser);
        logger.log(Level.INFO, "The information is: {0}", newMessageFormatted);

        // formatted: Formats using this string as the format string, and the supplied
        // arguments.
        logger.log(Level.INFO, "---formatted in Java---");
        // This method is equivalent to String.format(this, args)
        var valueWithOutFormat = 343.5676768;
        var formatString = "the value using formatted is: %.2f";
        logger.log(Level.INFO, formatString.formatted(valueWithOutFormat));
        var textBlock1 = """
                %nThis is a textBlock\s
                -----------------------
                \tstring value: %s
                \tinteger value: %04d
                \tfloat value: %.2f
                \tchar value: %c
                \tboolean value: %b
                -----------------------
                %nThis is an example of a formatted text block.%n
                -----------------------
                """.formatted("value string", 2, 3.141592, 'A', true);
        logger.log(Level.INFO, textBlock1);
    }
}
