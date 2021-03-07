package wei.lu.crm.base.exception;

import wei.lu.crm.base.constans.CrmEnum;

public class CrmException extends RuntimeException {
    //定义 异常返回在枚举 CrmEnum中定义的异常信息
    public CrmException(CrmEnum crmEnum) {
            super(crmEnum.getMessage());
    }
}
