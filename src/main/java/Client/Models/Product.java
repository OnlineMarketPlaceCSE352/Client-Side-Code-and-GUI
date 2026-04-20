package Client.Models;

public class Product {
    private String productName;
    private double productPrice;
    private String description;
    private int serierNumber;
    private String sellerName;
    private String imgUrl;

    public Product(){
        this.productName=null;
        this.productPrice=0;
        this.serierNumber=-1;
        this.sellerName=null;
        this.imgUrl=null;

    }
    public Product(String pName,double pPrice,String sellerName,String description,String imgUrl){
        this.productName=pName;
        this.description=description;
        this.productPrice=pPrice;
        this.sellerName=sellerName;
        this.imgUrl=imgUrl;

    }
    public String getProductName(){
        return this.productName;
    }
    public String getSellerName(){
        return this.sellerName;
    }

    public double getProductPrice(){
        return this.productPrice;
    }
    public String getProductDescription(){
        return this.description;
    }
    public String getImageUrl(){
        return this.imgUrl;
    }
    public int getSerialNumber(){
        return this.serierNumber;
    }
    public void setSerialNumber(int id){
        this.serierNumber=id;
    }
    public void setProductName(String name){
        this.productName=name;
    }
    public void setProductPrice(double price){
        this.productPrice=price;
    }
    public void setSellerName(String Sname){
        this.sellerName=Sname;
    }
    public void setDescription(String des){
        this.description=des;
    }
    public void setImageUrl(String imgUrl){
        this.imgUrl=imgUrl;
    }

}
