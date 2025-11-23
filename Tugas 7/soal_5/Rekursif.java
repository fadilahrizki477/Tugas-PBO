package soal_5;

public class Rekursif {
    int faktorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * faktorial(n - 1);
        }
    }

    int pangkat(int angka, int pangkat) {
        if (pangkat == 0) {
            return 1;
        } else {
            return angka * pangkat(angka, pangkat - 1);
        }
    }
}

