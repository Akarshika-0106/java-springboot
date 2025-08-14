package JavaConcepts.DefaultStaticPrivate;

public class Sparrow implements Bird{
    @Override
    public void canFly() {
        //Sparrow fly logic
    }

    @Override
    public boolean canBreath() {
        return true; //we need to provide its implementation because this method
        // was abstracted in Bird interface
    }
}
