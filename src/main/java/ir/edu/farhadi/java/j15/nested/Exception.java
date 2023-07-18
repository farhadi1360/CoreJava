package ir.edu.farhadi.java.j15.nested;

public class Exception {
    private Exception(){}
    private int code;
    private String message;

/*
    as you can see a bold difference of nested class and inner class is that just define static class
    furthermore usually we can use  Builder pattern in outer class as nested class . like this sample..
 */
    public static class MessageBuilder{
        private int code;
        private String message;

        public MessageBuilder withCode(int code) {
            this.code = code;
            return this;
        }
        public MessageBuilder withMessage(String message) {
            this.message = message;
            return this;
        }

        public Exception build() {
            Exception exception = new Exception();
            exception.code=this.code;
            exception.message=this.message;
            return exception;

        }


    }

    @Override
    public String toString() {
        return "Exception{" +
                "code=" + code +
                ", message='" + message + '\'' +
                '}';
    }
}
