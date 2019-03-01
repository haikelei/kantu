package model;

import javax.persistence.*;

@Entity
@Table(name = "user", schema = "xianliao", catalog = "")
public class UserEntity {
    private int uid;
    private String vipBuytime;
    private String vipDeadline;
    private String nickName;
    private String avatar;
    private String deviceId;

    @Id
    @Column(name = "uid")
    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    @Basic
    @Column(name = "vip_buytime")
    public String getVipBuytime() {
        return vipBuytime;
    }

    public void setVipBuytime(String vipBuytime) {
        this.vipBuytime = vipBuytime;
    }

    @Basic
    @Column(name = "vip_deadline")
    public String getVipDeadline() {
        return vipDeadline;
    }

    public void setVipDeadline(String vipDeadline) {
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

    @Basic
    @Column(name = "deviceId")
    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserEntity entity = (UserEntity) o;

        if (uid != entity.uid) return false;
        if (vipBuytime != null ? !vipBuytime.equals(entity.vipBuytime) : entity.vipBuytime != null) return false;
        if (vipDeadline != null ? !vipDeadline.equals(entity.vipDeadline) : entity.vipDeadline != null) return false;
        if (nickName != null ? !nickName.equals(entity.nickName) : entity.nickName != null) return false;
        if (avatar != null ? !avatar.equals(entity.avatar) : entity.avatar != null) return false;
        if (deviceId != null ? !deviceId.equals(entity.deviceId) : entity.deviceId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = uid;
        result = 31 * result + (vipBuytime != null ? vipBuytime.hashCode() : 0);
        result = 31 * result + (vipDeadline != null ? vipDeadline.hashCode() : 0);
        result = 31 * result + (nickName != null ? nickName.hashCode() : 0);
        result = 31 * result + (avatar != null ? avatar.hashCode() : 0);
        result = 31 * result + (deviceId != null ? deviceId.hashCode() : 0);
        return result;
    }
}
