public class WrappedShort {

        public static void main(String[] args) {
    
            Short wrappedShort = new Short((short) 42);
            short value = wrappedShort.shortValue();
            System.out.println("Wrapped Short Value: " + value);
        }
    }
    
    

