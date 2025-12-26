public class Kala {
    private int price;
    private int existence;
    public String name;

    public void setPrice(int price)
    {
        this.price = price;
    }
    public int getPrice()
    {
        return price;
    }
    public void setExistence(int existence)
    {
        this.existence = existence;
    }
    public int getExistence()
    {
        return existence;
    }
    public int arzesh(){
        return price * existence;
    }
}
