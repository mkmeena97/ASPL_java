
abstract class CloudService {
    String provider;

    public CloudService(String provider) {
        this.provider = provider;
    }

    // Abstract method
    abstract void storeData(String data);
}

// Concrete Class 1
class AWS extends CloudService {
    public AWS() {
        super("AWS");
    }

    @Override
    void storeData(String data) {
        System.out.println("Storing data in AWS S3: " + data);
    }
}

// Concrete Class 2
class GoogleCloud extends CloudService {
    public GoogleCloud() {
        super("Google Cloud");
    }

    @Override
    void storeData(String data) {
        System.out.println("Storing data in Google Cloud Storage: " + data);
    }
}

public class AbstractionExample {
    public static void main(String[] args) {
        CloudService aws = new AWS();
        aws.storeData("Tech Documents");

        CloudService gcp = new GoogleCloud();
        gcp.storeData("Project Backup");
    }
}

