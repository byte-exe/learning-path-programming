public class fibonaciUpToGivenMaksNumber {
    public static void main(String[] args) {
        int n = 25; //merupakan nilai maksimum yang diberikan untuk membatasi perhitungan deret fibonaci
        int firstValue = 0, secondValue = 1;
        System.out.println("Nilai Maksimum yang dibatasi untuk menampilkan deret : "+n);

        while(firstValue <=n){
            System.out.print(firstValue + " ,");
            int nextValue = firstValue + secondValue;
            //declarasi variabel baru untuk menghitung deret selanjutnya
            firstValue = secondValue;
            secondValue = nextValue;
        }
    }
    
}
