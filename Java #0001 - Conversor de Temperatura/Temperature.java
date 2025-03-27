package entities;

public class Temperature {
	
	public Double conversorKelvin (double celsius) {
		return celsius + 273.15;
	}
	
	public Double conversorReaumur (double celsius) {
		return celsius * 0.8;
	}
	
	public Double conversorRankine (double celsius) {
		return celsius * 1.8 + 32 + 459.67;
	}
	
	public Double conversorFahrenheit (double celsius) {
		return celsius * 1.8 + 32;
	}
	
}