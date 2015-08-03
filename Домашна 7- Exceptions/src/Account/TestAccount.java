package Account;

public class TestAccount {

	public static void main(String[] args) throws NegativeMoneyException {
		try {
			PersonalAccount a = new PersonalAccount(1000.0, "Dimitar Draganov",950311097);
			CorporativeAccount b = new CorporativeAccount(3000000.2353, "Draganov OOD", 198726465);
			checkForInstance(a);
			checkForInstance(b);
		} catch (InvalidAccountException exp) {
			System.out.println("The exception is caught" + exp);
		}
	}
	public static void checkForInstance(Account object) throws InvalidAccountException {
		if (!(object instanceof Account)) {
			throw new InvalidAccountException();
		}
		if (object instanceof PersonalAccount) {
			System.out.printf("PersonalID: %d\n", ((PersonalAccount) object).getIDNumber());

		} else if (object instanceof CorporativeAccount) {
			System.out.printf("BULSTAT: %d\n", ((CorporativeAccount) object).getBulstat());

		}
	}

	}


