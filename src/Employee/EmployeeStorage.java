package Employee;


public class EmployeeStorage {
    //  մեր հիմնական մասիվն է բաղկացած 10 էլեմենտից
    private Employee[] array = new Employee[200];

    private int size = 0; //մասիվի մեջ ավելացրած էլեմենտների քանակն է

    public void add(Employee value) {
        if (size == array.length) {
            extend();
        }
        array[size++] = value;
    }

    private void extend() {//հին մասիվի սսիլկան կապում ենք նոր ստեղծվածի հետ, ստեղծվել է tmp ժամանակավոր փոփոխական
        Employee[] tmp = new Employee[array.length + 10];
        for (int i = 0; i < array.length; i++) {// size = array.lenght
            tmp[i] = array[i];
        }
        array = tmp;
    }


    public void print() {// տպում ենք ավելացրած էլեմենտները
        for (int i = 0; i < size; i++) {
            System.out.println(array[i] + ", ");
        }


    }


    public void searchByID(String keyword) {
        boolean found = false;
        for (int i = 0; i < size; i++) {
            Employee employee = array[i];
            if (employee.getEmployeeID().contains(keyword)) {
                found = true;
                System.out.println(employee);

            }

        }
        if (!found) {
            System.out.println(" Employee" + keyword + "does not exist");
        }
    }

    public void searchByCompanyName(String keywordCompany) {
        boolean found = false;
        for (int i = 0; i < size; i++) {
            Employee employee = array[i];
            if (employee.getCompany().contains(keywordCompany)) {
                found = true;
                System.out.println(employee);
            }
            if (!found) {
                System.out.println("Employee " + keywordCompany + "does not find");
            }


        }
    }
}














    


