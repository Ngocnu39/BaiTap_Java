package bt1_7;

public class Date {

        private int day;   // Ngày
        private int month; // Tháng
        private int year;  // Năm

        // Constructor
        public Date(int day, int month, int year) {
            if (!isValidDate(day, month, year)) {
                throw new IllegalArgumentException("Invalid date");
            }
            this.day = day;
            this.month = month;
            this.year = year;
        }

        // Getter cho ngày
        public int getDay() {
            return day;
        }

        // Getter cho tháng
        public int getMonth() {
            return month;
        }

        // Getter cho năm
        public int getYear() {
            return year;
        }

        // Phương thức kiểm tra tính hợp lệ của ngày
        private boolean isValidDate(int day, int month, int year) {
            if (year < 1 || month < 1 || month > 12 || day < 1) {
                return false;
            }

            // Số ngày tối đa trong mỗi tháng
            int[] daysInMonth = {31, isLeapYear(year) ? 29 : 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
            return day <= daysInMonth[month - 1];
        }

        // Phương thức kiểm tra năm nhuận
        private boolean isLeapYear(int year) {
            return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        }

        // Phương thức toString để in thông tin ngày
        @Override
        public String toString() {
            return String.format("%02d/%02d/%04d", day, month, year);
        }
    }

