package com.example.guanghuili.checkers;

public class Checker {
    private int row;
    private int column;
    private boolean crownStatus;

    public Checker(int row, int column){
        this.row = row;
        this.column = column;
        this.crownStatus = false;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public boolean isCrownStatus() {
        return crownStatus;
    }

    public void setCrownStatus(boolean crownStatus) {
        this.crownStatus = crownStatus;
    }
}