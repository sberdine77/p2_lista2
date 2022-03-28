package br.ufrpe.p2.questao03;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CashFlow {
    private ArrayList<Transaction> transactions;
    private String enterpriseName;
    private String cnpj;

    public CashFlow(String enterpriseName, String cnpj){
        this.transactions = new ArrayList<Transaction>();
        this.enterpriseName = enterpriseName;
        this.cnpj = cnpj;
    }

    public String getEnterpriseName() {
        return enterpriseName;
    }

    public void setEnterpriseName(String enterpriseName) {
        this.enterpriseName = enterpriseName;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public ArrayList<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(ArrayList<Transaction> transactions) {
        this.transactions = transactions;
    }

    public void addTransaction(Transaction transaction) {
        this.transactions.add(transaction);
    }

    public double calculateExpenses(LocalDate start, LocalDate end){
        ArrayList<Transaction> expensesBeforeCast = this.transactions.stream().filter(transaction -> {
            if(transaction instanceof Expense && (transaction.getDate().toLocalDate().isEqual(start) || transaction.getDate().toLocalDate().isAfter(start)) && transaction.getDate().toLocalDate().isBefore(end)) {
                return true;
            } else {
                return false;
            }
        }).collect(Collectors.toCollection(ArrayList::new));
        double result = 0;

        for (Transaction transaction : expensesBeforeCast) {
            Expense expense = (Expense) transaction;
            result += expense.calculateTotal();
        }

        return result;
    }

    public double calculateIncome(LocalDate start, LocalDate end){
        ArrayList<Transaction> incomeBeforeCast = this.transactions.stream().filter(transaction -> {
            if(transaction instanceof Income && (transaction.getDate().toLocalDate().isEqual(start) || transaction.getDate().toLocalDate().isAfter(start)) && transaction.getDate().toLocalDate().isBefore(end)) {
                return true;
            } else {
                return false;
            }
        }).collect(Collectors.toCollection(ArrayList::new));
        double result = 0;

        for (Transaction transaction : incomeBeforeCast) {
            Income income = (Income) transaction;
            result += income.calculateTotal();
        }

        return result;
    }

    public double expensesPercentualInMonth(int month, int year){
        ArrayList<Transaction> expensesBeforeCast = this.transactions.stream().filter(transaction -> {
            if(transaction instanceof Expense && transaction.getDate().getMonthValue() == month && transaction.getDate().getYear() == year) {
                return true;
            } else {
                return false;
            }
        }).collect(Collectors.toCollection(ArrayList::new));

        ArrayList<Transaction> transactionsBeforeCast = this.transactions.stream().filter(transaction -> {
            if(transaction.getDate().getMonthValue() == month && transaction.getDate().getYear() == year) {
                return true;
            } else {
                return false;
            }
        }).collect(Collectors.toCollection(ArrayList::new));

        double result = 0;
        double expensesTotal = 0;
        double transactionsTotal = 0;

        for (Transaction transaction : expensesBeforeCast) {
            Expense expense = (Expense) transaction;
            expensesTotal += expense.calculateTotal();
        }

        for (Transaction transaction : transactionsBeforeCast) {
            transactionsTotal += transaction.calculateTotal();
        }

        result = ((expensesTotal * 100) / transactionsTotal);

        return result;
    }

    public double incomePercentualInMonth(int month, int year){
        ArrayList<Transaction> transactionsBeforeCast = this.transactions.stream().filter(transaction -> {
            if(transaction.getDate().getMonthValue() == month && transaction.getDate().getYear() == year) {
                return true;
            } else {
                return false;
            }
        }).collect(Collectors.toCollection(ArrayList::new));

        ArrayList<Transaction> incomeBeforeCast = this.transactions.stream().filter(transaction -> {
            if(transaction instanceof Income && transaction.getDate().getMonthValue() == month && transaction.getDate().getYear() == year) {
                return true;
            } else {
                return false;
            }
        }).collect(Collectors.toCollection(ArrayList::new));

        double result = 0;
        double incomeTotal = 0;
        double transactionsTotal = 0;

        for (Transaction transaction : incomeBeforeCast) {
            Income income = (Income) transaction;
            incomeTotal += income.calculateTotal();
        }

        for (Transaction transaction : transactionsBeforeCast) {
            transactionsTotal += transaction.calculateTotal();
        }

        result = ((incomeTotal * 100) / transactionsTotal);

        return result;
    }

    public double currentBalance() {
        ArrayList<Transaction> incomeBeforeCast = this.transactions.stream().filter(transaction -> {
            if(transaction instanceof Income) {
                return true;
            } else {
                return false;
            }
        }).collect(Collectors.toCollection(ArrayList::new));

        ArrayList<Transaction> expensesBeforeCast = this.transactions.stream().filter(transaction -> {
            if(transaction instanceof Expense) {
                return true;
            } else {
                return false;
            }
        }).collect(Collectors.toCollection(ArrayList::new));
    
        double result = 0;
        double expensesTotal = 0;
        double incomeTotal = 0;

        for (Transaction transaction : incomeBeforeCast) {
            Income income = (Income) transaction;
            incomeTotal += income.calculateTotal();
        }
        for (Transaction transaction : expensesBeforeCast) {
            Expense expense = (Expense) transaction;
            expensesTotal += expense.calculateTotal();
        }

        result = incomeTotal - expensesTotal;
        return result;
    }

    public List<Transaction> listTransactionsInMonth(int month, int year){
        List<Transaction> transactionsBeforeCast = this.transactions.stream().filter(transaction -> {
            if(transaction.getDate().getMonthValue() == month && transaction.getDate().getYear() == year) {
                return true;
            } else {
                return false;
            }
        }).toList();

        return transactionsBeforeCast;
    }
}
