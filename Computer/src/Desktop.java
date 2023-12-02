//child class
public class Desktop implements Software, Hardware {

	@Override
	public void hardware() {
		System.out.println("hardware");
	}

	@Override
	public void software() {
		System.out.println("software");

	}
	public static void main(String[] args) {
		Desktop desk = new Desktop();
		desk.hardware();
		desk.software();
	}

}
//QUESTION 10:
//-------------
//     Project   :Computer
//     Interface :HardWare
//     Methods   :hardwareResources()
//
//     Interface :Software
//     Methods   :softwareResources()
//
//     Class     :Desktop
//     Methods   :desktopModel()
//
//Description:
//create 2 Interface and archieve multiple inheritance.
