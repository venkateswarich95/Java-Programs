package oops;

public class MobileSG {
    //Instancde variables-->accessmodifier datatype variablename=value;
    private String deviceName;
    private int storage;
    private String model;
    private double screenSize;

    //Setter & getter methods
    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        if (storage > 0) {
            this.storage = storage;
        } else {
            this.storage = 0;
        }
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        if (screenSize > 0) {
            this.screenSize = screenSize;
        } else {
            this.screenSize = 0.0;
        }
    }

    protected void mobileProp(String deviceName, int storage, String model, double screenSize) {
        setDeviceName(deviceName);
        setModel(model);
        setStorage(storage);
        setScreenSize(screenSize);
        System.out.println("Displaying mobile properties....");
        System.out.println("Mobile Device name is:" + getDeviceName());//this.deviceName
        System.out.println(" Mobile Storage is:" + getStorage());
        System.out.println(" Mobile model is:" + getModel());
        System.out.println(" Mobile screen size is:" + getScreenSize());
    }

    public static void main(String[] args) {
        MobileSG mObj = new MobileSG();
        mObj.mobileProp("vivo", 45, "CPH2213", 16.33);

    }

}
