package org.statePattern;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PeacefulState implements State{

    private final Mammoth mammoth;

    public PeacefulState(Mammoth mammoth) {
        this.mammoth = mammoth;
    }

    @Override
    public void onEnterState() {
        log.info("{} calm down.",mammoth);
    }

    @Override
    public void observe() {
        log.info("{} is calm and peaceful.",mammoth);
    }
}
