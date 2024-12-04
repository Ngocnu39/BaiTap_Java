package bt3_1;

public class TestMyComplex {
        public static void main(String[] args) {
            testConstructorAndToString();
            testAddition();
            testSubtraction();
            testMultiplication();
            testDivision();
            testMagnitude();
            testArgument();
            testConjugate();
            testEquality();
            testRealAndImaginaryCheck();
        }

        private static void testConstructorAndToString() {
            MyComplex c = new MyComplex(3.0, 4.0);
            System.out.println("testConstructorAndToString: " + c);
            System.out.println("Expected: (3.0+4.0i)");
        }

        private static void testAddition() {
            MyComplex c1 = new MyComplex(3.0, 4.0);
            MyComplex c2 = new MyComplex(1.0, -2.0);
            MyComplex result = c1.addNew(c2);
            System.out.println("testAddition: " + result);
            System.out.println("Expected: (4.0+2.0i)");
        }

        private static void testSubtraction() {
            MyComplex c1 = new MyComplex(3.0, 4.0);
            MyComplex c2 = new MyComplex(1.0, -2.0);
            MyComplex result = c1.subtractNew(c2);
            System.out.println("testSubtraction: " + result);
            System.out.println("Expected: (2.0+6.0i)");
        }

        private static void testMultiplication() {
            MyComplex c1 = new MyComplex(3.0, 4.0);
            MyComplex c2 = new MyComplex(1.0, -2.0);
            MyComplex result = c1.multiply(c2);
            System.out.println("testMultiplication: " + result);
            System.out.println("Expected: (11.0-2.0i)");
        }

        private static void testDivision() {
            MyComplex c1 = new MyComplex(3.0, 4.0);
            MyComplex c2 = new MyComplex(1.0, -2.0);
            MyComplex result = c1.divide(c2);
            System.out.println("testDivision: " + result);
            System.out.println("Expected: (-1.6+1.2i)");
        }

        private static void testMagnitude() {
            MyComplex c = new MyComplex(3.0, 4.0);
            double result = c.magnitude();
            System.out.println("testMagnitude: " + result);
            System.out.println("Expected: 5.0");
        }

        private static void testArgument() {
            MyComplex c = new MyComplex(3.0, 4.0);
            double result = c.argument();
            System.out.println("testArgument: " + result);
            System.out.println("Expected (approx): 0.93 radians");
        }

        private static void testConjugate() {
            MyComplex c = new MyComplex(3.0, 4.0);
            MyComplex result = c.conjugate();
            System.out.println("testConjugate: " + result);
            System.out.println("Expected: (3.0-4.0i)");
        }

        private static void testEquality() {
            MyComplex c1 = new MyComplex(3.0, 4.0);
            MyComplex c2 = new MyComplex(3.0, 4.0);
            boolean result = c1.equals(c2);
            System.out.println("testEquality: " + result);
            System.out.println("Expected: true");
        }

        private static void testRealAndImaginaryCheck() {
            MyComplex c1 = new MyComplex(3.0, 0.0);
            MyComplex c2 = new MyComplex(0.0, 4.0);
            System.out.println("testRealAndImaginaryCheck:");
            System.out.println("Is c1 real? " + c1.isReal() + " (Expected: true)");
            System.out.println("Is c1 imaginary? " + c1.isImaginary() + " (Expected: false)");
            System.out.println("Is c2 real? " + c2.isReal() + " (Expected: false)");
            System.out.println("Is c2 imaginary? " + c2.isImaginary() + " (Expected: true)");
        }
}
