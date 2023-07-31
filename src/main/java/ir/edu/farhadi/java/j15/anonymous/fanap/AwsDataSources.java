package ir.edu.farhadi.java.j15.anonymous.fanap;

public class AwsDataSources {
    public static void main(String[] args) {

        DataSources dataSources = new AmazonS3();
        dataSources.readDate();

//        DataSources dataSources = new DataSources() {
//            @Override
//            public void readDate() {
//                System.out.println(" Connec to Amazon S3");
//            }
//        };

//        dataSources.readDate();

        AbstractDataSources abstractDataSources = new AbstractDataSources() {
            @Override
            public void readDate() {
                System.out.println(" Read Data from abstract mode");
            }
        };
        abstractDataSources.readDate();
    }
}
