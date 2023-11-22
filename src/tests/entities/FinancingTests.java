package tests.entities;

import entities.Financing;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FinancingTests {
    @Test
    public void constructShouldCreateObjectWhenValidData(){
        Financing financing = new Financing(100000.00, 2000.00, 80);
        Assertions.assertEquals(100000.00, financing.getTotalAmount());
        Assertions.assertEquals(2000.00, financing.getIncome());
        Assertions.assertEquals(80, financing.getMonths());
    }

    @Test
    public void constructorShouldThrowsIllegalArgumentExceptionWhenDataIsInvalid(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Financing financing = new Financing(100000.00, 2000.00, 20);
        });
    }

    @Test
    public void setTotalAmountShouldAssignTotalAmountValueCorrectlyWhenDataIsValid(){
        Financing financing = new Financing(100000.00, 2000.00, 80);
        financing.setTotalAmount(80000.00);
        double result = financing.getTotalAmount();

        Assertions.assertEquals(80000.00, result);;
    }

    @Test
    public void setTotalAmountShouldThrowsIllegalArgumentExceptionWhenDataIsInvalid(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Financing financing = new Financing(100000.00, 2000.00, 80);
            financing.setTotalAmount(185000.00);

        });
    }

    @Test
    public void setIncomeShouldAssignIncomeValueCorrectlyWhenDataIsValid(){
        Financing financing = new Financing(100000.00, 2000.00, 80);
        financing.setIncome(4500.00);
        double result = financing.getIncome();

        Assertions.assertEquals(4500.00, result);
    }

    @Test
    public void setIncomeShouldThrowsIllegalArgumentExceptionWhenDataIsValid(){

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Financing financing = new Financing(100000.00, 2000.00, 80);
            financing.setIncome(1500.00);
        });
    }

    @Test
    public void setMonthsShouldAssignIncomeValueCorrectlyWhenDataIsValid(){
        Financing financing = new Financing(100000.00, 2000.00, 80);
        financing.setMonths(90);
        double result = financing.getMonths();

        Assertions.assertEquals(90, result);
    }

    @Test
    public void setMonthsShouldThrowsIllegalArgumentExceptionWhenDataIsValid(){

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Financing financing = new Financing(100000.00, 2000.00, 80);
            financing.setMonths(20);
        });
    }

    @Test
    public void entryShouldCalculateCorrectlyEntryValue(){
        Financing financing = new Financing(100000.00, 2000.00, 80);

        double expected = 20000.00;
        double result  = financing.entry();

        Assertions.assertEquals(expected, result);
    }

    @Test
    public void quotaShouldCalculateCorrectlyQuotaValue(){
        Financing financing = new Financing(100000.00, 2000.00, 80);

        double expected = 1000.00;
        double result  = financing.quota();

        Assertions.assertEquals(expected, result);
    }
}
