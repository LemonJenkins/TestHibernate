
import javax.persistence.*;

import java.io.Serializable;
import java.util.Set;
import java.util.StringTokenizer;

@Entity
@Table
public class RegUser implements Serializable, toString {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String name;

    @Column
    private String nickName;


    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "pass")
    private Pass pass;

    public RegUser() {
    }

    public Pass getPass() {
        return pass;
    }

    public void setPass(Pass pass) {
        this.pass = pass;
    }

    public String getName() {
        return name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String toStrint() {
        return new String("----" + this.id + "---" + this.name + "---" + this.nickName);
    }

}
