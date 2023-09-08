
## __Altimetrik__

### 1. You are provided with list of employees Employee has firstName, lastName, salary.
---
 Filter the list based on firstName starting with A and salary greater than 50000 and the final output should be list of lastNames.

 ```
import java.util.*;
import java.util.stream.*;

public static void getEmployees(List<Employee> emp){

	List<Employee> empResult = 
    emp.stream()
		.filter(e -> e.getfirstName().charAt(0).equals("A"))
		.filter(s -> s.getSalary() > 50000)
		.map(Employee::lastName)
		.collect(Collectors.toList());
								
								
		System.out.println(empResult);			
	
 ```

 ### 2. 
 ```
 try {​​​​​​
   throw new FileNotFoundException();
}​​​​​​ catch (IOException e) {​​​​​​
   System.out.println(e);
}​​​​​​ catch (FileNotFoundException e) {​​​​​​
   System.out.println(e);
}​​​​​​
```

Ans- 
```
try {
    throw new FileNotFoundException();
} catch (FileNotFoundException e) { // Catch more specific exception first
    System.out.println(e);
} catch (IOException e) { // Then catch more general exception
    System.out.println(e);
}

```

### 3 . write a sql query to find the count of employees working in different departments.department is a column in employee table.

```
select department, count(employees) from employee group by department;
```

### 4. Explain @one-to-many relationship in hibernate?
__Entity Mapping:__
![image](../Java/images/java1.png)


__Inverse Side:__
![image](../Java/images/java2.png)



### 5. Explain cascade = CascadeType.ALL in hibernate.


In Hibernate, __cascade = CascadeType.ALL__ is an option that you can set on a parent entity's association to specify that __certain operations on the parent entity should be cascaded, or propagated, to its associated child entities.__ This means that when you perform a specific __operation (e.g., saving, updating, or deleting)__ on the parent entity, the same operation will be applied to its associated child entities automatically.

Here's a breakdown of the different cascade options and what CascadeType.ALL means in Hibernate:

__CascadeType.ALL:__

When you specify cascade = CascadeType.ALL on a parent entity's association, it implies that all the following operations will be cascaded to the associated child entities:

__CascadeType.PERSIST:__ When you save or persist the parent entity __(e.g., using session.save() or entityManager.persist())__, the associated child entities will also be saved or persisted if they are not already managed by the current Hibernate session or persistence context.

__CascadeType.MERGE:__ When you update or merge the parent entity __(e.g., using session.update() or entityManager.merge()),__ the associated child entities will also be updated or merged if they are not already managed by the current Hibernate session or persistence context.

__CascadeType.REMOVE:__ When you delete the parent entity (e.g., using session.delete() or entityManager.remove()), the associated child entities will also be deleted.

__CascadeType.REFRESH:__ When you refresh the parent entity __(e.g., using session.refresh() or entityManager.refresh()),__ the associated child entities will also be refreshed if they are not already managed.

__CascadeType.DETACH:__ When you detach the parent entity __(e.g., using session.evict() or entityManager.detach())__, the associated child entities will also be detached.

__CascadeType.ALL__ effectively includes all of the above cascade types, so any operation you perform on the parent entity will propagate to its associated child entities.
