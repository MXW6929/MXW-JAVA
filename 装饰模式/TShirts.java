package 装饰模式;

public class TShirts extends Finery
{
    public void show()
    {
        super.show();
        System.out.println("小背心");
    }
}
 class BigTrouser extends Finery
{
    public void show()
    {
        super.show();
        System.out.println("大裤衩");
    }
}
 class Sneakers extends Finery
{
    public void show()
    {
        super.show();
        System.out.println("凉拖");
    }
}
 class Suit extends Finery
{
    public void show()
    {
        super.show();
        System.out.println("短袖");
    }
}
 class Tie extends Finery
{
    public void show()
    {
        super.show();
        System.out.println("领带");
    }
}
 class LeatherShoes extends Finery
{
    public void show()
    {
        super.show();
        System.out.println("球鞋");
    }
}
