package simplelinealregretion;
public class proceso {
    public double[] betas(double[][]datos,int cant){
        valores obj=new valores();
        obj.calcularValores(datos, cant);
        double[]betas=new double[2];
        betas[1]=beta1(obj,cant);
        betas[0]=beta0(obj,cant,betas[1]);
        return betas;
    }
    public double beta1(valores obj,int cant){
        double valor=cant*obj.sumaxy;
        valor=valor-(obj.sumax*obj.sumay);
        double aux=cant*obj.sumax2;
        aux=aux-(obj.sumax*obj.sumax);
        valor=valor/aux;
        return valor;
    }
    public double beta0(valores obj,int cant,double beta1){
        double valor=(obj.sumay-(beta1*obj.sumax))/cant;
        return valor;
    }
    
    public void imprimir(double[]betas){
        System.out.print("La formula es: "+betas[0]+" + "+betas[1]+"x\n"
                + "          Predicciones:\n"
                + "X:       Y: \n");
    }
    
    public void predicciones(double[]betas,database obj){
        double[]ejex=new double[5];
        ejex=obj.predecir();
        for(int x=0;x<5;x++){
            System.out.print(ejex[x]+"     "+(betas[0]+(betas[1]*ejex[x]))+"\n");
        }
    }
}
