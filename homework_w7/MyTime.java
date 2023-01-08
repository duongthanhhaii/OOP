package homework_w7;

public class MyTime {
    private int hour, minute, second;

    public MyTime() {
        hour = 0;
        minute = 0;
        second = 0;
    }

    public MyTime (int hour, int minute, int second) {
        setTime(hour,minute,second);
    }

    public void setTime (int hour, int minute, int second) {
        setHour(hour);
        setMinute(minute);
        setSecond(second);
    }

    public int getHour() {
        return hour;
    }

    public void setHour (int hour) {
        try {
            if (hour >=0 && hour <=23) {
                this.hour = hour;
            } else {
                throw new IllegalArgumentException ("Invalid hour");
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid hour");
        }
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        try {
            if ( minute>=0 && minute <=59) {
                this.minute = minute;
            } else  {
                throw new IllegalArgumentException("Invalid minute");
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid minute");
        }
    }

    public int getSecond() {
        return second;
    }

    public void setSecond( int second) {
        try {
            if (second >= 0 && second <= 59) {
                this.second = second;
            } else {
                throw new IllegalArgumentException("Invalid second");
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid minute");
        }
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", hour, minute,second);
    }

    public MyTime nextSecond() {
        if (this.second <= 58) {
            this.second += 1;
        } else if (this.minute <= 58 && this.second == 59) {
            this.minute += 1;
            this.second = 0;
        } else if (this.hour <= 22 && this.minute == 59 && this.second == 59) {
            this.hour +=1;
            this.minute = 0;
            this.second = 0;
        } else {
            this.hour = 0;
            this.minute = 0;
            this.second = 0;
        }

        return this;
    }

    public MyTime nextMinute() {
        if ( this.minute <= 58) {
            this.minute += 1;
        } else if ( this.hour <=22 && this.minute == 59) {
            this.hour +=1;
            this.minute = 0;
        } else {
            this.hour = 0;
            this.minute = 0;
        }
        return this;
    }

    public MyTime nextHour () {
        if ( this.hour <= 22 ) {
            this.hour +=1;
        } else {
            this.hour = 0;
        }

        return this;
    }

    public MyTime previousSecond() {
        if ( this.second > 0 ) {
            this.second -=1;
        } else if (this.minute >0 && this.second == 0) {
            this.minute -=1;
            this.second = 59;
        } else if (this.hour > 0 && this.minute == 0 && this.second == 0) {
            this.hour -=1;
            this.minute = 59;
            this.second = 59;
        } else {
            this.hour = 23;
            this.minute = 59;
            this.second = 59;
        }

        return this;
    }

    public MyTime previousMinute() {
        if ( this.minute > 0) {
            this.minute -= 1;
        } else if ( this.hour > 0 && this.minute == 0) {
            this.hour -=1;
            this.minute = 59;
        } else {
            this.hour = 23;
            this.minute = 59;
        }
        return this;
    }

    public MyTime previousHour () {
        if ( this.hour > 0 ) {
            this.hour -=1;
        } else {
            this.hour = 23;
        }

        return this;
    }


}
