package bhz.entity;

/**
 * @author wangjun
 * @date 2018/11/22
 */
public class School {

    private Integer Id;

    private String schoolName;

    private String code;

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
