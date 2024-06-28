package Model;



public class MonthlyIncomeExpenseReport {

    public static int TotIncome = 0;
    public static int TotExpense = 0;

    public int AddAction(int Amount) {
        TotIncome = TotIncome + Amount;
        return TotIncome;
    }

    public int RemoveAction(int Amount) {
        TotExpense = TotExpense - Amount;
        return TotExpense;
    }
}
