import java.util.Date;

public class Employee {
    String fullName;
    Date dateOfBirth;
    Date contractStartDate;
    float salary;
    int gradYear;
    Team team;

    public String getFullName(){
        return fullName;
    }
    public void setFullName(){
        this.fullName = fullName;
    }
    public Date getDateOfBirth(){
        return dateOfBirth;
    }
    public void setDateOfBirth(){
        this.dateOfBirth = dateOfBirth;
    }
    public Date getContractStartDate(){
        return contractStartDate;
    }
    public void setContractStartDate(){
        this.contractStartDate = contractStartDate;
    }
    public float getSalary(){
        return salary;
    }
    public void setSalary(){
        this.salary = salary;
    }
    public int getGradYear(){
        return gradYear;
    }
    public void setGradYear(){
        this.gradYear = gradYear;
    }
    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }


}
