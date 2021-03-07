package wei.lu.crm.base.util;


import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/*
    使用MD5对密码进行加密
* */
public class MD5util {

    public static String getMD5(String password){
        try {
            //得到一个信息摘要器
            MessageDigest digest = MessageDigest.getInstance("md5");
            byte[] result = digest.digest(password.getBytes());
            StringBuffer buffer = new StringBuffer();
            //每个byte做一个与运算
            for (byte b : result) {
                //与运算
                int number = b & 0xff;
                String str =Integer.toHexString(number);
                if(str.length() == 1){
                    buffer.append("0");
                }
                buffer.append(str);
            }

            return buffer.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return "";
        }
    }
}
