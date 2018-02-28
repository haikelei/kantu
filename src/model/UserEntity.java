package model;

import javax.persistence.*;

@Entity
@Table(name = "user", schema = "xianliao", catalog = "")
public class UserEntity {
    private int uid;
    private String token;
    private Integer lastTime;
    private String vipLevel;
    private Integer vipBuytime;
    private Integer vipDeadline;
    private String nickName;
    private String avatar;

    @Id
    @Column(name = "uid")
    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    @Basic
    @Column(name = "token")
    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    @Basic
    @Column(name = "last_time")
    public Integer getLastTime() {
        return lastTime;
    }

    public void setLastTime(Integer lastTime) {
        this.lastTime = lastTime;
    }

    @Basic
    @Column(name = "vip_level")
    public String getVipLevel() {
        return vipLevel;
    }

    public void setVipLevel(String vipLevel) {
        this.vipLevel = vipLevel;
    }

    @Basic
    @Column(name = "vip_buytime")
    public Integer getVipBuytime() {
        return vipBuytime;
    }

    public void setVipBuytime(Integer vipBuytime) {
        this.vipBuytime = vipBuytime;
    }

    @Basic
    @Column(name = "vip_deadline")
    public Integer getVipDeadline() {
        return vipDeadline;
    }

    public void setVipDeadline(Integer vipDeadline) {
        this.vipDeadline = vipDeadline;
    }

    @Basic
    @Column(name = "nick_name")
    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    @Basic
    @Column(name = "avatar")
    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserEntity that = (UserEntity) o;

        if (uid != that.uid) return false;
        if (token != null ? !token.equals(that.token) : that.token != null) return false;
        if (lastTime != null ? !lastTime.equals(that.lastTime) : that.lastTime != null) return false;
        if (vipLevel != null ? !vipLevel.equals(that.vipLevel) : that.vipLevel != null) return false;
        if (vipBuytime != null ? !vipBuytime.equals(that.vipBuytime) : that.vipBuytime != null) return false;
        if (vipDeadline != null ? !vipDeadline.equals(that.vipDeadline) : that.vipDeadline != null) return false;
        if (nickName != null ? !nickName.equals(that.nickName) : that.nickName != null) return false;
        if (avatar != null ? !avatar.equals(that.avatar) : that.avatar != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = uid;
        result = 31 * result + (token != null ? token.hashCode() : 0);
        result = 31 * result + (lastTime != null ? lastTime.hashCode() : 0);
        result = 31 * result + (vipLevel != null ? vipLevel.hashCode() : 0);
        result = 31 * result + (vipBuytime != null ? vipBuytime.hashCode() : 0);
        result = 31 * result + (vipDeadline != null ? vipDeadline.hashCode() : 0);
        result = 31 * result + (nickName != null ? nickName.hashCode() : 0);
        result = 31 * result + (avatar != null ? avatar.hashCode() : 0);
        return result;
    }
}
