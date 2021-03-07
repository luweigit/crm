package wei.lu.crm.base.constans;


//枚举，定义需要返回的异常消息
public enum CrmEnum {
    LOGIN_ACCOUNT("001-001","用户名或密码错误"),
    LOGIN_EXPIRE("001-002","账户失效"),
    LOGIN_LOCKED("001-003","账户被锁定"),
    LOGIN_ALLOWEDIP("001-004","不允许登陆的IP"),
    LOGIN_LOGINPWD("001-005","原始密码不正确");

    private String code;
    private String message;

    CrmEnum(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode(){
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
