package net.example.search_functionality.model;
import javax.persistence.*;
@Entity
@Table(name = "users")
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String address_line1;
    private String address_line2;
    private String designation;
    private String full_name;
    private String phone_no;
    private String qualification;

    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddress_line1() {
        return address_line1;
    }

    public void setAddress_line1(String address_line1) {
        this.address_line1 = address_line1;
    }

    public String getAddress_line2() {
        return address_line2;
    }

    public void setAddress_line2(String address_line2) {
        this.address_line2 = address_line2;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getPhone_no() {
        return phone_no;
    }

    public void setPhone_no(String phone_no) {
        this.phone_no = phone_no;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public Users( String address_line1, String address_line2, String designation, String full_name, String phone_no, String qualification) {
        super();
        this.address_line1 = address_line1;
        this.address_line2 = address_line2;
        this.full_name = full_name;
        this.designation = designation;
        this.phone_no = phone_no;
        this.qualification = qualification;
    }

    public Users(){
    }


    @Override
    public String toString() {
        return "Users{" +
                ", address_line1='" + address_line1 + '\'' +
                ", address_line2='" + address_line2 + '\'' +
                ", designation='" + designation + '\'' +
                "full_name='" + full_name + '\'' +
                ", phone_no='" + phone_no + '\'' +
                ", qualification='" + qualification + '\'' +
                '}';
    }
}

