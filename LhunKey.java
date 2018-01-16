package lhunkey;

public class LhunKey {

	public static void main(String[] args) {
		// TODO Auto-generated method stub >
		boolean verification = false;
		
		verification = verification("4846863704433904");
		if(verification == true) {
			verification = Calcullhunkey("4846863704433904");
		}
		System.out.println(verification);
		
	}
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
	
	static public boolean verification(String PAN) {
		String msg = null;
		boolean verification = true;
		
		if(PAN.length() == 16 || PAN.length() == 18) {
			for(int i = 0; i < PAN.length(); i++) {
				if(verification == true) {
					if(Character.isLetter(PAN.charAt(i))) {
						verification= false;
						msg += "Veuillez renseigner des chiffres";
					}
					else
						verification = true;
						
				}
			}
		}
		else {
			msg += "taille du Numero PAN incorrect";
			verification = false;
		}

		
		return verification;
	}
	
}
//sum += Character.getNumericValue(number) ; 
