
package simplelinealregretion;

public class database {
    public double[][]datos(){
        double[][] esta=new double[cantidad()][2];
        esta[0][0]=23;
        esta[1][0]=26;
        esta[2][0]=30;
        esta[3][0]=34;
        esta[4][0]=43;
        esta[5][0]=48;
        esta[6][0]=52;
        esta[7][0]=57;
        esta[8][0]=58;
        
        esta[0][1]=651;
        esta[1][1]=762;
        esta[2][1]=856;
        esta[3][1]=1063;
        esta[4][1]=1190;
        esta[5][1]=1298;
        esta[6][1]=1421;
        esta[7][1]=1440;
        esta[8][1]=1518;
        //0 es x, 1 es y.
        return esta;
    }
    public int cantidad(){
        int x=9;
        return x;
    }
    public double[] predecir(){
        double[] esta=new double[5];
        esta[0]=21;
        esta[1]=22;
        esta[2]=24;
        esta[3]=25;
        esta[4]=27;
        return esta;
    }
}
