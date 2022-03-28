package br.ufrpe.p2.questao03;

import java.time.LocalDateTime;

public interface Transaction {
    LocalDateTime getDate();
    String getType();
    String getDescription();
    double calculateTotal();
}
