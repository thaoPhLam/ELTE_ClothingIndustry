package com.codecool.thao.clothingindustry.tailor;

import com.codecool.thao.clothingindustry.TailorCounter;

public abstract class Tailor {
    protected static final int COST_OF_MACHINE = 6;
    protected int income = 0;
    protected int numOfMachines = 1;
    protected int maxNumOfMachines = 3;
    protected boolean rich = true;
    protected String name;

    private TailorCounter tailorCounter;

    public Tailor(String name, TailorCounter tailorCounter) {
        this.name = name;
        this.tailorCounter = tailorCounter;
    }

    public int getIncome() {
        return income;
    }

    public String getName() {
        return name;
    }

    public boolean isRich() {
        return rich;
    }

    public void checkIncome() {
        if (income <= 0) {
            goBroke();
        }
    }

    private void goBroke() {
        this.rich = false;
        this.numOfMachines -= this.numOfMachines;
        System.out.println(name + ": I AM BROKE!");
    }

    public int getOneMachineDailyProduction() {
        if (this.numOfMachines < tailorCounter.getNumOfTailors()) {
            payTen();
        } else if (this.numOfMachines >= 2 * tailorCounter.getNumOfTailors()) {
            payNothing();
        } else {
            payGenerally();
        }
        return income;
    }

    private void payTen() {
        this.income += 10;
    }

    private void payNothing() {
        this.income += 0;
    }

    private void payGenerally() {
        this.income += (10 * tailorCounter.getNumOfTailors() / this.numOfMachines);
    }

    public int getIncomeAfterOneMachineCost() {
        this.income -= numOfMachines*COST_OF_MACHINE;
        return income;
    }

    public void dailyIncome() {
        int dailyIncome = 0;
        for (int i = 0; i < numOfMachines; i++) {
            dailyIncome += (getOneMachineDailyProduction() - getIncomeAfterOneMachineCost());
        }
        this.income += dailyIncome;
    }

    public abstract void doNext();

    @Override
    public String toString() {
        return getClass().getSimpleName() + " {" +
                "name='" + name + '\'' +
                ", income=" + income +
                ", numOfMachines=" + numOfMachines +
                //", maxNumOfMachines=" + maxNumOfMachines +
                //", rich=" + rich +
                '}';
    }
}
