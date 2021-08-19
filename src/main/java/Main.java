public class Main {
    public static void main(String[] args) {
        Department department = new Department();
        department.setId("123");
        department.setName("dep1");

        Employee employee = new Employee();
        employee.setId("785");
        employee.setLastName("DDLD");
        employee.setDepartment(department);

        EmployeeMapper employeeMapper = new EmployeeMapperImpl();
        EmployeeDto employeeDto = employeeMapper.entityToDto(employee);
        System.out.println(employeeDto);
    }
}
