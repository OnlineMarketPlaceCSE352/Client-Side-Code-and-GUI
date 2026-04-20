package Client.Models;

public class Product {
    private String productName;
    private double productPrice;
    private int serierNumber;
    private String sellerName;
    private String clientName;
    public Product(){
        this.productName=null;
        this.productPrice=0;
        this.serierNumber=0;
        this.sellerName=null;
        this.clientName=null;
    }
    public Product(String pName,double pPrice,String sellerName,String clientName){
        this.productName=pName;
        this.productPrice=pPrice;
        this.sellerName=sellerName;
        this.clientName=clientName;
    }
    public String getProductName(){
        return this.productName;
    }
    public String getSellerName(){
        return this.sellerName;
    }
    public String getClientName(){
        return this.clientName;
    }
    public double getProductPrice(){
        return this.productPrice;
    }
    public long getSerialNumber(){
        return this.serierNumber;
    }
}
