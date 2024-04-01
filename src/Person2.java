public class Person2 {
    protected String firstName;
    protected String lastName;
    protected myDOB dob;
    Person2(){
        this.firstName="";
        this.lastName ="";
        this.dob = new myDOB(1,1,1);
    }

    @Override
    public String toString() {
        return "ID{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", Hiring Date=" + dob.toString() +
                '}';
    }
}
