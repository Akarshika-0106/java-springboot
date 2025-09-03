package codingpractice.JavaCoreConcepts.SealedClasses;

//It tells that it can be implemented only by its own "permits" list, which is its direct child.
//Each child of Shape interface can be one of these: final, sealed or non-sealed.
public sealed interface Shape permits Circle, Rectangle{
}
