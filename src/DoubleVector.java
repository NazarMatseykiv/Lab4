public class DoubleVector {
    private double[] vector = null;
    public DoubleVector(double[] vector){
        this.vector = vector;
    }
    // Скалярний добуток векторів
    public double mult(DoubleVector anotherVector){
        double s = 0;
        for ( int i = 0; i < vector.length; i++ ){
            s += vector[i] * anotherVector.vector[i];
        }
        return s;
    }
    public static double mult(DoubleVector a, DoubleVector b){
        return a.mult(b);
    }
    // Додавання векторів
    public double add(DoubleVector anotherVector){
        double result = 0;
        for (int i = 0; i < vector.length; i++){
            result = vector[i] + anotherVector.vector[i];
        }
        return result;
    }
    // Віднімання векторів
    public double sub(DoubleVector anotherVector){
        double result = 0;
        for (int i = 0; i < vector.length; i++){
            result = vector[i] - anotherVector.vector[i];
        }
        return result;
    }
    // Множення вектора на скаляр
    public double scalarMult(double scalar){
        double result = 0;
        for (int i = 0; i < vector.length; i++){
            result = vector[i] * scalar;
        }
        return result;
    }
    // Обчислення норми вектора
    public double norm(){
        double sum = 0;
        for (int i = 0; i < vector.length; i++){
            sum += Math.pow(vector[i], 2);
        }
        return Math.sqrt(sum);
    }
    public static void main(String[] args){
        double[] a = {1, 2, 3, 4};
        double[] b = {1, 1, 1, 1};
        double[] c = {2, 2, 2, 2};
        DoubleVector v1 = new DoubleVector(a);
        DoubleVector v2 = new DoubleVector(b);
        DoubleVector v3 = new DoubleVector(c);
        System.out.println("v1*v2=" + v1.mult(v2));
        System.out.println("v1*v2=" + DoubleVector.mult(v1, v2));
        System.out.println("v1*v3=" + v1.mult(v3));
        System.out.println("v1+v2=" + v1.add(v2));
        System.out.println("v1-v2=" + v1.sub(v2));
        System.out.println("v1*2=" + v1.scalarMult(2));
        System.out.println("||v1||=" + v1.norm());
    }
}