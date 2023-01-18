package ir.edu.farhadi.java.j3;

/**
 * these are a lot of samples for learning core java
 *
 * @author Mostafa.Farhadi c@2021
 */

/*
 * in this class i tried showed you how can i use builder pattern as MessageBuilder
 */
public class MessageBuilder {

    // i used StringBuffer because this type is synchronize and it is threadsafe
    private StringBuffer message = new StringBuffer();


//    private StringBuilder stringBuilder = new StringBuilder();

    /**
     * this method just can concat new String to old value
     * @param msg
     * @return this , mean return this object which in heap
     */
    public MessageBuilder enricher(String msg) {
        this.message.append(msg);
        return this;
    }

    /*
     * this is finally process method for get result
     */
    public void build(){
        System.out.println(message.toString());
    }

    /*
     * Builder pattern
     */
    public static void sampleForBuilderPattern() {
        MessageBuilder messageBuilder = new MessageBuilder();
        messageBuilder
                .enricher("Salam")
                .enricher("  ")
                .enricher(" Dear Mostafa")
                .enricher(" ")
                .enricher("Your Code is : ")
                .enricher("200")
                .build();
    }

    public static void main(String[] args) {
        sampleForBuilderPattern();
    }

}
