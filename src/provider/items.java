package provider;

public abstract class items{
    private String Catagories;
    private String name;
    private double price;


    
    
    public items(String Catagories, String name, double price) {
        
        this.Catagories = Catagories;
        this.name = name;
        this.price = price;
       
    }

    public String getCatagories() {
        return Catagories;
    }

    public void setCatagories(String Catagories) {
        this.Catagories = Catagories;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public abstract int TotalEarnings();

    @Override
    public String toString() {
        return "items{" + "Catagories = " + Catagories + ", name = " + name + ", price =" + price + '}';
    }
    
}
