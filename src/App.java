

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");


         double med1 = calculaMedia(15, 22, 10, 7, 19, 12);

        System.out.println("Média das notas: " + med1);

       


    }

    public static double calculaMedia(int x, int y, int z, int a , int b, int c)
    {
        return ((x + y + z + a + b + c) /6 );
    }
}
