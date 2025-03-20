package edu.kis.powp.command;

import edu.kis.powp.jobs2d.Job2dDriver;

public class OperateToCommand implements DriverCommand{
    private final Job2dDriver job2dDriver;
    int x, y;

    public OperateToCommand(int x, int y, Job2dDriver job2dDriver) {
        this.x = x;
        this.y = y;
        this.job2dDriver = job2dDriver;
    }

    @Override
    public void execute(){
        job2dDriver.operateTo(x, y);
    }

}
