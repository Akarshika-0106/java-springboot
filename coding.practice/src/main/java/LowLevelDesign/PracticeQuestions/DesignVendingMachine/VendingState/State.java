package LowLevelDesign.PracticeQuestions.DesignVendingMachine.VendingState;

import LowLevelDesign.PracticeQuestions.DesignVendingMachine.Model.Item;
import LowLevelDesign.PracticeQuestions.DesignVendingMachine.Model.Money;
import LowLevelDesign.PracticeQuestions.DesignVendingMachine.VendingMachine;

import java.util.List;

public interface State {

    public void clickOnInsertMoneyButton(VendingMachine machine) throws Exception;

    public void insertMoney(VendingMachine machine, Money money) throws Exception;

    public void clickOnSelectProductButton(VendingMachine machine) throws Exception;

    public void chooseProduct(VendingMachine machine, int code) throws Exception;

    public Item dispenseProduct(VendingMachine machine, int codeNumber) throws Exception;

    public List<Money> cancelAndRefund(VendingMachine machine) throws Exception;

    public int getChange(int changeAmount) throws Exception;
}
