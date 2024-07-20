public class loop {
    public static void main(String[] args) {
        System.out.print("\nfor(int i=0; i<15; i++): ");
        for(int i=0; i<15; i++){
            System.out.print(i+" ");
        }

        int arr[] = {14, 5, 6, 7, 90, 45, 10, 8, 1};
        System.out.print("\n\nfor(int num:arr): ");
        for(int num:arr){
            System.out.print(num+" ");
        }

        int l=0;
        System.out.print("\n\nwhile(l<15): ");
        while(l<15){
            System.out.print(l+" ");
            l++;
        }

        int k=0;
        System.out.print("\n\ndo-while(k<15): ");
        do{
            System.out.print(k+" ");
            k++;
        }
        while(k<15);

    System.out.print("\n\nLabeled Loop with break: \n");
    aa:  
        for(int i=1;i<=3;i++){    
                // bb:  
                for(int j=1;j<=3;j++){    
                    if(i==2&&j==2){    
                        
                        break aa;    
                    }    
                    System.out.println(i+" "+j);    
                }    
        }
    }    
}
