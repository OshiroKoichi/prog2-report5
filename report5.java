public class report5{
    
    public static void main(String[] args) {
        String str = null;
        try{
        System.out.println(str.length());
        } catch(Exception e){
            System.out.println("NullPointerExceptionが発生しました。");
            System.out.println(e.getMessage());
        }
    }
}