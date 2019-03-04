package com.codecool.thao.clothingindustry.tailor;

import com.codecool.thao.clothingindustry.TailorCounter;

public class Greedy extends Tailor {

    public Greedy(String name, TailorCounter tailorCounter) {
        super(name, tailorCounter);
    }

    @Override
    public void doNext() {
        checkMoney();
    }

    public void checkMoney() {
        if (this.income > COST_OF_MACHINE && this.numOfMachines < maxNumOfMachines) {
            buyMachine();
        }
    }

    public void buyMachine() {
        this.numOfMachines += 1;
        this.income -= 18;
    }
}
