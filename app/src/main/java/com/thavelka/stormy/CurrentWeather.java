package com.thavelka.stormy;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

/**
 * Created by tim on 1/29/15.
 */
public class CurrentWeather {
    private String mIcon;
    private long mTime;
    private double mTemp;
    private double mHumidity;
    private double mPrecipChance;
    private String mSummary;
    private String mTimeZone;
    private String mBgColor;
    private String mLocation;
    private Double mLatitude;
    private Double mLongitude;

    public Double getLatitude() {
        return mLatitude;
    }

    public void setLatitude(Double latitude) {
        mLatitude = latitude;
    }

    public Double getLongitude() {
        return mLongitude;
    }

    public void setLongitude(Double longitude) {
        mLongitude = longitude;
    }

    public String getLocation() {
        return mLocation;
    }

    public void setLocation(String location) {
        mLocation = location;
    }

    public String getTimeZone() {
        return mTimeZone;
    }

    public void setTimeZone(String timeZone) {
        mTimeZone = timeZone;
    }

    public String getIcon() {
        return mIcon;
    }

    public int getIconId() {
        int iconId = R.drawable.clear_day;

        if (mIcon.equals("clear-day")) {
            iconId = R.drawable.clear_day;
            mBgColor = "#FF71D9FC";
        }
        else if (mIcon.equals("clear-night")) {
            iconId = R.drawable.clear_night;
            mBgColor = "#FF004D67";
        }
        else if (mIcon.equals("rain")) {
            iconId = R.drawable.rain;
            mBgColor = "#FF0088B5";
        }
        else if (mIcon.equals("snow")) {
            iconId = R.drawable.snow;
            mBgColor = "#FFC8D2D5";
        }
        else if (mIcon.equals("sleet")) {
            iconId = R.drawable.sleet;
            mBgColor = "#FF98C6D5";
        }
        else if (mIcon.equals("wind")) {
            iconId = R.drawable.wind;
            mBgColor = "#FF98C6D5";
        }
        else if (mIcon.equals("fog")) {
            iconId = R.drawable.fog;
            mBgColor = "#FF98C6D5";
        }
        else if (mIcon.equals("cloudy")) {
            iconId = R.drawable.cloudy;
            mBgColor= "#FF98C6D5";
        }
        else if (mIcon.equals("partly-cloudy-day")) {
            iconId = R.drawable.partly_cloudy;
            mBgColor = "#FF70BCD5";
        }
        else if (mIcon.equals("partly-cloudy-night")) {
            iconId = R.drawable.cloudy_night;
            mBgColor = "#FF363C3E";
        }

        return iconId;
    }

    public String getBgColor() {
        return mBgColor;
    }

    public void setIcon(String icon) {
        mIcon = icon;
    }

    public long getTime() {
        return mTime;
    }

    public String getFormattedTime() {
        SimpleDateFormat formatter = new SimpleDateFormat("h:mm a");
        formatter.setTimeZone(TimeZone.getTimeZone(getTimeZone()));
        Date dateTime = new Date(getTime() * 1000);
        return formatter.format(dateTime);
    }

    public void setTime(long time) {
        mTime = time;
    }

    public int getTemp() {
        return (int)Math.round(mTemp);
    }

    public void setTemp(double temp) {
        mTemp = temp;
    }

    public int getHumidity() {
        return (int)(mHumidity*100);
    }

    public void setHumidity(double humidity) {
        mHumidity = humidity;
    }

    public int getPrecipChance() {
        return (int)Math.round(mPrecipChance*100);
    }

    public void setPrecipChance(double precipChance) {
        mPrecipChance = precipChance;
    }

    public String getSummary() {
        return mSummary;
    }

    public void setSummary(String summary) {
        mSummary = summary;
    }
}
