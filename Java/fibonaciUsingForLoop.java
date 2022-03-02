public class fibonaciUsingForLoop {
    public static void main(String[] args){
        int fibonaci_n = 10, firstValue = 0, secondValue = 1;
        System.out.println("Fibonaci dengan panjang "+ fibonaci_n+" digit :");
    
    
        for (int i = 1; i <= fibonaci_n; ++i) {
            System.out.print(firstValue + ", ");
    
            // compute the next term
            int nextValue = firstValue + secondValue;
            firstValue = secondValue;
            secondValue = nextValue;
        }
    }
}
