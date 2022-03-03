public class zigzag {
    public static void main(String[] args) {
        int N = 5;
        alfabetPattern(N);
    }

    static void alfabetPattern(int N){
        int index, side_index;
        int Top = 1, Bootom = 1, diagonal = N-1;
        System.out.print(Top++ +" ");
        
        for (index = 0; index < N -1; index++){
            //memberikan jarak diagonal
            for(side_index = 0; side_index < 2 *(N - index - 1); side_index++)
            System.out.print(diagonal--);
            System.out.println();
        }

        //looping untuk mencetak row terakhir
        for(index = 0; index < N; index++)
        System.out.print(Bootom++ +" ");
    }
    
}
