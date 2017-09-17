public class Person {
    //человек
    public static void main(String[]args){

    }
    public static final String GENDER_MALE="MALE";
    public static final String GENDER_FEMALE="FEMALE";
    public Person(){

    }
    private String name;
    private int age;
    private int height;
    private int weight;
    private String gender;
    public class Employee extends Person{
        //наёмный рабочий
        private String taxpayerIdentificationNumber;
        private String employeeNumber;

    }
    public class Customer extends Employee{
        //клиент
        private String bisnes;
        private String ransom;

    }


}
