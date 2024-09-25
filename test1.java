public class test1 {
    public static void main(String[] args) {
        int arr[] = {5,1,3,4,2,6};
        int n=arr.length;
        int ans[] = new int[n];
        for(int i =0; i<n; i++){
            ans[i]=-1;
            for(int j = i+1; j<n; j++){
                if(arr[i]<arr[j]){
                    ans[i]=arr[j];
                    break;
                }
            }
        }
        System.out.print("Array - ");
        for(int i=0; i<n;i++){
            System.out.print(arr[i]+"\t");
        }
        System.out.println();
        System.out.print("Ans   - ");
        for(int i=0; i<n;i++){
            System.out.print(ans[i]+"\t");
        }
    }
}
 


// Next greatest brute force
// public static void main(String[] args) {
//     int arr[] = {5,1,3,4,2,6};
//     int n=arr.length;
//     int ans[] = new int[n];
//     for(int i =0; i<n; i++){
//         ans[i]=-1;
//         for(int j = i+1; j<n; j++){
//             if(arr[i]<arr[j]){
//                 ans[i]=arr[j];
//                 break;
//             }
//         }
//     }
//     System.out.print("Array - ");
//     for(int i=0; i<n;i++){
//         System.out.print(arr[i]+"\t");
//     }
//     System.out.println();
//     System.out.print("Ans   - ");
//     for(int i=0; i<n;i++){
//         System.out.print(ans[i]+"\t");
//     }
// }


// Celebrity Problem
// public static void main(String[] args) {
//     int arr[][] = {
//             { 1, 1, 1, 0, 1 },
//             { 1, 1, 1, 0, 1 },
//             { 0, 0, 1, 0, 0 },
//             { 1, 1, 1, 0, 0 },
//             { 0, 0, 1, 1, 0 }
//     };
//     for (int i = 0; i < 5; i++) {
//         for (int j = 0; j < 5; j++) {
//             System.out.print(arr[i][j] + " ");
//         }
//         System.out.println();
//     }
//     int known[] = new int[5];
//     int knows[] = new int[5];
//     for (int i = 0; i < 5; i++) {
//         for (int j = 0; j < 5; j++) {
//             known[i] = known[i] + arr[j][i];
//             knows[i] = knows[i] + arr[i][j];
//         }
//     }
//     System.out.print("Knows- ");
//     for (int i = 0; i < 5; i++) {
//         System.out.print(knows[i] + " ");
//     }

//     System.out.println();

//     System.out.print("Known- ");
//     for (int i = 0; i < 5; i++) {
//         System.out.print(known[i] + " ");
//     }
//     System.out.println();
//     System.out.println();
//     System.out.println("Celebrity- ");

//     for (int i = 0; i < 5; i++) {
//         if (knows[i] == 1 && known[i] == 5) {
//             System.out.println(i + 1);
//         }
//     }
// }