public class ExtraJalepano extends Toppings{
    IBasePizza basePizza;
    ExtraJalepano(IBasePizza basePizza){
       this.basePizza=basePizza;
    }
    public int cost(){
        return this.basePizza.cost()+10;
    }
}
