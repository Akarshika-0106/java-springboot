package JavaConcepts.Immutable;

import java.util.ArrayList;
import java.util.List;

final class MyImmutableClass {
    private final String name;
    private final List<Object> petNames;

    public MyImmutableClass(String name, List<Object> petNames){
        this.name = name;
        this.petNames = petNames;
    }

    public String getName() {
        return name;
    }

    public List<Object> getPetNames() {
        return new ArrayList<>(petNames); //returns copy of member variables
    }
}
