package wei.lu.crm.base.util;

import java.util.UUID;

public class UUIDutil {
    public static String getUUID(){
        //用于生成随机主键
        return UUID.randomUUID().toString().replace("-","");
    }
}
