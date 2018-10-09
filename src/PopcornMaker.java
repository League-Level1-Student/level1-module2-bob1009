import javax.swing.JOptionPane;

public class PopcornMaker {
	public static void main(String[] args) {
		Microwave wave = new Microwave();
		String flavor = JOptionPane.showInputDialog("what flavor of popcorn do you want to eat?");
		Popcorn corn = new Popcorn(flavor);
		wave.putInMicrowave(corn);
		String time = JOptionPane.showInputDialog("how many minutes do you want to cook it?");
		int Time = Integer.parseInt(time);
		wave.setTime(Time);
		wave.startMicrowave();
		
	}
}
