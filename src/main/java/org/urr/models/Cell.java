package org.urr.models;

import org.urr.enums.Status;

import java.util.ArrayList;

public class Cell {
    ArrayList<Cell> near;
    Status status;

    public Cell() {
        status = Status.NONE;
        near = new ArrayList<>();

    }

    public void addNear(Cell cell) {
        near.add(cell);
    }

    public void step1() {
        int around = countNearCells();
        status = status.step1(around);
    }

    public void step2() {
        status = status.step2();
    }

    int countNearCells() {
        int count = 0;
        for (Cell cell : near)
            if (cell.status.isLive())
                count++;
        return count;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public void turn() {
        for (Cell cell : near) {
            cell.status = cell.status.isLive() ? Status.NONE : Status.LIVE;
        }
    }

}
