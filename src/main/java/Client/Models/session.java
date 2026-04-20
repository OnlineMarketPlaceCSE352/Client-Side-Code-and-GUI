package Client.Models;

public class session {

        public static String token;
        public static double balance;
        public session(String token){
            this.token=token;
            this.balance = 0.0;
        }
        public void setBalance(double balance){
            this.balance=balance;
        }
        public static boolean isLoggedIn() {
            return token != null;
        }

}
