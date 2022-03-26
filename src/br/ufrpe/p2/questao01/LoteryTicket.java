package br.ufrpe.p2.questao01;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

public class LoteryTicket {
    public ArrayList<Integer> numbers = new ArrayList<Integer>();

    private ArrayList<Integer> buildTicket(int ticketSize) {
        Random random = new Random();
        ArrayList<Integer> internalNumbers = new ArrayList<Integer>();
        while(internalNumbers.size() < ticketSize) {
            int selected = random.nextInt(1, 61);
            if(!internalNumbers.contains(selected)) {
                internalNumbers.add(selected);
            }
        }
        internalNumbers.sort(Comparator.naturalOrder());
        return internalNumbers;
    }

    public LoteryTicket(int ticketSize) {
        this.numbers = buildTicket(ticketSize);
    }

    public int amountNumbers(LoteryTicket ticketToCompare) {
        int result = 0;
        for(int i = 0; i < ticketToCompare.numbers.size(); i++) {
            if(this.numbers.contains(ticketToCompare.numbers.get(i))) {
                result++;
            }
        }
        return result;
    }

    public String toString() {
        return this.numbers.toString();
    }
}
