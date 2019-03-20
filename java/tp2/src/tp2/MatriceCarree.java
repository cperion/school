package tp2;


public class MatriceCarree{
    int size = 1;
    double[][] value;
    public MatriceCarree(){}
    public MatriceCarree(int dim){
        this.value = new double[dim][dim];
        this.size = dim;
    }
    public MatriceCarree(double[][] tab){
        this.value = tab ;
        this.size = tab.length;
    }
    public void setElementAt(double val, int i, int j){
        this.value[i][j]= val;
    }
    public double getElementAt(int i, int j){
        return this.value[i][j];
    }
    public MatriceCarree sum(MatriceCarree A){
        MatriceCarree out = new MatriceCarree(A.size);
        for (int i=0; i<A.size ; i++){
            for (int j=0; j<A.size; j++){
                double res=A.getElementAt(i, j) + this.value[i][j];
                out.setElementAt(res, i, j);
            }
        }
        return out;
    }
    public MatriceCarree nsum(MatriceCarree A){
        MatriceCarree out = new MatriceCarree(A.size);
        for (int i=0; i<A.size ; i++){
            for (int j=0; j<A.size; j++){
                double res=A.getElementAt(i, j) - this.value[i][j];
                out.setElementAt(res, i, j);
            }
        }
        return out;
    }
    public MatriceCarree dot(MatriceCarree A){
        MatriceCarree out = new MatriceCarree(A.size);
        for (int i=0; i<A.size ; i++){
            for (int j=0; j<A.size; j++){
                double res = 0;
                for (int k=0; k<A.size; k++){
                    res +=this.value[j][k]*A.getElementAt(k, j);
                }
                out.setElementAt(res, i, j);
            }
        }
        return out;
    }
    public static zero(int size){
        
    }
    public void disp() {
        for ( int i=0; i < this.size; i++){
            String ligne = new String();
            for ( int j = 0; j < this.size; j++) {
                ligne = ligne + " " + this.value[i][j];
            }
            System.out.println(ligne);
        }
    }
}