package lms;

public class BuilderPattern {
    //To simply the creation of complex objects
    //Building complex user profiles or book entries
}
class UserProfile{
    String name;
    String phoneNumber;
    String email;
    private UserProfile(UserProfileBuilder userProfileBuilder){
        this.name = userProfileBuilder.name;
        this.email = userProfileBuilder.email;
        this.phoneNumber = userProfileBuilder.phoneNumber;
    }
    public static class UserProfileBuilder {
        private String name;
        private String email;
        private String phoneNumber;

        public UserProfileBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public UserProfileBuilder setEmail(String email) {
            this.email = email;
            return this;
        }

        public UserProfileBuilder setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }
        public UserProfile build(){
            return new UserProfile(this);
        }
    }

}
