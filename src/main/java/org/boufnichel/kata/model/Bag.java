package org.boufnichel.kata.model;


public class Bag {
    private String productList;

    public Bag(String s) {
        productList=s;
    }

    public int size() {
        return productList.split("#").length;


    }


    public int calculate() {
        int price=0;
        String[] products=productList.split("#");
        for (String product : products){
            String[] productInfo =product.split(":");
            if(productInfo[1].equals(""))
                price+=Integer.parseInt(productInfo[2]);
            else
                price+=(Integer.parseInt(productInfo[1])*Integer.parseInt(productInfo[2]));
        }
        return price;
    }

    public void remove(String productName) {
        String newProductList="";
        String[] products=productList.split("#");
        for (String product : products){
            String[] productInfo =product.split(":");
            if(!productInfo[0].equals(productName))
                newProductList+=product;

        }
        this.productList=newProductList;
    }
}
