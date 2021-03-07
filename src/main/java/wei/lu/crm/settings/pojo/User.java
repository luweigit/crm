package wei.lu.crm.settings.pojo;


import lombok.Data;
import tk.mybatis.mapper.annotation.NameStyle;
import tk.mybatis.mapper.code.Style;

import javax.persistence.Id;
import javax.persistence.Table;

//@data 是 lombok 中自动生成getter和setter的注解
@Data
//@Table 是tk.mapper自动生成sql语句的注解 ，属性name是数据库中对应的表名
@Table(name = "tbl_user")
//@NameStyle 表示查询时使用该实体类中的属性名进行查找
@NameStyle(Style.normal)
public class User {

    @Id
    private String id;
    private String loginAct;
    private String name;
    private String loginPwd;
    private String email;
    private String expireTime;
    private String lockState;
    private String deptno;
    private String allowIps;
    private String createTime;
    private String createBy;
    private String editTime;
    private String editBy;
}