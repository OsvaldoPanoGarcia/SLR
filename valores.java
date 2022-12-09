package simplelinealregretion;
public class valores {
   double sumay;
   double sumax;
   double sumaxy;
   double sumax2;
  public void Calsumay(double[][]datos,int cant){
      for(int x=0;x<cant;x++){
          sumay+=datos[x][1];
      }
  }
  public void Calsumax(double[][]datos,int cant){
      for(int x=0;x<cant;x++){
          sumax+=datos[x][0];
      }
  }
  public void Calsumaxy(double[][]datos,int cant){
      for(int x=0;x<cant;x++){
          sumaxy+=datos[x][0]*datos[x][1];
      }
  }
  public void Calsumax2(double[][]datos,int cant){
      for(int x=0;x<cant;x++){
          sumax2+=datos[x][0]*datos[x][0];
      } 
  }
  public void calcularValores(double[][] datos,int cant){
      Calsumay(datos,cant);
      Calsumax(datos,cant);
      Calsumaxy(datos,cant);
      Calsumax2(datos,cant);       
  }
}
