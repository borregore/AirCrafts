package com.flyingMachines.service;

import com.flyingMachines.model.flyingArtifacts.FlyingMachine;
import com.flyingMachines.type.FlyingMachineType;

public class FlyinMachineFactory {

    public FlyingMachine createFlyingMachine(FlyingMachineType machineType) {
        switch (machineType) {
            case AIRPLANE:
                return createAirplane();
            case DRONE:
                return createDrone();
            case HELICOPTER:
                return createHelicopter();
            case JET:
                return createJet();
            case PLANE:
                return createPlane();
            case SPACE_ROCKET:
                return createSpaceRocket();
            default:
                return null;
        }
    }

    private FlyingMachine createSpaceRocket() {
        return null;
    }

    private FlyingMachine createPlane() {
        return null;
    }

    private FlyingMachine createJet() {
        return null;
    }

    private FlyingMachine createHelicopter() {
        return null;
    }

    private FlyingMachine createDrone() {
        return null;
    }

    private FlyingMachine createAirplane() {
        return null;
    }
}
