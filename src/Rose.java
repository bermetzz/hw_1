final public class Rose extends Flower{
    private String roseVariety;
    private int price;

    public Rose(Species species, int height, Color color, Shop shop, String roseVariety, int price) {
        super(species, height, color, shop);
        this.roseVariety=roseVariety;
        this.price=price;
    }

    public String getRoseVariety() {
        return roseVariety;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public void waterTheFlower(String waterType) {
        System.out.println(roseVariety+" is watered with "+waterType);
    }

    @Override
    public String getInfo() {
        return super.getInfo()+
                "\nrose variety: "+getRoseVariety()+
                "\nprice: "+getPrice();
    }
}
