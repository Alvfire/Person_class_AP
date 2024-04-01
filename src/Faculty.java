public class Faculty extends Person2 {
    private myDOB hiringDate;
    private String facultyID;

    Faculty(){
        this.firstName ="";
        this.lastName = "";
        this.dob = new myDOB(12,1,2024);
    }
    Faculty(String _firstName){
        this.firstName = _firstName;
        this.lastName = "";
        this.dob = new myDOB(12,1,2024);
    }
    Faculty(String _firstName,String _lastName){
        this.firstName = _firstName;
        this.lastName = _lastName;
        this.dob = new myDOB(12,1,2024);
    }
    Faculty(String _firstName, String _lastName, myDOB _dob){
        this.firstName = _firstName;
        this.lastName = _lastName;
        this.dob = new myDOB(_dob);
        //this.dob = _dob.clone();
    }
    public void setFacultyID(String _facultyID){
        this.facultyID = _facultyID;
    }
    public String setFacultyID(){
        return this.facultyID;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}


