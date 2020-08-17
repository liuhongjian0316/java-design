package work.aijiu.strategy;

public class TrainStratrgy implements TravelHandler{
    @Override
    public void travelMethod() throws InterruptedException {
        System.out.println("乘火车去旅行");
    }
}
