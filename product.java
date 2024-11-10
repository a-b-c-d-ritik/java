class product
{
    private String itemno;
    private String name;
    private double price;
    private int qty;
    
    public String getItem()
    {
        return itemno;
    }

    public String getName()
    {
        return name;
    }

    public double getPrice()
    {
        return price;
    }

    public int getQty()
    {
        return qty;
    }

    public void setPrice(double p)
    {
        price=p;
    }

    public void setQty(int q)
    {
        qty=q;
    }


    public product()
    {
        itemno=null;
        name=null;
        price=0;
        qty=0;
    }
    
    public product(String i,String nm)
    {
        itemno=i;
        name=nm;
    }


    public double total()
    {
        return price*qty;
    }
}

class shop
{
    public static void main(String ar[])
    {
        product p= new product("p1004","parleG");
        p.setPrice(5.00);
        p.setQty(10);
        System.out.println(p.getItem());
        System.out.println(p.getName());
        System.out.println(p.total());
    }
}
