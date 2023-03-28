public class Taxi extends Car{
    private double fareCollected;
    public Taxi(String licensePlate,double tollFee,int passengers,boolean electric,double fare){
        super(licensePlate,tollFee,passengers,electric);
        this.fareCollected=fare;
    }

    public void printTaxi(){
        System.out.println("License Plate:"+getLicensePlate()+"\nPassengers:"+getPassengers()+"\nToll Fee:"+getTollFee()+"\nIs electric:"+isElectric()+"\nDiscount:"+isDiscountApplied()+"\nFare:"+fareCollected);
    }

    public void pickupRiders(int numRiders,double farePerRider){
        setPassengers(getPassengers()+numRiders);
        fareCollected+=farePerRider*numRiders;
        if (isDiscountApplied()==false&&getPassengers()>4){
            setTollFee(getTollFee()/2);
            setDiscountApplied(true);
        }
    }

    public double getFareCollected() {
        return fareCollected;
    }
}
