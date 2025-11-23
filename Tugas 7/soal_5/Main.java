package soal_5;

public class Main {

    public static void main(String[] args) {
        Rekursif rek = new Rekursif();
        
        System.out.println("FAKTORIAL");
        System.out.println("5! = " + rek.faktorial(5));
        System.out.println("7! = " + rek.faktorial(7));
        System.out.println();
        
        System.out.println("PANGKAT");
        System.out.println("2 pangkat 5 = " + rek.pangkat(2, 5));
        System.out.println("3 pangkat 4 = " + rek.pangkat(3, 4));
        System.out.println();
    }
    
}
