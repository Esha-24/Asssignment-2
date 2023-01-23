package customer;

import java.io.*;

public class Customer {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public String custName;
    public int custAge;
    public String custAddress;
    public long custPhoneNo;
    public String custEmailId;
    private int wallet;
    
    public void getCustDetails() throws IOException
    {
        System.out.println("Enter Name : ");
        this.custName = br.readLine();

        System.out.println("Enter age : ");
        this.custAge = Integer.parseInt(br.readLine());

        System.out.println("Enter address : ");
        this.custAddress = br.readLine();

        System.out.println("Enter phone no. : ");
        this.custPhoneNo = Long.parseLong(br.readLine());

        System.out.println("Enter email id : ");
        this.custEmailId = br.readLine();
    }
    public void showCustDetails()
    {
        System.out.println();
        System.out.println("___________details of the customer____________");
        System.out.println("Name : "+custName);
        System.out.println("Age : "+custAge);
        System.out.println("Address : "+custAddress);
        System.out.println("Phone no. : "+custPhoneNo);
        System.out.println("Email id : "+custEmailId);
        System.out.println();
    }
    public int getWallet() {
        return wallet;
    }
    public void setWallet(int wallet) {
        this.wallet = wallet;
    }
    
}