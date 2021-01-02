public class Task {
    
    // remove a character from a string
    public static String removeRecursive(String string, char ch) { 
        if (!string.contains(Character.toString(ch))) return string; 
        return string.substring(0, string.indexOf(ch)) + removeRecursive(string.substring(string.indexOf(ch) + 1), ch);
    }
    public static String remove(String string, char ch) {
        String result = "";
        for (var i = 0; i < string.length(); i++) {
            if (string.charAt(i) != ch) result += string.charAt(i);
        }
        return result;
    }
    // reverse a string 
    public static String reverse(String string) {
        String result = "";
        for (var i = string.length()-1; i >= 0; i--) {
            result += string.charAt(i);
        }
        return result;
    }
    public static String reverseRecursive(String string) {
        if (string.length() == 1) return string;
        return reverseRecursive(string.substring(1)) + string.substring(0, 1);
    }
    // change a string's characters positioned at an odd index to lower case and at an even index in upper case 
    public static String camelize(String toCamelize) { 
        if (toCamelize.length() <= 1) {
            return toCamelize.toUpperCase();
        } else if (toCamelize.length() == 2) {
            return toCamelize.substring(0, 1).toUpperCase() + toCamelize.substring(1);
        } else {
            return camelize(toCamelize.substring(0, 2)) + camelize(toCamelize.substring(2));
        }
    }
    // calcualte the n'th power of a given number
    public static int power(int power, int number) {
        int temp = number;
        for (var i = 0; i < power -1; i++) {
            number = number*temp;
        }
        return number;
    }
    public static int powerRecursive(int power, int number) {
        if (power == 1) return number;
        return number*powerRecursive(power-1, number);
    }

    // return the complement of a string containing BCD's
    public static String complement(String binary) {
        String result = "";
        for (var i = 0; i < binary.length(); i++) {
            if (binary.charAt(i) == '0') {
                result += "1";
                continue;
            }
            result += "0";
        }
        return result;
    }
    public static String complementRecursive(String binary) {
        String result = "";
        if (binary.charAt(0) == '0') result = "1";
        if (binary.charAt(0) == '1') result = "0";
        // 0 0 1 0 1
        return result + complement(binary.substring(1));
    }

    // returns the n'th number from the fibonacci sequence recursively
    public static int fibonacci(int num) {
        if (num == 0) return 0;
        if (num == 1) return 1;
        return fibonacci(num - 1) + fibonacci(num - 2);        
    } 
    
    // find the factorial of a given number
    public static int factorial(int num) {
        if (num == 1) return 1;
        return num*factorial(num-1);
    }
}
