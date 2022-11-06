public class Main {
    public static void main(String[] args){
        Shop shop=new Shop("Florissimo", "Chokmorov 21");
        Shop shop1=new Shop("Roses", "Kiev 12");
        Flower flower=new Flower(Species.CULTIVATED,30, Color.WHITE, shop);
        flower.waterTheFlower();
        flower.waterTheFlower("boiled water");
        System.out.println(flower.getInfo());
        System.out.println("-------------------");
        Rose rose=new Rose(Species.CULTIVATED, 25, Color.PINK, shop, "Aelita", 200);
        rose.waterTheFlower("boiled water");
        rose.waterTheFlower();
        System.out.println(rose.getInfo());
        System.out.println("--------------------");
        Rose rose1=new Rose(Species.WILD, 65, Color.RED, shop1, "French rosehip", 500);
        rose1.waterTheFlower("half boiled water");
        rose1.waterTheFlower();
        System.out.println(rose1.getInfo());




    }
}
