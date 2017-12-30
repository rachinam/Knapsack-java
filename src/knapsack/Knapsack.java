
package knapsack;
public class Knapsack {
    public static void main(String[] args) {

        KnapSack_class k = new KnapSack_class(4, 7);
        int val [] = {2,3,5,2};
        
        int volum [] = {5,8,14,5};
        
        k.setValeurs(val);
        k.setVolum(volum);
        k.solition();
       
    
    
       
//        int uu[][] = new int[4][3];
//        for (int v = 0; v < uu[0].length; v++) {
//            uu[0][v] = -1;
//        }
//       
//        for (int i = 0; i < uu.length; i++) {
//            for (int j = 0; j < uu[0].length; j++) {
//                System.out.print(uu[i][j]);
//            }
//            System.out.println();
// 
//        }
    }
    
}
