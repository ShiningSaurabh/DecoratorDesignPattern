public class Main {
    public static void main(String[] args){
        IBasePizza p1=new ExtraCheese(new ExtraVeggies( new ExtraJalepano(new Margaretta())));
        System.out.println(p1.cost());

        IBasePizza p2= new ExtraJalepano(new VeggieDelight());
        System.out.println(p2.cost());


        IBasePizza p3=new VeggieDelight();
        System.out.println(p3.cost());


    }
}
