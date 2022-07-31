package ir.edu.farhadi.java.j19.di;

public class CallTarget {


    /*
        1 way : this is full dependency to an object
     */
//    Calling calling2 = new VideoCall();
    /*
        2 way : this is full dependency to an object
     */
//    Calling calling3 = FactoryPattern.getCall("video");

    @MostafaAutowired(bean = "video")
    private Calling calling;

    public Calling getCalling() {
        return calling;
    }

    public void setCalling(Calling calling) {
        this.calling = calling;
    }

    public void calling(String name, String phoneNumber) {
//        calling2.call(name, phoneNumber);
//        calling3.call(name, phoneNumber);
        calling.call(name, phoneNumber);
    }
}
