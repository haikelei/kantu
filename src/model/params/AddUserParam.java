package model.params;

public class AddUserParam {

    /**
     * deviceId :
     * vipType :
     */

    private String deviceId;
    private int vipType;//几个月

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public int getVipType() {
        return vipType;
    }

    public void setVipType(int vipType) {
        this.vipType = vipType;
    }
}
