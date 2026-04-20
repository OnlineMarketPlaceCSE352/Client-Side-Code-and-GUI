package Client.Models;

public class CartItem {
        private int productId;
        private int qty;
        private double price;

        public CartItem() {}

        public CartItem(int productId, int qty, double price) {
            this.productId = productId;
            this.qty = qty;
            this.price = price;
        }

        // Getters & Setters
        public int getProductId() {
            return productId;
        }

        public int getQty() {
            return qty;
        }

        public double getPrice() {
            return price;
        }

        public void setQty(int qty) {
            this.qty = qty;
        }

        // helper
        public double getTotal() {
            return qty * price;
        }
}

