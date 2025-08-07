// CodeByConMeoSoMa
// /\_/\  
//( o.o ) 
// > ^ <
package tx2_ontap2;

import java.util.List;

public interface IEmployeeManager {

    public boolean addEmployee(Employee t);

    public boolean saveEmployeeToFile(Object t);

    public boolean readEmployeeFromFile(String s);

    public boolean delEmployee(Employee t);

    public List<Employee> searchEmployee(String name);
}
