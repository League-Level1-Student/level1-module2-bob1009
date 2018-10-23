
public class tea {
public static void main(String[] args) {
	TeaBag flavor =new TeaBag(TeaBag.MINT);
	flavor.getFlavor();
	Kettle ket= new Kettle();
	ket.boil();
Cup cup= new Cup();
cup.makeTea(flavor,ket.getWater() );
}
}
