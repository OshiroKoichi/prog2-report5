public class report5{
    public static void main(String[] args) {
        String str = null;
        try{
            int length = str.length();
            System.out.println(length);
        } catch(NullPointerException e){
            System.out.println("NullPointExceptionが発生した");
        }
    }
}