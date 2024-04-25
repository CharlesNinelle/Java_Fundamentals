package Les3.Oefening6.Oefening1;

public enum DayOfTheWeek1 {

        SUNDAY(0), MONDAY(1), TUESDAY(2), WEDNESDAY(3), THURSDAY(4), FRIDAY(5), SATURDAY(6);

        private final int index;

    DayOfTheWeek1(int index) {
            this.index = index;
        }

        public int getIndex() {
            return index;
        }
    }
