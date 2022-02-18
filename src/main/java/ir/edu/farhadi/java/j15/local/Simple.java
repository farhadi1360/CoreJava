package ir.edu.farhadi.java.j15.local;
/*
  in local class we can declare a class in body of each method
  we use in this way if we want to define special behavior .
  although the local class define in method but object of local class is not in stack frame and it is in heap
 */
public class Simple {
    String masterName;

    public void doAction() {
        boolean state = false;
        class Action {
            String actionName = "Calling !!!";
            void call() {
                System.out.println(actionName + state + "     " + masterName);
            }
        }
        Action action = new Action();
        action.call();
    }
}
