package wei.lu.crm.base.util;

import java.text.SimpleDateFormat;
import java.util.Date;


//获取系统时间的工具类
public class DateTimeutil {
    public static String getSysTime(){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date();
        String time = sdf.format(date);
        return time;
    }
}
