public class Contact {
    private long phoneNo;
    private String name;

    public Contact(long phoneNo, String name) {
        this.phoneNo = phoneNo;
        this.name = name;
    }

    public long getPhoneNo() {
        return phoneNo;
    }

    public String getName() {
        return name;
    }

    public void setPhoneNo(long phoneNo) {
        this.phoneNo = phoneNo;
    }

    public void setName(String name) {
        this.name = name;
    }
}
