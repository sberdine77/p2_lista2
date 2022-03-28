package br.ufrpe.p2.questao03;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Runner {
    public static void main(String[] args) throws Exception {
        CashFlow myCash = new CashFlow("Test", "34563543");
        BasicPlan basicPlans = new BasicPlan("Basic", LocalDateTime.now().minusMonths(3), 5);
        BasicPlan basicPlans1 = new BasicPlan("Basic", LocalDateTime.now().minusMonths(100), 5);
        BasicPlan basicPlans2 = new BasicPlan("Basic", LocalDateTime.now().minusMonths(10), 5);
        BasicPlan basicPlans3 = new BasicPlan("Basic", LocalDateTime.now().minusMonths(24), 5);

        myCash.addTransaction(basicPlans);
        myCash.addTransaction(basicPlans1);
        myCash.addTransaction(basicPlans2);
        myCash.addTransaction(basicPlans3);

        PlusPlan plusPlans = new PlusPlan("Plus", LocalDateTime.now().minusMonths(3), 5);
        PlusPlan plusPlans1 = new PlusPlan("Plus", LocalDateTime.now().minusMonths(100), 5);
        PlusPlan plusPlans2 = new PlusPlan("Plus", LocalDateTime.now().minusMonths(10), 5);
        PlusPlan plusPlans3 = new PlusPlan("Plus", LocalDateTime.now().minusMonths(24), 5);

        myCash.addTransaction(plusPlans);
        myCash.addTransaction(plusPlans1);
        myCash.addTransaction(plusPlans2);
        myCash.addTransaction(plusPlans3);

        EnterprisePlan enterprisePlans = new EnterprisePlan("Enterprise", LocalDateTime.now().minusMonths(3), 5);
        myCash.addTransaction(enterprisePlans);

        
        
    }
}
