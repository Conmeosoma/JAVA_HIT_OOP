// CodeByConMeoSoMa
// /\_/\  
//( o.o ) 
// > ^ <
package tx2_ontap2;

import java.io.*;
import java.util.*;

public class EmployeeManager {
    

    private List<Employee> list = new ArrayList<>();

    public boolean addEmployee(Employee e) {
        return list.add(e);
    }

    public boolean saveEmployeeToFile(Object obj) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("employee.dat"))) {
            oos.writeObject(obj);
            return true;
        } catch (IOException e) {
            return false;
        }
    }

    @SuppressWarnings("unchecked")
    public boolean readEmployeeFromFile(String s) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(s))) {
            list = (List<Employee>) ois.readObject();
            for (Employee emp : list) {
                emp.printData();
            }
            return true;
        } catch (IOException | ClassNotFoundException e) {
            return false;
        }
    }

    public boolean delEmployee(Employee e) {
        return list.remove(e);
    }

    public List<Employee> searchEmployee(String name) {
        List<Employee> result = new ArrayList<>();
        for (Employee e : list) {
            if (e.getName().equalsIgnoreCase(name)) {
                result.add(e);
            }
        }
        return result;
    }

    public List<Employee> getList() {
        return list;
    }
    public Employee findById(String id) {
    for (Employee e : employees) {
        if (e.getId().equalsIgnoreCase(id)) {
            return e;
        }
    }
    return null; // Không tìm thấy
}
    
}
