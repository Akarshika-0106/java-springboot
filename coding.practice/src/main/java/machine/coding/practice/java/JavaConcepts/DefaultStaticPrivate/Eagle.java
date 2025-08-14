package machine.coding.practice.java.JavaConcepts.DefaultStaticPrivate;

public class Eagle implements Bird{

    @Override
    public void canFly() {
        //Eagle fly logic
    }

    @Override
    public boolean canBreath() {
        return true; //we need to provide its implementation because this method
        // was abstracted in Bird interface
    }
}
