package Week3.day2;

public class LoginTestData extends TestData {

	public void enterUsername(String a) {
		System.out.println("enter the User Name: " + a);
	}
	public void enterPassword(String b) {
		System.out.println("Enter the Password: " + b);
		
	}
	public static void main(String[] args) {
		LoginTestData obj1 = new LoginTestData();
		TestData obj2 = new TestData();
		obj2.enterCredentials();
		obj2.navigateToHomePage();
		obj1.enterUsername("Priya");
		obj1.enterPassword("Pri@1987");
	 
}
}
