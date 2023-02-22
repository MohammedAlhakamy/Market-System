package provider;

import java.util.ArrayList;

public class Market implements favoriteitem{
    private String marketName;
    private ArrayList<itemEarning> allitems = new ArrayList<>();

    public Market(String marketName) {
        this.marketName = marketName;
    }
    
    
    public void Additem(itemEarning item){
        this.allitems.add(item);
    }
    
    
    public itemEarning getitem(int index){
        return allitems.get(index);
    }
    
    
    public void itemsofthemonths(){
        System.out.println("-----------------------------------------------------------------------\n" +
"---------------Get Item of the month--------------------------\n" +
"-----------------------------------------------------------------------");
        for (int i = 0; i < allitems.size(); i++) {
            if(isBestItem(allitems.get(i))){
                System.out.println(allitems.get(i).toString());
                System.out.println(favoriteitem.itemreward);
            }
        }
        
    }
    
    
    
    public void itemsinfo(){
        System.out.println("Market Name: "+this.marketName);
        System.out.println("------------------------------------------------------------------------\n" +
"------------Items of this Market------------\n" +
"------------------------------------------------------------------------");
        for (int i = 0; i < allitems.size() ; i++) {
            System.out.println(allitems.get(i).toString());
            System.out.println("-----------------------------------------------------------------------");
        }
    }

    
    // the method to till if the item is an item of the month or not the item will be an item of the months when the total earnings are more than 1000 monthly 
    @Override
    public boolean isBestItem(itemEarning item) {
       if(item.TotalEarnings()>1000){
           return true;
       }
       else {
           return false;
       }
    }

  
    
}
