package com.codecool.thao.clothingindustry.tailor;

import com.codecool.thao.clothingindustry.TailorCounter;

public class Thrifty extends Tailor {

    public Thrifty(String name, TailorCounter tailorCounter) {
        super(name, tailorCounter);
    }

    @Override
    public void doNext() {
        checkMoney();
    }

    public void checkMoney() {
        if (this.numOfMachines < 3
                && this.income > COST_OF_MACHINE
                && this.getOneMachineDailyProduction() > numOfMachines * COST_OF_MACHINE) {
            buyMachine();
        } else if (this.numOfMachines > 1
                && (this.income < 0
                || this.getOneMachineDailyProduction() < numOfMachines * COST_OF_MACHINE)) {
            sellMachine();
        }
    }

    private void sellMachine() {
        this.numOfMachines -= 1;
        this.income += 18;
    }

    private void buyMachine() {
        this.numOfMachines += 1;
        this.income -= 18;
    }
}
