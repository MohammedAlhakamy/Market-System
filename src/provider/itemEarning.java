package provider;

public class itemEarning extends items {
    private int totalearnings;

    
    public itemEarning(int totalearnings, String Catagories, String name, double price) {
        super(Catagories, name, price);
        this.totalearnings = totalearnings;
    }

 

    
    @Override
    public String toString() {
        return super.toString()+"\n"+"item Earning {" + "totalearnings =" + totalearnings + '}';
    }
    
    
    @Override
    public int TotalEarnings() {
         return totalearnings;
    }
    
    
}