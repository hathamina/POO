
public class Main {

	
		
	int carYears;
	String carName;
	
	public Main(int year , String name){
		carYears= year;
		carName =name;	
		}
	
	
	String fName;
	String lName;
	String nationality;
	int  age;
	public Main (String name, String namel, String natio, int ag) {
		fName = name;
		lName = namel;
		nationality = natio;
		age = ag;
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Main myObject = new Main(1989, "Mercedes");
		System.out.println(myObject.carName);
		
		Main myProfil = new Main("Amina", "KHIAT", "Algerienne", 33);
		System.out.println(myProfil.fName+ myProfil.lName + myProfil.nationality +myProfil.age );
		
		}
	

}
