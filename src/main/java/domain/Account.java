package domain;



import java.io.Serializable;
import java.sql.Timestamp;

public class Account implements Serializable{

    private Integer id;


    private Integer number;
    private String pwd;
    private Double money;
    private Byte status;
    private Timestamp time;

    public Account() {
    }

    public Account(Integer number, String pwd, Double money, Byte status, Timestamp time) {
        this.number = number;
        this.pwd = pwd;
        this.money = money;
        this.status = status;
        this.time = time;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Timestamp getTime() {
        return time;
    }

    public void setTime(Timestamp time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", number='" + number + '\'' +
                ", pwd='" + pwd + '\'' +
                ", money=" + money +
                ", status=" + status +
                ", time=" + time +
                '}';
    }
}
