package com.codecool.thao.clothingindustry;

import com.codecool.thao.clothingindustry.tailor.Tailor;

import java.util.ArrayList;
import java.util.List;

public class Industry implements TailorCounter {
    public static final int NUM_OF_DAYS = 20;
    private List<Tailor> tailors = new ArrayList<>();

    public void hireTailor(Tailor tailor) {
        tailors.add(tailor);
    }

    public void simulateOneWorkDay() {
        for (Tailor tailor : tailors) {
            if (tailor.isRich()) {
                tailor.dailyIncome();
                tailor.doNext();
                tailor.checkIncome();
                System.out.println(tailor);
            }
        }
        System.out.println();
    }

    public void simulateWorkDays() {
        for (int i = 0; i < NUM_OF_DAYS; i++) {
            simulateOneWorkDay();
        }
    }

    @Override
    public int getNumOfTailors() {
        return tailors.size();
    }

    public void getTheRichest() {
        int maxIncome = 0;
        String richestPerson = "";

        for (Tailor tailor : tailors) {
            if (tailor.getIncome() > maxIncome) {
                maxIncome = tailor.getIncome();
                richestPerson = tailor.getName();
            }
        }

        System.out.println(
                "The richest person is: " + richestPerson
                        + " with the income of: " + maxIncome
        );
    }
}
