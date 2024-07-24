import java.util.*;

class patternNumbers{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        
        System.out.println("\n");
        for( int i=0; i<rows; i++ ){

            for( int j=i; j<rows; j++ ){
                System.out.print(j+" ");
            }
            
            System.out.println();
        }


        System.out.println("\n");
        for( int i=0; i<rows; i++ ){

            for( int j=0; j<=i; j++ ){
                System.out.print(j+" ");
            }
            
            System.out.println();
        }


        System.out.println("\n");
        for( int i=0; i<rows; i++ ){

            for( int j=rows; j>i+1; j-- ){
                System.out.print("  ");
            }

            for( int j=i; j>=0; j-- ){
                System.out.print(j+" ");
            }
            
            System.out.println();
        }


        System.out.println("\n");
        for( int i=0; i<rows; i++ ){

            for( int j=i; j>0; j-- ){
                System.out.print("  ");
            }

            for( int j=i; j<rows; j++ ){
                System.out.print(j+" ");
            }
            
            System.out.println();
        }

    }
}


/**
 * 
Enter number of rows: 10


0 1 2 3 4 5 6 7 8 9 
1 2 3 4 5 6 7 8 9 
2 3 4 5 6 7 8 9 
3 4 5 6 7 8 9 
4 5 6 7 8 9 
5 6 7 8 9 
6 7 8 9 
7 8 9 
8 9 
9 


0 
0 1 
0 1 2 
0 1 2 3 
0 1 2 3 4 
0 1 2 3 4 5 
0 1 2 3 4 5 6 
0 1 2 3 4 5 6 7 
0 1 2 3 4 5 6 7 8 
0 1 2 3 4 5 6 7 8 9 


                  0 
                1 0 
              2 1 0 
            3 2 1 0 
          4 3 2 1 0 
        5 4 3 2 1 0 
      6 5 4 3 2 1 0 
    7 6 5 4 3 2 1 0 
  8 7 6 5 4 3 2 1 0 
9 8 7 6 5 4 3 2 1 0 


0 1 2 3 4 5 6 7 8 9 
  1 2 3 4 5 6 7 8 9 
    2 3 4 5 6 7 8 9 
      3 4 5 6 7 8 9 
        4 5 6 7 8 9 
          5 6 7 8 9 
            6 7 8 9 
              7 8 9 
                8 9 
                  9 
 */