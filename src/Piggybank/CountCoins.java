package Piggybank;

public abstract class CountCoins{

    private static int maxId = 0;
    public int id;
    public String name;
    public int quantity;
    public double value;
 

    //constructor with fields
    public CountCoins(String name, double value, int quantity){
        maxId ++;
        this.id = maxId;
        this.name = name;
        this.value = value;
        this.quantity= quantity;

    }

    //methods with return
    public String setName(){
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public double getValue(){
        return value;

    }
    public void addValue(){
        this.value = this.value + value;
    }

        public int getQuantity(){
            return quantity;

    }
    public void addQuantity(int quantity){
        
        this.quantity = this.quantity + quantity;
    }  

    
}


