package factoryPattern.phones;

public class OperatingSystemFactory {

   public OperatingSystem getOperator(String operatorName){
       if(operatorName.equals("android"))
           return new AndroidOS();
      else  if(operatorName.equals("ios"))
           return new IosOS();
       else return new Windows();
   }


}
