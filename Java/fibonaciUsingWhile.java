class Main {
	public static void main(String[] args){
      int i=1, fibonaci_n = 10, firstValue = 0, secondValue = 1;
      System.out.println("Fibonaci dengan panjang "+ fibonaci_n+" digit :");
      
      while (i<= fibonaci_n){
         System.out.print(firstValue + ", ");
         int nextValue = firstValue + secondValue;
         firstValue = secondValue;
         secondValue = nextValue;
         i++;
      }
   }
}