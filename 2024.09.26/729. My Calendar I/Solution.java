class MyCalendar {
    List<int[]> events;

    // initialization
    public MyCalendar() {
        events = new ArrayList<>();
    }

    // if there is a conflict, return false
    // otherwise, add event
    public boolean book(int start, int end) {
        for (int i = 0; i < events.size(); i++) {
            if (start >= events.get(i)[1] || end <= events.get(i)[0]) {
                continue;
            } else {
                return false;
            }
        }
        events.add(new int[] { start, end });
        return true;
    }
}

/**
 * Your MyCalendar object will be instantiated and called as such:
 * MyCalendar obj = new MyCalendar();
 * boolean param_1 = obj.book(start,end);
 */