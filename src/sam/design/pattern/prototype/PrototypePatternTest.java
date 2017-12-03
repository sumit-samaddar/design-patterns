package sam.design.pattern.prototype;

import java.util.List;

/*
 * 
 * It would be easy to understand prototype design pattern with an example. Suppose we have an Object that loads data 
 * from database. Now we need to modify this data in our program multiple times, so it�s not a good idea to create the 
 * Object using new keyword and load all the data again from database.The better approach would be to clone the existing 
 * object into a new object and then do the data manipulation.
 */


/**
 * @author sumit
 *
 */
public class PrototypePatternTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		Employees emps = new Employees();
		emps.loadData();
		
		//Use the clone method to get the Employee object
		Employees empsNew = (Employees) emps.clone();
		Employees empsNew1 = (Employees) emps.clone();
		List<String> list = empsNew.getEmpList();
		list.add("John");
		List<String> list1 = empsNew1.getEmpList();
		list1.remove("Pankaj");
		
		System.out.println("emps List: "+emps.getEmpList());
		System.out.println("empsNew List: "+list);
		System.out.println("empsNew1 List: "+list1);
	}

}