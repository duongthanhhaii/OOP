package homework_w7;

public class MyDate {
    private int year, month, day;
    private String[] months = { "Jan", "Feb", "Mar", "Apr", "May","Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };
    private String[] days = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };
    private int[] daysInMonth = { 31,28,31,30,31,30,31,31,30,31,30,31 };

    public boolean isLeapYear (int year) {
        return (this.year % 4 == 0) && ( this.year % 100 !=0 || this.year %400 == 0);
    }

    public boolean isValidDate (int year, int month, int day) {
        if ( year < 1 || year > 9999) {
            return false;
        }

        if ( month < 1 || month > 12) {
            return false;
        }

        if ( isLeapYear(year) && month == 2 ) {
            return day <= 28;
        } else {
            return day <= daysInMonth [month-1];
        }

    }

    public int getDayOfWeek (int year, int month, int day) {
        int[] t = { 0, 3, 2, 5, 0, 3, 5, 1, 4, 6, 2, 4 };
        if (month < 3) {
            year -= 1;
        }
        return (year + year / 4 - year / 100 + year / 400 + t[month - 1] + day) % 7;
    }

    public MyDate (int year, int month, int day) {
        setDate(year,month,day);
    }

    public void setDate (int year, int month, int day) {
        try {
            if ( isValidDate(year,month, day)) {
                this.day = day;
                this.month = month;
                this.year = year;
            } else {
                throw new IllegalArgumentException();
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid Date");
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear (int year) {
        try {
            if ( this.year >=1 && this.year <=9999) {
                this.year = year;
            } else {
                throw new IllegalArgumentException();
            }
        } catch ( IllegalArgumentException e ) {
            System.out.println("Invalid year");
        }
    }

    public int getMonth() {
        return month;
    }

    public void setMonth( int month ) {
        try {
            if ( this.month >=1  && this.month <=12 ) {
                this.month = month;
            } else {
                throw new IllegalArgumentException();
            }
        } catch ( IllegalArgumentException e ) {
            System.out.println("Invalid month");
        }
    }

    public int getDay() {
        return day;
    }

    public void setDay (int day) {
        try {
            if ( isValidDate(year, month, day) ) {
                this.day = day;
            } else {
                throw new IllegalArgumentException();
            }
        } catch ( IllegalArgumentException e) {
            System.out.println("Invalid Date!");
        }
    }

    @Override
    public String toString() {
        return days[getDayOfWeek(getYear(),getMonth(),getDay())] + " " + getDay() + " " + months[getMonth() - 1] + " " + getYear();
    }

    public MyDate nextDay() {
        if ( isValidDate(year, month, day) ) {
            if (this.day == daysInMonth [this.month -1]) {
                if ( this.month == 12 ) {
                    this.day = 1;
                    this.month = 1;
                    this.year +=1;
                } else {
                    this.day = 1;
                    this.month +=1;
                }
            } else {
                this.day +=1;
            }
        }
        return this;
    }

    public MyDate nextYear() {
        if ( isValidDate(year,month,day) ) {
            if ( this.month == 2 ) {
                if ( isLeapYear(this.year) ) {
                    if ( this.day == 29 ) {
                        this.day = 28;
                        this.year += 1;
                    } else {
                        this.year +=1;
                    }
                } else {
                    this.year +=1;
                }
            } else {
                this.year +=1;
            }
        }
        return this;
    }

}

