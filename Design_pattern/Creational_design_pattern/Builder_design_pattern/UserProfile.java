public class UserProfile {
    private final String username;      // Required
    private final String email;         // Required
    private final String phoneNumber;   // Optional
    private final String address;       // Optional
    private final String jobTitle;      // Optional
    private final String techStack;     // Optional

    private UserProfile(Builder builder) {
        this.username = builder.username;
        this.email = builder.email;
        this.phoneNumber = builder.phoneNumber;
        this.address = builder.address;
        this.jobTitle = builder.jobTitle;
        this.techStack = builder.techStack;
    }

    public static class Builder {
        private final String username;
        private final String email;
        private String phoneNumber;
        private String address;
        private String jobTitle;
        private String techStack;

        public Builder(String username, String email) {
            this.username = username;
            this.email = email;
        }

        public Builder phoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public Builder address(String address) {
            this.address = address;
            return this;
        }

        public Builder jobTitle(String jobTitle) {
            this.jobTitle = jobTitle;
            return this;
        }

        public Builder techStack(String techStack) {
            this.techStack = techStack;
            return this;
        }

        public UserProfile build() {
            return new UserProfile(this);
        }
    }

    public void printProfile() {
        System.out.println("Username: " + username);
        System.out.println("Email: " + email);
        System.out.println("Phone: " + (phoneNumber != null ? phoneNumber : "N/A"));
        System.out.println("Address: " + (address != null ? address : "N/A"));
        System.out.println("Job Title: " + (jobTitle != null ? jobTitle : "N/A"));
        System.out.println("Tech Stack: " + (techStack != null ? techStack : "N/A"));
    }

    public static void main(String[] args) {
        UserProfile user = new UserProfile.Builder("fullstack_dev", "mahendrakumar@gmail.com")
                .phoneNumber("7665770360")
                .address("India")
                .jobTitle("Full-Stack Developer Intern")
                .techStack("React.js, Node.js, PostgreSQL, Java, Spring Boot")
                .build();

        user.printProfile();
    }
}
