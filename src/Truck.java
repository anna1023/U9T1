public class Truck extends Vehicle {
    private int axles;
    private boolean hasTrailer;

    public Truck(String licensePlate, double tollFee, int passengers, int axles, boolean hasTrailer) {
        super(licensePlate, tollFee, passengers);
        this.axles = axles;
        this.hasTrailer = hasTrailer;
    }

    public void printTruck(){
        System.out.println("License Plate:"+getLicensePlate()+"\nPassengers:"+getPassengers()+"\nToll Fee:"+getTollFee()+"\nAxles:"+axles+"\nTrailer:"+hasTrailer);
    }

    public boolean validateLicensePlate(){
        String lic = getLicensePlate();
        if(hasTrailer==false){
            return true;
        }
        if(hasTrailer&&axles>4){
            if (lic.substring(4,6).equals("MX")){
                return true;
            }
            else{
                return false;
            }
        }
        if(hasTrailer&&axles<=4){
            if(lic.substring(4,6).equals("LX")){
                return true;
            }
            else{
                return false;
            }
        }
        return true;
    }
}
//