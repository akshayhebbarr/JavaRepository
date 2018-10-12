class EmployeeCount
{
   private int numOfEmployees;
   public void setNoOfEmployees (int count)
   {
       numOfEmployees = count;
   }
   public double getNoOfEmployees () 
   {
       return numOfEmployees;
   }
}
public class Encap
{
   public static void main(String args[])
   {
      EmployeeCount obj = new EmployeeCount ();
      obj.setNoOfEmployees(577);
      System.out.println("No Of Employees: "+(int)obj.getNoOfEmployees());
    }
}