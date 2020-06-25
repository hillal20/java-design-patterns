package factoryPattern;

import factoryPattern.phones.*;

public class FactoryMainClass {

    public static void main(String[] args){

        OperatingSystemFactory osf = new OperatingSystemFactory();
        OperatingSystem android =  osf.getOperator("android");
        OperatingSystem ois = osf.getOperator("ios");
        OperatingSystem windows = osf.getOperator("window");

        android.spec();
        ois.spec();
        windows.spec();


    }


}
