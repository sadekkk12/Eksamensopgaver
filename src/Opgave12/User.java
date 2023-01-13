package Opgave12;

import java.util.Random;

public class User {
        private String fullName;
        private String userID;

        public User (String fullName, String userID){
            this.fullName = fullName;
            this.userID = userID;
        }
        public User(String fullName){
            this.fullName = fullName;
            this.userID = createUserID();
        }

        public String getUserID() {
            return userID;
        }

        public boolean validUserID(){
            return userID.matches("[a-å]{4}[0-9]{4}");
        }

        public String createUserID(){
            String[] splitName = fullName.split(" ");
            Random random = new Random();
            StringBuilder sb = new StringBuilder();
            sb.append(splitName[0].charAt(0));
            sb.append(splitName[0].charAt(1));
            sb.append(splitName[1].charAt(0));
            sb.append(splitName[1].charAt(1));
            sb.append(random.nextInt(0,9));
            sb.append(random.nextInt(0,9));
            sb.append(random.nextInt(0,9));
            sb.append(random.nextInt(0,9));
            return String.valueOf(sb);
        }
    public static void main(String[] args) {

        User user = new User("Mogens Mogensen", "abcd1234");
        User user2 = new User("Jon Jones", "sadd1234");

        System.out.println(user.validUserID());
        System.out.println(user2.validUserID());
        User user3 = new User("RAsmus rasumssen");
        System.out.println(user3.getUserID());
        System.out.println(user3.validUserID());
        }


        //TODO look up ternary operator return 10+10 ? true:false
}
// TODO string.charat til NAMEID
