public class NumberEndingCheck {
    
        public static void main(String[] args) {
            int number = 12345;
            String numberAsString = String.valueOf(number);
    
            int checkDigit = 5;
            boolean endsWithDigit = numberAsString.endsWith(String.valueOf(checkDigit));
    
            if (endsWithDigit) {
                System.out.println(number + " ends with " + checkDigit);
            } else {
                System.out.println(number + " does not end with " + checkDigit);
            }
        }
    }
    

