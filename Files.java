import java.io.File;

public class Files {
    public static void main(String[] args) {
        //Nem hozza letre a fajlt
        
        File bizonyitek = new File("titkos.txt");

       

        if(bizonyitek.exists()){
            System.out.println("A fájl létezik");
        }else{
            System.out.println("A fájl nem létezik");
        }
    }
}