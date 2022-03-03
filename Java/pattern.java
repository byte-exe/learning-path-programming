public class pattern {
    public static void main(String[] args) {
        int alphabet = 65;
        System.out.println("**Printing Pattern...**");
        for(int i = 0; i<=25; i++){
            for(int j = 0; j<=i; j++){
                System.out.print((char) alphabet + "");

            }
            alphabet++;
            System.out.println();
        }
    }
    
}
