package ru.netology.unit;

public class BonusService {
    public int calculateBonus(int amout) {
        if (amout <1000) {
            return 0;
        }


        int bonus = (amout - 1000) / 100;

        if (bonus > 100) {
            return 100;
        }

        return bonus;

    }
}