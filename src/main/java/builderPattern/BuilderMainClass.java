package builderPattern;

import builderPattern.phons.Phone;
import builderPattern.phons.PhoneBuilder;

public class BuilderMainClass {

    public static void main(String[] args){

        PhoneBuilder pb = new PhoneBuilder();
        pb.setOs("android")
        .setBattery(6)
        .setRam(20);

        Phone myPhone = pb.getPhone();

        System.out.println("===> "+ myPhone);
    }
}
