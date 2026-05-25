public class  {
    public static void main(String) args[]){
        SmartLight light1 = new SmartLight("Living Room", 75);

        light1.togglePower;
    }
}

class SmartDevice{
    private boolean powerStatus;
    protected String deviceName;

    public SmartDevice(String deviceName){
        this.deviceName = deviceName;
        this.powerStatus = false;
    }

    public boolean getPowerStatus(){
        return powerStatus;
    }

    public void togglePower(){
        powerStatus = !powerStatus;
    }
}

class SmartLight extends SmartDevice{
    private int birghtness;

    public SmartLight(String deviceName, int birghtness){
        super(deviceName);
        this.birghtness = birghtness;
    }


    
}
