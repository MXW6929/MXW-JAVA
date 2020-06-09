package 工厂方法;
//学雷锋的大学生工厂
public class UndergraduateFactory implements IFactory
{
    public LeiFeng createLeiFeng()
    {
        return new Undergraduate();
    }
}
