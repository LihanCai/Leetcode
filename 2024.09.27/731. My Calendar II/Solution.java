class MyCalendarTwo {
    List<int[]> intersection;
    List<int[]> events;

    public MyCalendarTwo() {
        events = new ArrayList<>();
        intersection = new ArrayList<>();
    }

    public boolean book(int start, int end) {
        for (int[] b : intersection) {
            // condition to check for the overlaping
            if (start < b[1] && end > b[0])
                return false;
        }

        for (int[] b : events) {
            if (start < b[1] && end > b[0]) {
                intersection.add(new int[] { Math.max(start, b[0]), Math.min(end, b[1]) });
            }
        }
        events.add(new int[] { start, end });
        return true;
    }
}

/**
 * Your MyCalendarTwo object will be instantiated and called as such:
 * MyCalendarTwo obj = new MyCalendarTwo();
 * boolean param_1 = obj.book(start,end);
 */