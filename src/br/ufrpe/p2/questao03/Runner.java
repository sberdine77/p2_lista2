package br.ufrpe.p2.questao03;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Runner {
    public static void main(String[] args) throws Exception {
        CashFlow myCash = new CashFlow("Test", "34563543");
        BasicPlan basicPlans = new BasicPlan("Basic", LocalDateTime.now().minusMonths(3), 5);
        BasicPlan basicPlans1 = new BasicPlan("Basic", LocalDateTime.now().minusMonths(100), 5);
        BasicPlan basicPlans2 = new BasicPlan("Basic", LocalDateTime.now().minusMonths(10), 5);
        BasicPlan basicPlans3 = new BasicPlan("Basic", LocalDateTime.of(2020, 4, 22, 12, 35, 00), 5);

        myCash.addTransaction(basicPlans);
        myCash.addTransaction(basicPlans1);
        myCash.addTransaction(basicPlans2);
        myCash.addTransaction(basicPlans3);

        PlusPlan plusPlans = new PlusPlan("Plus", LocalDateTime.now().minusMonths(3), 5);
        PlusPlan plusPlans1 = new PlusPlan("Plus", LocalDateTime.now().minusMonths(100), 5);
        PlusPlan plusPlans2 = new PlusPlan("Plus", LocalDateTime.now().minusMonths(10), 5);
        PlusPlan plusPlans3 = new PlusPlan("Plus", LocalDateTime.of(2020, 4, 22, 12, 35, 00), 5);

        myCash.addTransaction(plusPlans);
        myCash.addTransaction(plusPlans1);
        myCash.addTransaction(plusPlans2);
        myCash.addTransaction(plusPlans3);

        EnterprisePlan enterprisePlans = new EnterprisePlan("Enterprise", LocalDateTime.now().minusMonths(3), 5);
        myCash.addTransaction(enterprisePlans);

        EnergyExpense energyExpense = new EnergyExpense("mes1", LocalDateTime.now().minusMonths(3), 127);
        EnergyExpense energyExpense2 = new EnergyExpense("mes2", LocalDateTime.now().minusMonths(100), 17);
        EnergyExpense energyExpense3 = new EnergyExpense("mes3", LocalDateTime.now().minusMonths(10), 67);
        EnergyExpense energyExpense4 = new EnergyExpense("mes4", LocalDateTime.of(2020, 4, 22, 12, 35, 00), 390);

        myCash.addTransaction(energyExpense);
        myCash.addTransaction(energyExpense2);
        myCash.addTransaction(energyExpense3);
        myCash.addTransaction(energyExpense4);

        WaterExpense waterExpense = new WaterExpense("mes1", LocalDateTime.now().minusMonths(3), 7);
        WaterExpense waterExpense2 = new WaterExpense("mes2", LocalDateTime.now().minusMonths(100), 17);
        WaterExpense waterExpense3 = new WaterExpense("mes3", LocalDateTime.now().minusMonths(10), 79);
        WaterExpense waterExpense4 = new WaterExpense("mes4", LocalDateTime.of(2020, 4, 22, 12, 35, 00), 22);

        myCash.addTransaction(waterExpense);
        myCash.addTransaction(waterExpense2);
        myCash.addTransaction(waterExpense3);
        myCash.addTransaction(waterExpense4);

        InternetExpense internetExpense = new InternetExpense("mes1", LocalDateTime.now().minusMonths(3), 89);
        InternetExpense internetExpense2 = new InternetExpense("mes2", LocalDateTime.now().minusMonths(100), 129);
        InternetExpense internetExpense3 = new InternetExpense("mes3", LocalDateTime.now().minusMonths(10), 300);
        InternetExpense internetExpense4 = new InternetExpense("mes4", LocalDateTime.of(2020, 4, 22, 12, 35, 00), 500);

        myCash.addTransaction(internetExpense);
        myCash.addTransaction(internetExpense2);
        myCash.addTransaction(internetExpense3);
        myCash.addTransaction(internetExpense4);

        System.out.println("Despesas em 2 anos: " + myCash.calculateExpenses(LocalDate.now().minusMonths(24), LocalDate.now()) + "\n");
        System.out.println("Receitas em 2 anos: " + myCash.calculateIncome(LocalDate.now().minusMonths(24), LocalDate.now()) + "\n");
        System.out.println("Balanço atual: " + myCash.currentBalance() + "\n");
        System.out.println("Percentual de despesas no mês 04/2020: " + myCash.expensesPercentualInMonth(4, 2020) + "\n");
        System.out.println("Percentual de receitas no mês 04/2020: " + myCash.incomePercentualInMonth(4, 2020) + "\n");
        System.out.println("Transações do mês 04/2020: " + myCash.listTransactionsInMonth(4, 2020) + "\n");
        
    }
}
