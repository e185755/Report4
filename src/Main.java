import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        String str = null;

        try{
            System.out.println(str.length());
        }
        catch (NullPointerException e){
            System.out.println("エラー「NullPointerException」が発生");
            System.out.println(e.getMessage());
        }



    }
}

