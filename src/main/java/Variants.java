//import java.util.Scanner;
//
//public class Variants {
//    String variant;
//
//    public Variants(String v){
//        setVariant(v);
//        Reshenie();
//    }
//
//    public String getVariant() {
//        return variant;
//    }
//
//    public void setVariant(String variant) {
//        this.variant = variant;
//    }
//
//    public void Reshenie() {
//        if (this.variant.equals( "V1")) {
//
//            double a = Double.parseDouble(args[2]);
//            double b = Double.parseDouble(args[3]);
//            double c = Double.parseDouble(args[4]);
//            double x = Double.parseDouble(args[5]);
//            double n = Double.parseDouble(args[6]);
//            System.out.println("Arguments: " + a + "; " + b + "; " + c + "; " + x + "; " + n);
//            z = (5 * Math.pow(a, (n * x))) / (b + c) - Math.pow((Math.abs(Math.cos(Math.pow(x, 3)))), 0.5);
//        }
//
//        if (this.variant.equals( "V2")) {
//            double a = Double.parseDouble(args[2]);
//            double y = Double.parseDouble(args[3]);
//            double x = Double.parseDouble(args[4]);
//            double w = Double.parseDouble(args[5]);
//            System.out.println("Arguments: " + a + "; " + y + "; " + x + "; " + w);
//            z = (Math.abs(x - y)) / Math.pow((1 + 2 * x), a) - Math.pow(Math.E, Math.pow((1 + w), 0.5));
//        }
//
//        if (this.variant.equals( "V3")) {
//            double a0 = Double.parseDouble(args[2]);
//            double a1 = Double.parseDouble(args[3]);
//            double a2 = Double.parseDouble(args[4]);
//            double x = Double.parseDouble(args[5]);
//            System.out.println("Arguments: " + a0 + "; " + a1 + "; " + a2 + "; " + x);
//            z = Math.sqrt(a0 + a1 * x + a2 * (Math.pow((Math.abs(Math.sin(x))), (1.0 / 3.0))));
//        }
//
//        if (this.variant.equals( "V4")) {
//            double a = Double.parseDouble(args[2]);
//            double x = Double.parseDouble(args[5]);
//            System.out.println("Arguments: " + a + "; " + x);
//            z = Math.log(Math.abs(Math.pow(a, 7))) + Math.atan(Math.pow(x, 2)) + Math.PI / (Math.sqrt(Math.abs(a + x)));
//        }
//
//        if (this.variant.equals( "V5")) {
//            double a = Double.parseDouble(args[2]);
//            double b = Double.parseDouble(args[3]);
//            double c = Double.parseDouble(args[4]);
//            double d = Double.parseDouble(args[5]);
//            double x = Double.parseDouble(args[6]);
//            System.out.println("Arguments: " + a + "; " + b + "; " + c + "; " + d + "; " + x);
//            z = Math.pow(((Math.pow((a + b), 2)) / (c + d)), (1.0 / 5.0)) + Math.pow(Math.E, Math.sqrt(x + 1));
//        }
//
//        if (this.variant.equals( "V6")) {
//            double x = Double.parseDouble(args[2]);
//            System.out.println("Arguments: " + x);
//            z = Math.pow(Math.E, (((2 * Math.sin(4 * x)) + Math.pow(Math.cos(x * x), 2)) / (3 * x)));
//        }
//
//        if (this.variant.equals( "V7")) {
//            double x = Double.parseDouble(args[2]);
//            System.out.println("Arguments: " + x);
//            z = 0.25 * ((1 + x * x) / (1 - x) + 0.5 * Math.tan(x));
//        }
//    }
//}
