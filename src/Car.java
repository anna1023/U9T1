public class Car extends Vehicle {
    private boolean electric;
    private boolean discountApplied;

    public Car(String licensePlate, double tollFee, int passengers, boolean electric) {
        super(licensePlate, tollFee, passengers);
        this.electric = electric;
        discountApplied = false;   // default value
    }

    public boolean isElectric() {
        return electric;
    }

    public boolean isDiscountApplied() {
        return discountApplied;
    }

    public void printCar(){
        System.out.println("License Plate:"+getLicensePlate()+"\nPassengers:"+getPassengers()+"\nToll Fee:"+getTollFee()+"\nIs electric:"+electric+"\nDiscount:"+discountApplied);
    }

    public boolean dropOffPassengers(int numOut){
        if (numOut>=getPassengers()){
            return false;
        }
        setPassengers(getPassengers()-numOut);
        return true;
    }
public void setDiscountApplied(boolean t){
        this.discountApplied=t;
}
    public void applyDiscount(){
        if(discountApplied==false&&electric){
            setTollFee(getTollFee()/2);
            discountApplied=true;
        }
    }
}
//