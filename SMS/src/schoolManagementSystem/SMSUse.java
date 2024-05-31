package schoolManagementSystem;
import java.util.List;
import java.util.ArrayList;
public class SMSUse {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Teacher lizzy = new Teacher(1,"Lizz",500);
		Teacher mellisa = new Teacher(2,"Mellisa",700);
		Teacher vanderhorn = new Teacher(3,"Vanderohorn",600);
		
		List<Teacher> teacherList = new ArrayList<>();
		teacherList.add(lizzy);
		teacherList.add(mellisa);
		teacherList.add(vanderhorn);
		
		
		
		Student tamasha = new Student(1,"Tamasha",4);
		Student rakshith = new Student(2,"Rakshith",12);
		Student rabbi = new Student(3,"Rabbi",5);
		
		List<Student> studentList = new ArrayList<>();
		studentList.add(tamasha);
		studentList.add(rakshith);
		studentList.add(rabbi);
		
		School ghs = new School(teacherList, studentList);
		System.out.println("GHS has earned : "+ghs.getTotalMoneyEaned());
		
		tamasha.payFees(5000);
		System.out.println("GHS has earned : "+ghs.getTotalMoneyEaned());
		rakshith.payFees(6000);
		System.out.println("GHS has earned : "+ghs.getTotalMoneyEaned());
		
		
		System.out.println("------Making SCHOOL PAY SALARY----");
        lizzy.receiveSalary(lizzy.getSalary());
        System.out.println("GHS has spent for salary to " + lizzy.getName()
        +" and now has $" + ghs.getTotalMoneyEaned());
        
        
        vanderhorn.receiveSalary(vanderhorn.getSalary());
        System.out.println("GHS has spent for salary to " + vanderhorn.getName()
                +" and now has $" + ghs.getTotalMoneyEaned());
        
        
        
        System.out.println(rakshith);

        mellisa.receiveSalary(mellisa.getSalary());

        System.out.println(mellisa);


	}
}
