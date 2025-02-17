public class U0901WorkArray <T extends Number>  {
    T[] arrNums;
    public U0901WorkArray(T[] numP){
        arrNums = numP;
    }
    public double sum(){
        double doubleWork = 0;
        for (T arrNum : arrNums) {
            doubleWork = arrNum.doubleValue() + doubleWork;
        }
        return doubleWork;
    }
}
