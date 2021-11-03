public class CalculTester { 

    public static void main(String[] args) {
//testers 
        Calcul o1 = new Calcul( 5,6);
        Calcul o2 = new Calcul( 2,3);
        Calcul o3 = new Calcul( 5,5);
        Calcul o4 = new Calcul( 8,2);
        Calcul o5 = new Calcul(20,5);
        Calcul o6 = new Calcul(-4,19);
        Calcul o7 = new Calcul(11,-5);
        Calcul o8 = new Calcul(7,3);
        Calcul o9 = new Calcul(12,4);
        Calcul o10 = new Calcul(3,9);


        System.out.println(o1.toString()+o1.area());
        if(o1.area()==30) {
            System.out.println("Test 1 passed");
        }
        else {
            System.out.println("Test 1 failed");
        }
        
        System.out.println(o2.toString()+o2.area());
        if(o2.area()==6) {
            System.out.println("Test 2 passed");
        }
        else {
            System.out.println("Test 2 failed");
        }

        System.out.println(o3.toString()+o3.area());
        if(o3.area()==25) {
            System.out.println("Test 3 passed");
        }
        else {
            System.out.println("Test 3 failed");
        }

        System.out.println(o4.toString()+o4.area());
        if(o4.area()==16) {
            System.out.println("Test 4 passed");
        }
        else {
            System.out.println("Test 4 failed");
        }
        
        System.out.println(o5.toString()+o5.area());
        if(o5.area()==100) {
            System.out.println("Test 5 passed");
        }
        else {
            System.out.println("Test 5 failed");
        }

        System.out.println(o6.toString()+o6.area());
        if(o6.area()==76) {
            System.out.println("Test 6 passed");
        }
        else {
            System.out.println("Test 6 failed");
        }

        System.out.println(o7.toString()+o7.area());
        if(o7.area()==55) {
            System.out.println("Test 7 passed");
        }
        else {
            System.out.println("Test 7 failed");
        }

        System.out.println(o8.toString()+o8.area());
        if(o8.area()==21) {
            System.out.println("Test 8 passed");
        }
        else {
            System.out.println("Test 8 failed");
        }

        System.out.println(o9.toString()+o9.area());
        if(o9.area()==48) {
            System.out.println("Test 9 passed");
        }
        else {
            System.out.println("Test 9 failed");
        }

        System.out.println(o10.toString()+o10.area());
        if(o10.area()==27) {
            System.out.println("Test 10 passed");
        }
        else {
            System.out.println("Test 10 failed");
        }

    }

}
