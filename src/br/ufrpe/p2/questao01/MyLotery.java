package br.ufrpe.p2.questao01;

import java.util.ArrayList;

public class MyLotery {
    LoteryTicket winningTicket = new LoteryTicket(6);

    public void runLotery() {
        ArrayList<String> messagesToPrint = new ArrayList<String>();
        for(int i = 6; i <= 15; i++){
            //ArrayList<LoteryTicket> tickets = new ArrayList<LoteryTicket>();
            Boolean containsMega = false;
            int amountOfGamesToMega = 0;

            int numberOfQuadras = 0;
            int numberOfQuinas = 0;
            do {
                LoteryTicket sortedTicket = new LoteryTicket(i);
                int amountOfNumbersEqual = winningTicket.amountNumbers(sortedTicket);
                if(amountOfNumbersEqual == 4){
                    numberOfQuadras++;
                } else if (amountOfNumbersEqual == 5){
                    numberOfQuinas++;
                }
                amountOfGamesToMega++;
                containsMega = amountOfNumbersEqual == 6;
                if(containsMega) {
                    System.out.println("PARABÉNS VOCÊ GANHOU NA MEGASENA DEPOIS DE " + amountOfGamesToMega + " TENTATIVAS DE JOGO");
                } else {
                    System.out.println("Sorteio de número " + amountOfGamesToMega + " realizado. O bilhete sorteado " + sortedTicket + " NÃO CONTÉM todos os números do bilhete premiado " + winningTicket);
                }
            } while (!containsMega);
            messagesToPrint.add("Jogos de " + i + " números: você apostou " + amountOfGamesToMega + " para ganhar na mega-sena. Dentre esses jogos, você acertou " + numberOfQuadras + " quadras e " + numberOfQuinas + " quinas.");
        }
        for (String message : messagesToPrint) {
            System.out.println(message);
        }
    }

    public static void main(String[] args) throws Exception {
        MyLotery lotery = new MyLotery();
        lotery.runLotery();
    }
}
