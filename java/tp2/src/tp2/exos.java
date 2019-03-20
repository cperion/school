package tp2;

import tp2.MatriceCarree;

public class exos {
    public static void main(String[] args) {
        MatriceCarree matA= new MatriceCarree(3);
        double[][] tab = new double[3][3];
        tab[0][0]= 1.0;
        MatriceCarree matB= new MatriceCarree(tab);
        MatriceCarree matC= new MatriceCarree(3);
        matC = matA.dot(matB);
        matC.disp();
    }
}