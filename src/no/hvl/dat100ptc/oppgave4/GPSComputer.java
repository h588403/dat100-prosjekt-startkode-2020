package no.hvl.dat100ptc.oppgave4;

import no.hvl.dat100ptc.TODO;
import no.hvl.dat100ptc.oppgave1.GPSPoint;
import no.hvl.dat100ptc.oppgave2.GPSData;
import no.hvl.dat100ptc.oppgave2.GPSDataConverter;
import no.hvl.dat100ptc.oppgave2.GPSDataFileReader;
import no.hvl.dat100ptc.oppgave3.GPSUtils;

public class GPSComputer {
	
private GPSPoint[] gpspoints;
	
	public GPSComputer(String filename) {

		GPSData gpsdata = GPSDataFileReader.readGPSFile(filename);
		gpspoints = gpsdata.getGPSPoints();

	}

	public GPSComputer(GPSPoint[] gpspoints) {
		this.gpspoints = gpspoints;
	}
	
	public GPSPoint[] getGPSPoints() {
		return this.gpspoints;
	}
	
	// beregn total distances (i meter)
	public double totalDistance() {

		double totaldistance = 0;

		// TODO - START
		double speed = 0;
		
		for (int i = 1; i < gpspoints.length; i ++) {
			speed = GPSUtils.speed(gpspoints[i-1], gpspoints[i]);
			
			double speedMS = speed/3.6;
			totaldistance += speedMS * (totalTime());
		}return totaldistance;
		
		

		// TODO - SLUTT

	}

	// beregn totale høydemeter (i meter)
	public double totalElevation() {

		double elevation = 0;

		// TODO - START

		

		// TODO - SLUTT

	}

	// beregn total tiden for hele turen (i sekunder)
	public int totalTime() {
		
	double distance = 0;
		double speed = 0;
		int totalTime = 0;
		for (int i = 1; i < gpspoints.length; i++) {
			distance = GPSUtils.distance(gpspoints[i-1], gpspoints[i]);
			speed = GPSUtils.speed(gpspoints[i-1], gpspoints[i]);
			
			double speedMS = speed/3.6;
			totalTime += (int)distance / (int)speedMS;
		}
		return totalTime;

	}
		
	// beregn gjennomsnitshastighets mellom hver av gps punktene

	public double[] speeds() {
		
		// TODO - START		// OPPGAVE - START
		
		

		// TODO - SLUTT

	}
	
	public double maxSpeed() {
		
		double maxspeed = 0;
		
		// TODO - START
		
		
		
		// TODO - SLUTT
		
	}

	public double averageSpeed() {

		double average = 0;
		
		// TODO - START
	
		
		
		// TODO - SLUTT
		
	}

	/*
	 * bicycling, <10 mph, leisure, to work or for pleasure 4.0 bicycling,
	 * general 8.0 bicycling, 10-11.9 mph, leisure, slow, light effort 6.0
	 * bicycling, 12-13.9 mph, leisure, moderate effort 8.0 bicycling, 14-15.9
	 * mph, racing or leisure, fast, vigorous effort 10.0 bicycling, 16-19 mph,
	 * racing/not drafting or >19 mph drafting, very fast, racing general 12.0
	 * bicycling, >20 mph, racing, not drafting 16.0
	 */

	// conversion factor m/s to miles per hour
	public static double MS = 2.236936;

	// beregn kcal gitt weight og tid der kjøres med en gitt hastighet
	public double kcal(double weight, int secs, double speed) {

		double kcal;

		// MET: Metabolic equivalent of task angir (kcal x kg-1 x h-1)
		double met = 0;		
		double speedmph = speed * MS;
		double time = secs / 3600;

		// TODO - START
		
		if ( speedmph <= 10) {
			met = 4;
		}
		if ( speedmph >= 10 && speedmph <= 12) {
			met = 6;
		}
		if ( speedmph >= 12 && speedmph <= 14) {
			met = 8;
		}
		if ( speedmph >= 14 && speedmph <= 16) {
			met = 10;
		}
		if ( speedmph >= 16 && speedmph <= 20) {
			met = 12;
		}
		if ( speedmph >= 20) {
			met = 16;
		}
		kcal = met / ((weight) / (time));
		return kcal;
		// TODO - SLUTT
		
		
	}

	public double totalKcal(double weight) {

		double totalkcal = 0;

		// TODO - START
		
		totalkcal = kcal(weight, totalTime(), 622 );
		return totalkcal;

		// TODO - SLUTT
		
	} 
	
	private static double WEIGHT = 80.0;
	
	public void displayStatistics() {

		System.out.println("==============================================");

		// TODO - START

		System.out.println("==============================================");
		// TODO - SLUTT
		
	}

}
