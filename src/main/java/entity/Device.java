package entity;

public class Device {
    int id;
    String dev_serial;
    String password;
    int user_id;
    int inuse;
    int used;
    String memo;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDev_serial() {
        return dev_serial;
    }

    public void setDev_serial(String dev_serial) {
        this.dev_serial = dev_serial;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getInuse() {
        return inuse;
    }

    public void setInuse(int inuse) {
        this.inuse = inuse;
    }

    public int getUsed() {
        return used;
    }

    public void setUsed(int used) {
        this.used = used;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    @Override
    public String toString() {
        return "device{" +
                "id=" + id +
                ", dev_serial='" + dev_serial + '\'' +
                ", password='" + password + '\'' +
                ", user_id=" + user_id +
                ", inuse=" + inuse +
                ", used=" + used +
                ", memo='" + memo + '\'' +
                '}';
    }
}
