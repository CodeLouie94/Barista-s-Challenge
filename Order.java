import java.util.ArrayList;

class Order{
    private String name;
    private double total;
    private boolean ready;
    private ArrayList <Item> items;

    //CONSTRUCTORS
    public Order(String name){
        this.name = name;
        this.total = 0.0;
        this.ready = false;
        this.items = new ArrayList<Item>();
    }

    public Order(){
        this.name = "Guest";
        this.total = 0.0;
        this.ready = false;
        this.items = new ArrayList<Item>();
    }
    
    //GETTERS AND SETTERS
    //NAME
    public String getName(){
        return this.name;
    }
    public void setName(String customerName){
        this.name = customerName;
    }

    //TOTAL
    public String getTotal(){
        for(Item i: this.items) {
            this.total += i.getPrice();
        }
        return "Your total order is $" + this.total;
    }


    //READY
    public String getReady(){
        if(this.ready){
            return "Order is ready";
        }else{
            return "Please wait for a moment";
        }
    }
    public void setReady(boolean ready){
        this.ready = ready;
    }

    //ITEMS
    public ArrayList<Item> getItems(){
        return this.items;
    }
    public void addItems(Item item){
        this.items.add(item);
    }
    
    //DISPLAY ALL
    public void displayOrder(){
        System.out.println("Customer Name: " + getName());
        for(Item i: this.items) {
            System.out.println(i.getName() + " - $" + i.getPrice());
        }
        System.out.println("Total: " + getTotal());

    }
}

