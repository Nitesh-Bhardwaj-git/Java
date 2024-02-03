
    public class BitwiseOperators {
        public static void main(String[] args) {
            int a = 5;  
            int b = 3;  
    
            // Bitwise AND
            int resultAnd = a & b;
            System.out.println("AND Result: " + resultAnd);  
    
            // Bitwise OR
            int resultOr = a | b;
            System.out.println("OR Result: " + resultOr);   
    
            // Bitwise XOR
            int resultXor = a ^ b;
            System.out.println("XOR Result: " + resultXor);  
    
            // Bitwise NOT
            int resultNotA = ~a;
            System.out.println("NOT Result for A: " + resultNotA); 
    
            // Left Shift
            int resultLeftShift = a << 1;
            System.out.println("Left Shift Result: " + resultLeftShift);  
        }
    }
    

