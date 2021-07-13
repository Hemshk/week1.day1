package week1.day2;

public class Mobile {

	public void makeCall() {
		System.out.println("Make call");
	}

	public void sendMsg() {
		System.out.println("send msg");

	}

	public void payBills() {
		System.out.println("pay Bills");
	}

	public void setAlarm(String alarm) {
		System.out.println("alarm");
		System.out.println(alarm);
	}

	public static void main(String[] args) {

		Mobile objName = new Mobile();
		objName.makeCall();

		objName.setAlarm("1.0");
	}

}
