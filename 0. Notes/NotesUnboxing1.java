public class NotesUnboxing1 {
    public static void unboxMethod(int i){
        System.out.println(i + 5);
    }
    
    public static void main(String[] args){
        Integer var1 = new Integer(15);
        unboxMethod(var1); // Unboxing on parameter
        double var2 = new Double(15.2); // Unboxing on variable
    }
}
