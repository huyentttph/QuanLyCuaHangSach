/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlchs.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Admin
 */
public class XDate {
    static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("dd/MM/yyyy");
    public static Date toDate(String date, String ... pattern){
        try {
            if (pattern.length>0) {
                DATE_FORMAT.applyPattern(pattern[0]);
            }
            if (date == null) {
                return XDate.now();
            }
            return DATE_FORMAT.parse(date);
        } catch (ParseException ex) {
            throw new RuntimeException(ex);
        }
    }
    public static String toString(Date date, String...pattern){
         if (pattern.length>0) {
                DATE_FORMAT.applyPattern(pattern[0]);
            }
            if (date == null) {
                date = XDate.now();
            }
            return DATE_FORMAT.format(date);
    }
    public static Date now(){
        return new Date();
    }
    public static Date addDays(Date date, int days){
        date.setTime(date.getTime() + days*24*60*60*1000);
        return date;
    }
    public static Date add(int days){
        Date now = XDate.now();
        now.setTime(now.getTime() + days*24*60*60*1000 );
        return now;
    }
        
}
