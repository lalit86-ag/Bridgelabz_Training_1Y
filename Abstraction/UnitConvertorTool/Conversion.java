package UnitConvertorTool;

public interface Conversion {
    public static double[] convert(double km,double kg){
        double[] ans=new double[2];
        double m=km*0.621371;
        double p=kg*2.20462;
        ans[0]=m;
        ans[1]=p;
        return ans;
    }
}