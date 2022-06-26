import java.util.ArrayList;

public class ProductHandler {

    private static  ArrayList<Product> allProducts = new ArrayList<>();


    public static void addProduct(Product newProduct){
            allProducts.add(newProduct);

    }


    public static void showProducts(){
        for(Product product: allProducts ){
            System.out.println("_______________");
            System.out.println("Productnaam:" + product.getBrand()  + product.getSpecs());

        }



    }



}

