package edu.kis.powp.jobs2d.drivers.adapter;

import edu.kis.powp.jobs2d.AbstractDriver;
import edu.kis.powp.jobs2d.Job2dDriver;

public class Job2dDriverAbstractDriverAdapter extends AbstractDriver {
    private final Job2dDriver driverAdapter;

    public Job2dDriverAbstractDriverAdapter(Job2dDriver job2dDriver){
        super(0, 0);
        this.driverAdapter = job2dDriver;
    }

    @Override
    public void operateTo(int x, int y) {
        driverAdapter.setPosition(getX(), getY());
        driverAdapter.operateTo(x, y);
        setPosition(x, y);
    }
}
