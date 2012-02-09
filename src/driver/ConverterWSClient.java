package driver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.rmi.RemoteException;

import org.apache.axis.AxisFault;

import domain.CelsiusFahrenheitServiceProxy;

public class ConverterWSClient {
	public static void main(String[] args) {
		try {
			
			CelsiusFahrenheitServiceProxy proxy = new CelsiusFahrenheitServiceProxy();
			String quit = "";
			InputStreamReader input_reader = new InputStreamReader(System.in);
			BufferedReader input = new BufferedReader(input_reader);
			
			System.out.println("Welcome to the temperature conversion web service client.\n(type 'quit' to exit)");
			
			while (!quit.equals("quit")) {
				System.out.println("PROMPT:\tEnter the number 1 to convert from Celsius to Fahrenheit\n\tEnter the number 2 to convert from Fahrenheit to Celcius");
				String res = input.readLine();
				
				if (res.matches("[0-9]") == false) {
					
					if (res.matches("quit")) {
						System.out.println("STATUS:\tApplication terminated");
						quit = "quit";
					}
					else {
						System.out.println("STATUS:\tInvalid selection recevied.");	
					}
				}
				else {

					if (Integer.parseInt(res) == 1) {
						System.out.println("PROMPT:\tEnter the value in degrees you would like to convert from Celsius to Fahrenheit:");
						 res = input.readLine();
						 System.out.println("STATUS:\tCalling the web service...");
						 String result = proxy.convertCtoF(res);
						 System.out.println("RESPONSE: "+res+" degree(s) Celsius equals "+ result +" degree(s) Fahrenheit");
					}
					else if(Integer.parseInt(res) == 2) {
						System.out.println("PROMPT:\tEnter the value in degrees you would like to convert from Fahrenheit to Celsius:");
						 res = input.readLine();
						 System.out.println("STATUS:\tCalling the web service...");
						 String result = proxy.convertFtoC(res);
						 System.out.println("RESPONSE: "+res+" degree(s) Fahrenheit equals "+ result +" degree(s) Celsius");
					}
					else if (res.equalsIgnoreCase("quit")) {
						quit = "quit";
					}
					else {
						System.out.println("STATUS:\tInvalid input received.");
					}
				}
			} // end while loop
			
            } catch (AxisFault e) {
                    e.printStackTrace();
            } catch (RemoteException e) {
                    e.printStackTrace();
            } catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		System.exit(0);
    }
}