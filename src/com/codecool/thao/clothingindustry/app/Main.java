package com.codecool.thao.clothingindustry.app;

import com.codecool.thao.clothingindustry.Industry;
import com.codecool.thao.clothingindustry.tailor.Greedy;
import com.codecool.thao.clothingindustry.tailor.Simple;
import com.codecool.thao.clothingindustry.tailor.Thrifty;

public class Main {
    public static void main(String[] args) {
        Industry industry = new Industry();

        industry.hireTailor(new Thrifty("Szamito", industry));
        industry.hireTailor(new Greedy("Torekvo", industry));
        industry.hireTailor(new Simple("Szereny", industry));
        industry.hireTailor(new Thrifty("Okos", industry));

        industry.simulateWorkDays();

        industry.getTheRichest();
    }
}
