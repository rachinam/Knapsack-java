
package knapsack;
public class Knapsack {
    public static void main(String[] args) {

        KnapSack_class k = new KnapSack_class(3, 10);
        int val [] = {7,5,5};
        
        int volum [] = {6,5,5};
        
        k.setValeurs(val);
        k.setVolum(volum);
        int uu [][] = k.knapSack();
       
       
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
