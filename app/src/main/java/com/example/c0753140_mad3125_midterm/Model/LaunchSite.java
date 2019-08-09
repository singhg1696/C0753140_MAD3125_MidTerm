package com.example.c0753140_mad3125_midterm.Model;

public class LaunchSite
{
    String site_id;
    String site_name;
    String site_name_long;

    public LaunchSite() {
    }

    public LaunchSite(String site_id, String site_name, String site_name_long) {
        this.site_id = site_id;
        this.site_name = site_name;
        this.site_name_long = site_name_long;
    }


    public String getSite_id() {
        return site_id;
    }

    public void setSite_id(String site_id) {
        this.site_id = site_id;
    }

    public String getSite_name() {
        return site_name;
    }

    public void setSite_name(String site_name) {
        this.site_name = site_name;
    }

    public String getSite_name_long() {
        return site_name_long;
    }

    public void setSite_name_long(String site_name_long) {
        this.site_name_long = site_name_long;
    }
    @Override
    public String toString() {
        return "LaunchSite{" +
                "site_id='" + site_id + '\'' +
                ", site_name='" + site_name + '\'' +
                ", site_name_long='" + site_name_long + '\'' +
                '}';
    }

}
