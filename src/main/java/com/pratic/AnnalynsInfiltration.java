package com.pratic;

class AnnalynsInfiltration {
    public static boolean canFastAttack(boolean knightIsAwake) {
        boolean canFastAttack =! knightIsAwake;
        return canFastAttack;
    }

    public static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake) {
        boolean canSpy = knightIsAwake || archerIsAwake || prisonerIsAwake;
        return canSpy;
    }

    public static boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake) {
        boolean canSignalPrisoner =! archerIsAwake && prisonerIsAwake;
        return canSignalPrisoner;
    }

    public static boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake, boolean petDogIsPresent) {
        boolean canFreePrisoner = (petDogIsPresent && !archerIsAwake) || (prisonerIsAwake && !petDogIsPresent && !knightIsAwake && !archerIsAwake);
        return canFreePrisoner;
    }
}