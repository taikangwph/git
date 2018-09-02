import java.io.Serializable;

/**
 * Created by wph on 2018/7/11.
 */
public class User implements Serializable{
    private String name;
    private Integer age;
    private String sex;
    private Integer age1;
    private Integer age2;
    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public String getSex() {
        return sex;
    }

    public User(String name, Integer age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
