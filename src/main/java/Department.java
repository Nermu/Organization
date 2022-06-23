import java.util.ArrayList;
import java.util.List;

public class Department {
   String deptName;
   List<Team> teams;

   public String getDeptName() {
      return deptName;
   }

   public void setDeptName(String deptName) {
      this.deptName = deptName;
   }

   public List<Team> getTeams() {
      return teams;
   }

   public void setTeams(List<Team> teams) {
      this.teams = teams;
   }

   public Department() {
     this.teams = new ArrayList<>();
   }
}
