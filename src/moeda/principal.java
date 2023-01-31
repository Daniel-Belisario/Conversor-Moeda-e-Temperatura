package moeda;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

public class principal {

	private static String moeda;
	private static String moedasegunda;
	public static double numeromoedaconveter;
	private static String temperatura;

	public static void main(String[] args) {
	

		
		 ImageIcon icon = new ImageIcon("image/excla.png");
		 ImageIcon icon2 = new ImageIcon("image/coin.png");
		 ImageIcon icon3 = new ImageIcon("image/temperatura.png");

		
	String escolher =	JOptionPane.showInputDialog(null, "Escolhe uma opção ?", "Qual conversor ?", JOptionPane.ERROR_MESSAGE,icon, new Object[]{"conversor de moeda",
			"conversor de temperatura"}, "escolha").toString();
	
	switch(escolher) {
	
	case "conversor de moeda":
		
		 setMoeda(JOptionPane.showInputDialog(null, "escolhe a primeira moeda pra conveter", "Qual Moeda ?", JOptionPane.ERROR_MESSAGE, icon2, new Object[]{"Real",
				 "Dolar","Peso", "Euro", "Rublo"}, "escolha").toString());	
		
		   String valormoeda = JOptionPane.showInputDialog(null,"entra com valor do " + moeda + ",\n só é permitido numeros \n se for colocar decimal"
					+ " usa o \n(.) ponto:");
			Pattern permissao = Pattern.compile("[^[0-9]*$[.]]");
			Matcher m = permissao.matcher(valormoeda);
			if (m.find()) {
		     JOptionPane.showMessageDialog(null, "Por farvor somente números");
			break;
			}
		 
			setMoedasegunda(JOptionPane.showInputDialog(null, "Pra ser convertido a qual moeda?", "Qual Moeda ?", JOptionPane.ERROR_MESSAGE, icon2, new Object[]{"Real",
					 "Dolar","Peso", "Euro", "Rublo"}, "escolha").toString());
		 
		 numeromoedaconveter = Double.parseDouble(valormoeda);
	
		 if(moeda == "Real" ) {

		     if(moedasegunda == "Real" ){JOptionPane.showMessageDialog(null, "R$" + numeromoedaconveter + 
		    		 " reais está valendo a R$" + (numeromoedaconveter * 1) + " reais.");}
		     if(moedasegunda == "Dolar"){JOptionPane.showMessageDialog(null, "R$" + numeromoedaconveter + 
		    		 " reais está valendo a R$" + (numeromoedaconveter * 0.2) + " Dólares.");}
		     if(moedasegunda == "Peso" ){JOptionPane.showMessageDialog(null, "R$" + numeromoedaconveter + 
		    		 " reais está valendo a R$" + (numeromoedaconveter * 36.74) + " pesos argentinos.");}
		     if(moedasegunda == "Euro" ){JOptionPane.showMessageDialog(null, "R$" + numeromoedaconveter + 
		    		 " reais está valendo a R$" + (numeromoedaconveter * 0.18) + " Euros.");}
		     if(moedasegunda == "Rublo" ){JOptionPane.showMessageDialog(null, "R$" + numeromoedaconveter + 
		    		 " reais está valendo a R$" + (numeromoedaconveter * 13.87) + " Rublos.");}
}
		 
		 if(moeda == "Dolar" ) {
	
			   if(moedasegunda == "Real" ){JOptionPane.showMessageDialog(null, "R$" + numeromoedaconveter + 
			    		 " Dólar está valendo a R$" + (numeromoedaconveter * 5.11) + " reais.");}
			   if(moedasegunda == "Dolar"){JOptionPane.showMessageDialog(null, "R$" + numeromoedaconveter + 
			    		 " Dólar está valendo a R$" + (numeromoedaconveter * 1) + " Dólares.");}
			   if(moedasegunda == "Peso" ){JOptionPane.showMessageDialog(null, "R$" + numeromoedaconveter + 
			    		 " Dólar está valendo a R$" + (numeromoedaconveter * 185.54) + " pesos argentinos.");}
			   if(moedasegunda == "Euro" ){JOptionPane.showMessageDialog(null, "R$" + numeromoedaconveter + 
			    		 " Dólar está valendo a R$" + (numeromoedaconveter * 0.92) + " Euros.");}
			   if(moedasegunda == "Rublo" ){JOptionPane.showMessageDialog(null, "R$" + numeromoedaconveter + 
			    		 " Dólar está valendo a R$" + (numeromoedaconveter * 70.72) + " Rublos.");}
}
		 		 
		 if(moeda == "Peso" ) {

			if(moedasegunda == "Real" ){JOptionPane.showMessageDialog(null, "R$" + numeromoedaconveter + 
		    		 " Peso Argentino está valendo a R$" + (numeromoedaconveter * 0.027) + " reais.");}
		   if(moedasegunda == "Dolar"){JOptionPane.showMessageDialog(null, "R$" + numeromoedaconveter + 
		    		 " Peso Argentino está valendo a R$" + (numeromoedaconveter * 0.0054) + " Dólares.");}
		   if(moedasegunda == "Peso" ){JOptionPane.showMessageDialog(null, "R$" + numeromoedaconveter + 
		    		 " Peso Argentino está valendo a R$" + (numeromoedaconveter * 1) + " pesos argentinos.");}
		   if(moedasegunda == "Euro" ){JOptionPane.showMessageDialog(null, "R$" + numeromoedaconveter + 
		    		 " Peso Argentino está valendo a R$" + (numeromoedaconveter * 0.0049) + " Euros.");}
		   if(moedasegunda == "Rublo" ){JOptionPane.showMessageDialog(null, "R$" + numeromoedaconveter + 
		    		 " Peso Argentino está valendo a R$" + (numeromoedaconveter * 0.37) + " Rublos.");}

 }
		 if(moeda == "Euro" ) {
			
		   if(moedasegunda == "Real" ){JOptionPane.showMessageDialog(null, "R$" + numeromoedaconveter + 
		    		 " Euros está valendo a R$" + (numeromoedaconveter * 5.55) + " reais.");}
		   if(moedasegunda == "Dolar"){JOptionPane.showMessageDialog(null, "R$" + numeromoedaconveter + 
		    		 " Euros está valendo a R$" + (numeromoedaconveter * 1.08) + " Dólares.");}
		   if(moedasegunda == "Peso" ){JOptionPane.showMessageDialog(null, "R$" + numeromoedaconveter + 
		    		 " Euros está valendo a R$" + (numeromoedaconveter * 202.46) + " pesos argentinos.");}
		   if(moedasegunda == "Euro" ){JOptionPane.showMessageDialog(null, "R$" + numeromoedaconveter + 
		    		 " Euros está valendo a R$" + (numeromoedaconveter * 1) + " Euros.");}
		   if(moedasegunda == "Rublo" ){JOptionPane.showMessageDialog(null, "R$" + numeromoedaconveter + 
		    		 " Euros está valendo a R$" + (numeromoedaconveter * 75.85) + " Rublos.");}
}
		 
		 if(moeda == "Rublo" ) {
		
		   if(moedasegunda == "Real" ){JOptionPane.showMessageDialog(null, "R$" + numeromoedaconveter + 
		    		 " Dólar está valendo a R$" + (numeromoedaconveter * 0.072) + " reais.");}
		   if(moedasegunda == "Dolar"){JOptionPane.showMessageDialog(null, "R$" + numeromoedaconveter + 
		    		 " Dólar está valendo a R$" + (numeromoedaconveter * 0.014) + " Dólares.");}
		   if(moedasegunda == "Peso" ){JOptionPane.showMessageDialog(null, "R$" + numeromoedaconveter + 
		    		 " Dólar está valendo a R$" + (numeromoedaconveter * 2.65) + " pesos argentinos.");}
		   if(moedasegunda == "Euro" ){JOptionPane.showMessageDialog(null, "R$" + numeromoedaconveter + 
		    		 " Dólar está valendo a R$" + (numeromoedaconveter * 0.013) + " Euros.");}
		   if(moedasegunda == "Rublo" ){JOptionPane.showMessageDialog(null, "R$" + numeromoedaconveter + 
		    		 " Dólar está valendo a R$" + (numeromoedaconveter * 1) + " Rublos.");}
}
 break;
	
		case "conversor de temperatura":
			
		setTemperatura(JOptionPane.showInputDialog(null, "escolhe", "Qual unidade de Temperatura ?", JOptionPane.ERROR_MESSAGE, icon3, new Object[]{"Celsius",
				 "Kelvin","Fahrenheit"}, "escolha").toString());		
		
		String valortemperatura = JOptionPane.showInputDialog("coloca quantos graus,\n só é permitido numeros \n se for colocar decimal"
				+ " usa o (.) ponto: ");
		Pattern permissao2 = Pattern.compile("[^[0-9]*$[.]]");
		Matcher m2 = permissao2.matcher(valortemperatura);
		if (m2.find()) {
	     JOptionPane.showMessageDialog(null, "Por farvor somente números");
	     break;
	     }
				
	     double	valorgraus = Double.parseDouble(valortemperatura);
		
		if(temperatura == "Celsius" ){JOptionPane.showMessageDialog(null, valorgraus + "°C em graus Celsius convertendo outras medidas: \n"
				+ "Kelvin: " + (valorgraus + 273) + " °K \n"
						+ "Fahrenheit: " + ((valorgraus * 1.8) + 32) + " °F");}
		
		if(temperatura == "Kelvin" ){JOptionPane.showMessageDialog(null, valorgraus + "°C em graus Kelvin convertendo outras medidas: \n"
				+ "Celsius: " + (valorgraus - 273) + " °C \n"
						+ "Fahrenheit: " + (((valorgraus - 273)* 1.8) + 32) + " °K");}
		
		if(temperatura == "Fahrenheit" ){JOptionPane.showMessageDialog(null, valorgraus + "°C em graus Fahrenheit convertendo outras medidas: \n"
				+ "Kelvin: " + (((valorgraus - 32) / 1.8) + 273) + " °K \n"
						+ "Celsius: " + ((valorgraus - 32) / 1.8) + " °F");}
		
		break;
}}

	public static String getMoeda() {
		return moeda;
	}

	public static void setMoeda(String moeda) {
		principal.moeda = moeda;
	}

	public static String getMoedasegunda() {
		return moedasegunda;
	}

	public static void setMoedasegunda(String moedasegunda) {
		principal.moedasegunda = moedasegunda;
	}

	public static String getTemperatura() {
		return temperatura;
	}

	public static void setTemperatura(String temperatura) {
		principal.temperatura = temperatura;
	}
}
