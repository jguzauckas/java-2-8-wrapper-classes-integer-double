public class NotesAutoboxing1 {
    public static void autoboxMethod(Integer i){
        System.out.println(i.intValue() + 5);
    }
    
    public static void main(String[] args){
        autoboxMethod(15); // Autoboxing on parameter
        Double var1 = 15.2; // Autoboxing on variable
    }
}
