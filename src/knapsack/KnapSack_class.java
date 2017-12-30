
package knapsack;

public class KnapSack_class {
    
    private int n,w;
    private int []val;
    private int []volum;
    private int z[][];
    public KnapSack_class(int n,int w){
        this.n = n;
        this.w = w;
        val = new int[n];
        volum = new int[n];
        z = new int[this.n+1][this.w+1];
    }
    
    public void setValeurs(int g_val[]){
        if(g_val.length != n)
            System.out.println("Error Valeurs :"+this.n);
        else
            this.val = g_val;
    }
    public void setVolum(int g_volum[]){
        if(g_volum.length != n)
            System.out.println("Error volume :"+this.n);
        else
            this.volum = g_volum;
    }
    
    private int max(int a, int b) {
        return (a > b)? a : b; 
    }
    
    
    public void knapSack()
    {
        //int z[][] = new int[this.n+1][this.w+1];
        for (int v = 0; v < this.w; v++) {
            z[0][v] = 0;
        }
        for (int i = 1; i <= this.n; i++) {
            for (int v = 0; v <= this.w; v++) {
                if(v < this.volum[i-1]){
                    z[i][v] = z[i-1][v];
                    //System.out.println("z "+z[i-1][v]);
                }else{
                    z[i][v] = max(z[i-1][v] ,z[i-1][v-this.volum[i-1]]+this.val[i-1]);
                    //System.out.println("z max "+max(z[i-1][v] ,z[i-1][v-this.volum[i]]+this.val[i]));
                }
            }
        }
        for (int i = 0; i < z.length; i++) {
            for (int j = 0; j < z[0].length; j++) {
                System.out.print(z[i][j]);
                //System.out.print("("+i+","+j+")");
            }
            System.out.println();
 
        }
        
    }
    
    public void solition(){
        knapSack();
//        int sol[];
        
//        if(z[n][w] == z[n-1][w] ){
//            System.out.print("ok");
//        }else{
//            if(z[n-1][w-this.volum[n-1]] == z[n-2][w-this.volum[n-1]] ){
//                System.out.print("ok 2 ");
//            }else{
//                System.out.print("not ok 2 ");
//            }
//           
//        }
        System.out.print("Solution :");
        int w = this.w; // 10,5
        int n = this.n; // 3,2
        while(n > 0){
            
            if(z[n][w] != z[n-1][w]){
                System.out.print(this.volum[n-1]+"-");
                w = z[n][w] - this.volum[n-1]; // w= 10-5
                n--;
                
            }else{
                
                n --;
            }
            
        }
        System.out.println();
    }
    
    
}
