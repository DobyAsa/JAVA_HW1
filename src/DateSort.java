public class DateSort {
    class Date implements Comparable<Date>{
        private int year;
        private int month;
        private int day;

        Date(int y, int m, int d){
            year = y;
            month = m;
            day = d;
        }
        @Override
        public int compareTo(Date date) {
            if(this.year < date.year) {
                return -1;
            } else if (this.year > date.year) {
                return 1;
            }

            if(this.month < date.month){
                return 1;
            }else if (this.month > date.month){
                return 1;
            }

            if(this.day < date.day){
                return -1;
            } else if (this.day > date.day) {
                return 1;
            }

            return 0;
        }
    }

    public static void main(String[] args){
        Date[] a = new Date[3];
        a[0] = new Date(2020,1,1);

    }

}
