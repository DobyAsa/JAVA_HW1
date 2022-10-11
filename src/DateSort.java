public class DateSort {
    static class Date implements Comparable<Date>{
         int year;
         int month;
         int day;

        Date(int y, int m, int d){
            year = y;
            month = m;
            day = d;
        }

        @Override
        public String toString() {
            return ""+year+"-"+month+"-"+day;
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
        Date temp;
        Date[] dates = new Date[3];
        dates[0] = new Date(2002, 10, 22);
        dates[1] = new Date(2000, 1, 1);
        dates[2] = new Date(1999, 12, 31);

        for (int i = 1; i <= dates.length; i++) {
            for (int j = 0; j < dates.length - 1; j++) {
                if (dates[j].compareTo(dates[j + 1]) > 0) {
                    temp = dates[j + 1];
                    dates[j + 1] = dates[j];
                    dates[j] = temp;
                }
            }
        }

        for(Date date : dates){
            System.out.println(date);
        }

    }

}
