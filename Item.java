class Item{
    
    private String name;
    private double price;

    public Item(String name, double price){
        this.name = name;
        this.price = price;
    }

    //GETTERS AND SETTERS

    //Name 
    public String getName(){
        return this.name;
    }
    public void setName(String itemName){
        this.name = itemName;
    }
    //Price 
    public double getPrice(){
        return this.price;
    }
    public void setPrice(double itemPrice){
        this.price = itemPrice;
    }

}