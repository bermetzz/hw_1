import java.util.Random;

public class Flower extends Plant{
    private int height;
    private Color color;
    private Shop shop;

    public Flower(Species species, int height, Color color, Shop shop) {
        super(species);
        this.height=height;
        this.color=color;
        this.shop=shop;
    }


    public int getHeight() {
        return height;
    }

    public Color getColor() {
        return color;
    }

    public Shop getShop() {
        return shop;
    }

    final public void waterTheFlower(){
        System.out.println("flower is watered with plain water");
    }
    public void waterTheFlower(String waterType){
        System.out.println("flower is watered with "+ waterType);
    }
    public String getInfo(){
        return "plant's species: "+getSpecies()+
                "\nheight: "+getHeight()+
                "\ncolor: "+getColor()+
                "\nshop name: "+shop.getName()+
                "\nshop address: "+shop.getAddress();
    }

}
