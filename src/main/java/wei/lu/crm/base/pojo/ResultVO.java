package wei.lu.crm.base.pojo;

import lombok.Data;

import java.util.List;

/*
*   1、用于给系统返回消息
*   2、给客户返回操作是否成功
*   3、给客户返回需要的结果集（json）
* */
@Data
public class ResultVO<T,V> {
    private boolean isOK;//返回操作是否成功信息，作为后续判断的依据
    private String mess;//返回提示信息

    private T t;
    private V v;
    private List<T> data;

}
