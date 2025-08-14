package LowLevelDesign.PracticeQuestions.DesignVendingMachine.Model;

public enum Money {

    FIVE(5),
    TEN(10),
    TWENTY(20),
    FIFTY(50);

    public int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    Money(int value){
        this.value = value;
    }

}
