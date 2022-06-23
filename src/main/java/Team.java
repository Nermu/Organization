import java.util.ArrayList;
import java.util.List;

public class Team {
    String teamName;
    List<Employee> employees;
    Employee teamLead;



    public String getTeamName(){
        return teamName;
    }
    public void setTeamName(){
        this.teamName = teamName;
    }

    public List<Employee> getEmployees(){
        return employees;
    }
    public void setEmployees(){
        this.employees = employees;
    }
    public Employee getTeamLead() {
        return teamLead;
    }

    public void setTeamLead(Employee teamLead) {
        this.teamLead = teamLead;
    }

    public Team(){
        this.employees = new ArrayList<Employee>();
    }
}
