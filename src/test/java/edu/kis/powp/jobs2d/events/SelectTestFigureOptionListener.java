package edu.kis.powp.jobs2d.events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.kis.powp.command.ComplexCommand;
import edu.kis.powp.command.DriverCommand;
import edu.kis.powp.command.OperateToCommand;
import edu.kis.powp.command.SetPositionCommand;
import edu.kis.powp.jobs2d.Figures;
import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.drivers.adapter.Job2dDriverAbstractDriverAdapter;
import edu.kis.powp.jobs2d.magicpresets.FiguresJane;
import edu.kis.powp.jobs2d.magicpresets.FiguresJoe;

public class SelectTestFigureOptionListener implements ActionListener {

    private DriverManager driverManager;

    public SelectTestFigureOptionListener(DriverManager driverManager) {
        this.driverManager = driverManager;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals(Figures.FIG1.getFigure())) {
            FiguresJoe.figureScript1(driverManager.getCurrentDriver());
        } else if (e.getActionCommand().equals(Figures.FIG2.getFigure())) {
            FiguresJoe.figureScript2(driverManager.getCurrentDriver());
        } else if (e.getActionCommand().equals(Figures.FIG3.getFigure())){
            FiguresJane.figureScript(new Job2dDriverAbstractDriverAdapter(driverManager.getCurrentDriver()));
        } else if (e.getActionCommand().equals(Figures.FIG4.getFigure())){
            DriverCommand driverCommand = new SetPositionCommand(0,0);
            DriverCommand driverCommand1 = new OperateToCommand(0,100);
            DriverCommand driverCommand2 = new OperateToCommand(100,100);
            DriverCommand driverCommand3 = new OperateToCommand(100,0);
            DriverCommand driverCommand4 = new OperateToCommand(0,0);

            driverCommand.execute(driverManager.getCurrentDriver());
            driverCommand1.execute(driverManager.getCurrentDriver());
            driverCommand2.execute(driverManager.getCurrentDriver());
            driverCommand3.execute(driverManager.getCurrentDriver());
            driverCommand4.execute(driverManager.getCurrentDriver());
        } else if (e.getActionCommand().equals(Figures.FIG5.getFigure())){
            ComplexCommand complexCommand = new ComplexCommand();
            complexCommand.addCommand(new SetPositionCommand(100,100));
            complexCommand.addCommand(new OperateToCommand(100,200));
            complexCommand.addCommand(new OperateToCommand(200,200));
            complexCommand.addCommand(new OperateToCommand(200,100));
            complexCommand.addCommand(new OperateToCommand(100,100));
            complexCommand.execute(driverManager.getCurrentDriver());
        } else if (e.getActionCommand().equals(Figures.FIG6.getFigure())){
            ComplexCommand complexCommand = new ComplexCommand();
            complexCommand.addCommand(new SetPositionCommand(0,0));
            complexCommand.addCommand(new OperateToCommand(120,120));
            complexCommand.addCommand(new OperateToCommand(240,0));
            complexCommand.addCommand(new OperateToCommand(0,0));
            complexCommand.execute(driverManager.getCurrentDriver());
        }
    }
}
