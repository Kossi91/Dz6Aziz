package com.company;

public class Sceleton extends Boss{
   private int numberOfArrows;

    public int getNumberOfArrows() {
        return numberOfArrows;

    }

    public void setNumberOfArrows(int numberOfArrows) {
        this.numberOfArrows = numberOfArrows;
    }

    public String ptintInfo() {
        return super.info() + " " + getNumberOfArrows();
    }
}
