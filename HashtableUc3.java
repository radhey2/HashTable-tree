package Hashtable;

public class HashtableUc3 {
    static void remove(String str, String word)
    {
        // Split the string using split() method
        String msg[] = str.split(" ");
        String new_str = "";
 
        // Iterating the string using for each loop
        for (String words : msg) {
 
            // If desired word is found
            if (!words.equals(word)) {
 
                // Concat the word not equal to the given
                // word
                new_str += words + " ";
            }
        }
 
        // Print the new String
        System.out.print(new_str);
    }
 
    // Method 2
    // Main driver method
    public static void main(String[] args)
    {
        // Custom string as input
        String str = "“Paranoids are not paranoid\r\n"
        		+ "because they are paranoid but\r\n"
        		+ "because they keep putting themselves\r\n"
        		+ "deliberately into paranoid avoidable\r\n"
        		+ "situations”";
 
        // Word to be removed from above string
        String word = "it";
 
        // Calling the method 1 by passing both strings to
        // it
        remove(str, word);
    }
}


