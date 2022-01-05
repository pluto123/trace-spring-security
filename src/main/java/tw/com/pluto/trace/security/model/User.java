package tw.com.pluto.trace.security.model;

import javax.persistence.*;

@Entity
@Table(name = "USER")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String userUuid;   // 用戶 UUID
    private String username;   // 用戶名稱
    private String password;   // 密碼
    private String email;      // 郵件
    private String telephone;  // 電話
    private String role;       // 角色
    private String image;      // 頭像
    private String lastIp;     // 上次登入 IP
    private String lastTime;   // 上次登入 時間

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserUuid() {
        return userUuid;
    }

    public void setUserUuid(String userUuid) {
        this.userUuid = userUuid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getLastIp() {
        return lastIp;
    }

    public void setLastIp(String lastIp) {
        this.lastIp = lastIp;
    }

    public String getLastTime() {
        return lastTime;
    }

    public void setLastTime(String lastTime) {
        this.lastTime = lastTime;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userUuid='" + userUuid + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", telephone='" + telephone + '\'' +
                ", role='" + role + '\'' +
                ", image='" + image + '\'' +
                ", lastIp='" + lastIp + '\'' +
                ", lastTime='" + lastTime + '\'' +
                '}';
    }
}
