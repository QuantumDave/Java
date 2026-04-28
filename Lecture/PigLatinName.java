public class IdealBodyWeight {
    public static void main(String[] args) {
        int feet = 6;      
        int inches = 3;    
        int totalInches = (feet - 5) * 12 + inches;
        int idealWeight = 110 + (totalInches * 5);
        System.out.println("Ideal body weight is " + idealWeight + " pounds.");
    }
}