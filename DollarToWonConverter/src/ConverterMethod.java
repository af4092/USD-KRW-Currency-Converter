
public class ConverterMethod {

	private String currencyRate;
	private String convertAmount;
	
	public ConverterMethod(String currencyRate, String convertAmount) {
		this.currencyRate = currencyRate;
		this.convertAmount = convertAmount;
	}
	
	public String getCurrencyRate() {
		return currencyRate;
	}
	
	public String getConvertAmount() {
		return convertAmount;
	}
	
	public double currency() {
		return Double.parseDouble(currencyRate);
	}
	
	public double amount() {
		return Double.parseDouble(convertAmount);
	}
	
	public double DollarToWon() {
		return currency() * amount();
	}
	
	public String DollarToWonString() {
		return String.valueOf(DollarToWon());
	}
	
	public double WonToDollar() {
		return Math.round(amount() * (1 / currency()));
	}
	
	public String WonToDollarString() {
		return String.valueOf(WonToDollar());
	}
	
}
