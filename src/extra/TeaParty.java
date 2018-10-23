package extra;

public class TeaParty {

	public String welcome(String name, boolean isWoman, boolean isKnighted){
		String finalname ="";
		if(isWoman==true&&isKnighted==true){
			finalname="Hello Lady "+name;
		}
		if (isWoman==false&&isKnighted==true) {
			finalname="Hello Sir "+name;
		}
		if (isWoman==true&&isKnighted==false) {
			finalname="Hello Ms. "+name;
		}
		if (isWoman==false&&isKnighted==false) {
			finalname="Hello Mr. "+name;
		}
		return finalname;
	}
	public void test() {
        TeaParty teaParty = new TeaParty();
        String greeting = teaParty.welcome(null, false, false);
        assertEquals("Hello Ms. Austen", teaParty.welcome("Austen", true, false));
        assertEquals("Hello Mr. Orwell", teaParty.welcome("Orwell", false, false));
        assertEquals("Hello Sir Isaac Newton", teaParty.welcome("Isaac Newton", false, true));
}
	private void assertEquals(String string, String welcome) {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args) {
		TeaParty party= new TeaParty(); 
		party.test();
	}
	
}
    



