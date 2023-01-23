package product;

import java.io.*;
public class Product {
    public String prodName;
    public int prodId;
    public int prodPrice;
    public int prodQuantity;
    public int prodBook;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public void getProdDetails() throws IOException
    {
        System.out.println("Enter Product Name : ");
        this.prodName=br.readLine();

        System.out.println("Enter Product Id : ");
        this.prodId = Integer.parseInt(br.readLine());

        System.out.println("Enter Product Price : ");
        this.prodPrice = Integer.parseInt(br.readLine());

        System.out.println("Enter Product Quantity : ");
        this.prodQuantity = Integer.parseInt(br.readLine());

        System.out.println("Enter Product Demand : ");
        this.prodBook = Integer.parseInt(br.readLine());
    }
    public void discountsPrice(int x,int d)
    {

        if(prodQuantity>x)
            System.out.println("If demand is more then "+x+"then discounted price is: "+ (prodPrice-d));
        else
            System.out.println("No discount");
    }
    public void showProdDetail()
    {
        System.out.println();
        System.out.println("____________the details of the product_________");
        System.out.println("Product Name : "+prodName);
        System.out.println("Product Id : "+prodId);
        System.out.println("Product price : "+prodPrice);
        System.out.println("Total product : "+prodQuantity);
        System.out.println("Total demand : "+prodBook);
        System.out.println();
    }
}
