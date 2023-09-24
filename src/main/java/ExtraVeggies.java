public class ExtraVeggies extends Toppings{
    IBasePizza basePizza;
    ExtraVeggies(IBasePizza basePizza){
        this.basePizza=basePizza;
    }
    public int cost(){
        return this.basePizza.cost()+40;
    }
}
