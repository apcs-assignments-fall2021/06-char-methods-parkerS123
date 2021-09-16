public class MyMain {

    // Changes a capital letter to a lowercase letter
    // If the char is not an uppercase letter, 
    // it is returned unchanged. 
    public static char toLower(char ch) {
        if (ch >= 'A' && ch <= 'Z'){
            char new_ch = (char)(ch + 32);
            return new_ch;
        }
        else {
            return ch;
        }
    }

    // Changes a lowercase letter to an uppercase letter
    // If the char is not a lowercase letter,
    // it is returned unchanged.
    public static char toUpper(char ch) {
        if (ch >= 'a' && ch <= 'z'){
            char new_ch2 = (char)(ch - 32);
            return new_ch2;
        }
        else {
            return ch;
        }
    }

    // The method is given a String as input and returns a
    // new String where all of the numbers have been removed
    // from the original String.
    public static String removeNumbers(String str) {
        // int str_length = length(str);
        String New_str = "";
        for (int i = 0; i < str.length(); i++) {
            if (!(str.charAt(i) >= '0' && str.charAt(i) <= '9')) {              //(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z'||str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                New_str = New_str + str.charAt(i);
            }
            else{

            }


    }
        System.out.println(str);
        return New_str;


    }

    // Write some code to test your methods!
    public static void main(String[] args) {
        char ch = 'G';
        String str = "gFj8T3q2l";
        System.out.println(toLower(ch));
        System.out.println(toUpper(ch));
        System.out.println(removeNumbers(str));
    }
}
