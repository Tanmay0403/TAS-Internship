import java.util.*;
class ExchangeRate
{
	double getExchangeRate(int source, int target)
	{
		double rate=0;
		if(source==1)
		{
			switch(target)
			{
			case 1:
				rate = 1;
				break;
			case 2:
				rate = 0.012;
				break;
			case 3:
				rate = 0.011;
				break;
			case 4:
				rate = 1.75;
				break;
			case 5:
				rate = 0.044;
				break;
			default:
				break;
			}
		}
		if(source==2)
		{
			switch(target)
			{
			case 1:
				rate = 83.37;
				break;
			case 2:
				rate = 1;
				break;
			case 3:
				rate = 0.92;
				break;
			case 4:
				rate = 145.54;
				break;
			case 5:
				rate = 3.67;
				break;
			default:
				break;
			}
		}
		
		if(source==3)
		{
			switch(target)
			{
			case 1:
				rate = 91.10;
				break;
			case 2:
				rate = 1.09;
				break;
			case 3:
				rate = 1;
				break;
			case 4:
				rate = 159.02;
				break;
			case 5:
				rate = 4.02;
				break;
			default:
				break;
			}
		}
		
		if(source==4)
		{
			switch(target)
			{
			case 1:
				rate = 0.57;
				break;
			case 2:
				rate = 0.0069;
				break;
			case 3:
				rate = 0.0063;
				break;
			case 4:
				rate = 1;
				break;
			case 5:
				rate = 0.025;
				break;
			default:
				break;
			}
		}

		if(source==5)
		{
			switch(target)
			{
			case 1:
				rate = 22.67;
				break;
			case 2:
				rate = 0.27;
				break;
			case 3:
				rate = 0.25;
				break;
			case 4:
				rate = 39.57;
				break;
			case 5:
				rate = 1;
				break;
			default:
				break;
			}
		}	
		return rate;
	}
}
public class CurrencyConverter
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Amount: ");
		double amount = sc.nextDouble();
		System.out.println("Select Source Currency: ");
		System.out.println("1: Rupees");
		System.out.println("2: USD");
		System.out.println("3: Euro");
		System.out.println("4: Yen");
		System.out.println("5: Dirham");
		System.out.print("Enter Your Choice: ");
		int ch1 = sc.nextInt();
		System.out.println("Select Target Currency: ");
		System.out.println("1: Rupees");
		System.out.println("2: USD");
		System.out.println("3: Euro");
		System.out.println("4: Yen");
		System.out.println("5: Dirham");
		System.out.print("Enter Your Choice: ");
		int ch2 = sc.nextInt();
		ExchangeRate er = new ExchangeRate();
		double exchangeRate = er.getExchangeRate(ch1,ch2);
		System.out.println("Converted Amount = "+(amount*exchangeRate));
		sc.close();
	}

}
