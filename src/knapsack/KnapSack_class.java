
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
    
    
    public int[][] knapSack()
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
            }
            System.out.println();
 
        }
        return z;
    }
    
    
}
