
public class Agricolas {
    public static void main(String[] args) {
        String  produto [] = new  String [ 8 ];

        produto [ 0 ]= "Soja" ;
        produto [ 1 ]= "Trigo" ;
        produto [ 2 ]= "Milho" ;
        produto [ 3 ]= "Café" ;
        produto [ 4 ]= "Laranja" ;
        produto [ 5 ]= "Açucar" ; 
        produto [ 6 ]= "Algodão" ;
        produto [ 7 ]= "Carne" ;

        double  preco []= new double [ 10 ];

        preco [ 0 ]= 171.00;
        preco [ 1 ]= 1236.00;
        preco [ 2 ]= 89.29;
        preco [ 3 ]= 1250.00;
        preco [ 4 ]= 29.00;
        preco [ 5 ]= 139.36;
        preco [ 6 ]= 15.00;
        preco [ 7 ]= 322.00;

            for (int index = 0; index < produto.length; index++) {
            System.out.println("O produto é " + produto[index] +  ", O preço é " + preco[index]);
         }
        }
    
}
