package test;

import java.io.*;
import customer.*;
import product.*;

public class App {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        Customer c1=new Customer();
        Customer c2=new Customer();

        Product p1=new Product();
        Product p2=new Product();
       
        System.out.println("Enter the details of the customer : ");
        c1.getCustDetails();
        System.out.println("Enter the wallet amount of the customer : ");
        int x=Integer.parseInt(br.readLine());
        c1.setWallet(x);
        c1.showCustDetails();
        c1.getWallet();

        System.out.println("Enter the details of the customer");
        c2.getCustDetails();
        System.out.println("Enter the wallet amount of the customer : ");
        x=Integer.parseInt(br.readLine());
        c2.setWallet(x);
        c2.showCustDetails();
        c2.getWallet();

        System.out.println("Enter the details of the product : ");
        p1.getProdDetails();
        p1.showProdDetail();
        p1.discountsPrice(5, 99);

        System.out.println("Enter the details of the product : ");
        p2.getProdDetails();
        p2.showProdDetail();
        p2.discountsPrice(25, 99);
    }
}