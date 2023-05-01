class Address {
    private String address;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

class HomeAddress extends Address {
    @Override
    public String getAddress() {
        return "Home address: " + super.getAddress();
    }
}

class OfficeAddress extends Address {
    @Override
    public String getAddress() {
        return "Office address: " + super.getAddress();
    }
}

class SchoolAddress extends Address {
    @Override
    public String getAddress() {
        return "School address: " + super.getAddress();
    }
}

public class Address1 {
    public static void main(String[] args) {
        HomeAddress home = new HomeAddress();
        home.setAddress("123 Main St");
        System.out.println(home.getAddress());

        OfficeAddress office = new OfficeAddress();
        office.setAddress("456 Business Blvd");
        System.out.println(office.getAddress());

        SchoolAddress school = new SchoolAddress();
        school.setAddress("789 Education Ave");
        System.out.println(school.getAddress());
    }
}