public class Main {
    public static void main(String[] args) {
        // ex1
        short clientOS = 0;
        if (clientOS == 1){
         System.out.println("Install the IOS version of the app by following the link");
        } else {
            System.out.println("Install the Android version of the app by following the link");
        }

        // ex2
        int oC= 1;
        int clientDeviceYear =2016;
        if (oC == 1 && clientDeviceYear <2015){
           System.out.println("Install easy IOS");
        }
        if (oC == 0 && clientDeviceYear <2015){
            System.out.println("Install easy Android");
        }
        if (oC == 1 && clientDeviceYear >=2015){
            System.out.println("Install new version IOS");
        }
        if (oC == 0 && clientDeviceYear >=2015) {
            System.out.println("Install new version Android");
        }

        // ex3
        int year = 2021;
        if (year %4 == 0 || year %400 ==0){
            System.out.println("High-grade year");
        } else {
            System.out.println("Not a high-grade year");
        }

        // ex4
        int deliveryDistance = 95;
        if (deliveryDistance <=20 ) {
            System.out.println("Days: 1");
        } else if ( deliveryDistance<= 60 && deliveryDistance >20){
            System.out.println("Days: 2");
        } else if ( deliveryDistance <=100 && deliveryDistance >60){
            System.out.println("Days: 3");
        }

        // ex5
        int monthNumber = 3;
        switch (monthNumber) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("No");
        }
    }
}