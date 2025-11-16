public class Soal_1 {
    public static void main(String[] args) {
        // Cara 1: Deklarasi dulu, baru isi
        int[] arr1 = new int[3];
        arr1[0] = 10;
        arr1[1] = 20;
        arr1[2] = 30;
        System.out.println("Cara 1");
        System.out.println(arr1[0] + ", " + arr1[1] + ", " + arr1[2]);
        
        // Cara 2: Deklarasi dengan new dan langsung isi
        int[] arr2 = new int[]{100, 200, 300};
        System.out.println("\nCara 2");
        System.out.println(arr2[0] + ", " + arr2[1] + ", " + arr2[2]);
        
        // Cara 3: Deklarasi langsung dengan nilai
        int[] arr3 = {1000, 2000, 3000};
        System.out.println("\nCara 3");
        System.out.println(arr3[0] + ", " + arr3[1] + ", " + arr3[2]);
    }
}
