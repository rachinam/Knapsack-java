
package knapsack;

public class Pièces_de_monnaie_class {
    
    private int n;
    private int s;
    private int []v ;
    private int [][] z;
    
    public Pièces_de_monnaie_class(int n ,int s){
        this.n = n;
        this.s = s;
        this.v = new int[this.n];
        this.z = new int[this.n][this.s+1];
    }
    
    public void setVi(int v[]){
        if(v.length == n){
            this.v = v;
        }else{
            System.out.println("Error Vi :"+this.n);
        }
    }
    
    private  int min(int a, int b) {
        return (a < b)? a : b; 
    }
    
    private void Pièces_de_monnaie(){
        for (int i = 0; i < n; i++) {
            this.z[i][0] = 0;  
        }
        for (int j = 1; j <= this.s; j++) {
            this.z[0][j] = j;
        }
        for (int i = 1; i < this.n; i++) {
            for (int T = 1; T <= this.s; T++) {
                if(T<this.v[i]){
                    this.z[i][T] = this.z[i-1][T];
                }else{
                    this.z[i][T] = min(this.z[i-1][T] ,this.z[i][T-this.v[i]]+1);
                }
            }
        }
        
        
    }
    
    public void solition(){
        Pièces_de_monnaie();
        System.err.println("Z(S,n) :"+this.z[this.n-1][this.s]);
        System.err.println("m(S)   :"+this.z[this.n-1][this.s]);
    }
    public void aff(){
        for (int i = 0; i < this.z.length; i++) {
            for (int j = 0; j < this.z[0].length; j++) {
                System.err.print(this.z[i][j]);
            }
            System.err.println("");
        }
    }
}
