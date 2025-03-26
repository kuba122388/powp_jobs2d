package edu.kis.powp.jobs2d;

public enum Figures {
    FIG1("Figure Joe 1"),
    FIG2("Figure Joe 2"),
    FIG3("Figures Jane"),
    FIG4("Custom Command"),
    FIG5("Square"),
    FIG6("Triangle");

    private final String figure;

    Figures(String figure){
        this.figure = figure;
    }

    public String getFigure(){
        return this.figure;
    }

}
