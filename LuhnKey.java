/*check the validity of a card from the PAN number
 * I realized this algorithm whose purpose of 
 * being able to propose a PAN verification can be more detailed
 * by mijefox
 */
package luhn;

public class LuhnKey {

	public static void main(String[] args) {
		// TODO Auto-generated method stub >
		boolean verification = false;
		String PAN = "0000000000000000"; //Enter the PAN
		
		verification = verification(PAN); //verifies the size and character
		if(verification == true) { //if size PAN == 16 and no letter
			verification = Calcullhunkey(PAN); //Verifies the validity of the PAN
		}
		System.out.println(verification);//TRUE OR FALSE
	}
	
	//START ALGORITHM
	static public boolean Calcullhunkey(String PAN) {
		int sum = 0;
		int value = 0;
		
		for(int i = PAN.length()-1;i >= 0; i --) {
			value = Integer.parseInt(Character.toString(PAN.charAt(i)));
			if(i % 2 == 0) {
				value *= 2;
				if(value > 10) {
					value -= 9;
				}
			}
			sum += value;
			value = 0;
		}
		return sum % 10 == 0;
	}
	//END ALGORITHM
	
	
	
	//VERIFICATION
	static public boolean verification(String PAN) { //verifies the size and character
		/*Cette methode permet de verifier
		 * La taille de la valeur renseigné ainsi que les caractere 
		 * Si le PAN contien des lettre ou la taille du PAN est incorrect la méthode retourne un fasle
		 * */
		
		/* This method allows to verify
		* The size of the value entered as well as the characters
		* If the PAN contains letters or the size of the PAN is incorrect the method returns a fasle
		* */
		String msg = null;
		boolean verification = true;
		
		if(PAN.length() == 16) {
			for(int i = 0; i < PAN.length(); i++) {
				if(verification == true) {
					if(Character.isLetter(PAN.charAt(i))) {
						verification= false;
						//msg += "please enter numbers";
					}
					else
						verification = true;
						
				}
			}
		}
		else {
			//msg += "wrong size";
			verification = false;
		}

		
		return verification;
	}
	
}
