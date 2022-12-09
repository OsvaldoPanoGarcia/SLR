package simplelinealregretion;
public class SimpleLinealRegretion {

    public static void main(String[] args) {
        database obj=new database();
        proceso pros=new proceso();
        double[] betas=pros.betas(obj.datos(),obj.cantidad());
        pros.imprimir(betas);
        pros.predicciones(betas, obj);
    }
    
}
