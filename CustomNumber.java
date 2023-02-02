import java.util.Random;

public class CustomNumber {

    int number;

    public CustomNumber() {
        Random a=new Random();
        this.number = a.nextInt(1,12);
        System.out.println("custom number generated is: "+this.number);
    }

    public void getMultiplicationTable (){
        System.out.println("printing descending multiplication table of: "+this.number);

        int i=this.number;
        for (int b=i;b>0;b--){
            System.out.println(this.number*b);
        }
    }
}
