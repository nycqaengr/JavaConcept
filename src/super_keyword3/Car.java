package super_keyword3;

public class Car extends Vehicle{

    //color, weight, display method automatically come here
    public Car(String c, double w) {
        super(c, w);
    }

    int gear;

    public Car(String c, double w, int g) {
        //color=c;
        //weight=w;
        super(c, w);//calling the constructor of vehicle
        gear=g;
    }

    public void dispaly() {
        //System.out.println("color is :"+color);
        //System.out.println("weight is :"+weight);
        super.dispaly();
        System.out.println("gear is :"+gear);
    }
}
