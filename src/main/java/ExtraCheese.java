public class ExtraCheese extends Toppings{

    IBasePizza basePizza;
    ExtraCheese(IBasePizza basePizza){
        this.basePizza=basePizza;
    }
    public int cost(){
        return  this.basePizza.cost()+20;
    }


}
