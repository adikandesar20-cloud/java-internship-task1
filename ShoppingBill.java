public class ShoppingBill {
        public static double calculateElectronicsGST(double a, double b) {
            return (a + b) * 1.18;
        }
        public static double calculateFashionGST(double c, double d) {
            return (c + d) * 1.13;
        }
        public static double calculateFoodGST(double e) {
            return e * 1.07;
        }
        public static double totalBill(double a, double b, double c, double d, double e) {
            double electronics = calculateElectronicsGST(a, b);
            double fashion = calculateFashionGST(c, d);
            double food = calculateFoodGST(e);
            return electronics + fashion + food;
        }
        public static double calculateDiscountedBill(double a, double b, double c, double d, double e) {
            double total = totalBill(a, b, c, d, e);
            double discount = total * 0.20;
            return total - discount;
        }
    public static void main(String[] args) {
                double x = 100, y = 100, z = 100, v = 100, w = 100;

                double electronics = calculateElectronicsGST(x, y);
                double fashion = calculateFashionGST(z, v);
                double food = calculateFoodGST(w);
                double total = totalBill(x, y, z, v, w);
                double discount = total * 0.20;
                double finalAmount = calculateDiscountedBill(x, y, z, v, w);

                System.out.println("Electronics: " + electronics);
                System.out.println("Fashion: " + fashion);
                System.out.println("Food: " + food);
                System.out.println("Total after GST = " + total);
                System.out.println("Discount = " + discount);
                System.out.println("Final payable amount = " + finalAmount);
                System.out.println("Total after GST = " + total + " | Discount = " + discount + " | Final payable amount = " + finalAmount);
            
    }
}
