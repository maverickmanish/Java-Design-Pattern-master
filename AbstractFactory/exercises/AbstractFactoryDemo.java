package exercises;

public class AbstractFactoryDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CreditCardFactory abstractFactory = CreditCardFactory.getCreditCardFactory(700);
		
		CreditCard card = abstractFactory.getCreditCard(CardType.PLATINUM);
		
		System.out.println(card.getClass());
		
		abstractFactory = CreditCardFactory.getCreditCardFactory(600);
		
		CreditCard card2 = abstractFactory.getCreditCard(CardType.GOLD);
		
		System.out.println(card2.getClass());
	}

}
