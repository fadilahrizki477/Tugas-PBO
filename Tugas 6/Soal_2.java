public class Soal_2 {

    public static void main(String[] args) {
       String[] mobil = {"Tesla", "Suzuki", "Civic", "Mazda", "BMW"};

        for (int i = 0; i < mobil.length; i++) {
            if (mobil[i].equals("Suzuki")) {

                mobil[i] = "Audi";

                System.out.println("Nilai 'Suzuki' ditemukan pada indeks ke-" + i);
                System.out.println("Nilai baru pada indeks tersebut adalah: " + mobil[i]);
            }
        }

        System.out.println("\nArray setelah diubah:");
        for (String m : mobil) {
            System.out.println(m);
        }
    }
}