package codingpractice.LowLevelDesign.PracticeQuestions.DesignBookMyShow;

import codingpractice.LowLevelDesign.PracticeQuestions.DesignBookMyShow.Enum.SeatCategory;

public class Seat {
    private int seatId;
    private SeatCategory seatCategory;

    public int getSeatId() {
        return seatId;
    }

    public void setSeatId(int seatId) {
        this.seatId = seatId;
    }

    public SeatCategory getSeatCategory() {
        return seatCategory;
    }

    public void setSeatCategory(SeatCategory seatCategory) {
        this.seatCategory = seatCategory;
    }
}
