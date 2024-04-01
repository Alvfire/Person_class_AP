public class Admin extends Person2{

    private myDOB hiringDate;
    private String AdminID;

    Admin(){
        this.firstName ="";
        this.lastName = "";
        this.dob = new myDOB(1,2,2024);
    }
    Admin(String _firstName){
        this.firstName = _firstName;
        this.lastName = "";
        this.dob = new myDOB(1,2,2024);
    }
    Admin(String _firstName,String _lastName){
        this.firstName = _firstName;
        this.lastName = _lastName;
        this.dob = new myDOB(1,2,2024);
    }
    Admin(String _firstName, String _lastName, myDOB _dob){
        this.firstName = _firstName;
        this.lastName = _lastName;
        this.dob = new myDOB(_dob);
        //this.dob = _dob.clone();
    }
    public void setAdminID(String _AdminID){
        this.AdminID = _AdminID;
    }
    public String getAdminID(){
        return this.AdminID;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

