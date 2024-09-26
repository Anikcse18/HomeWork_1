package hw_1;

public class Problem_1 {

	public static double calculation(double radius) {
		
		double pi = Math.PI;
		double volumeSphere =  4.0/3.0 * pi * Math.pow(radius, 3);
		return volumeSphere;
	}
	
	public static void main(String[] args) {
		double sunRadius = 865000.0 / 2.0;  // Use double for more accurate results
        double earthRadius = 7600.0 / 2.0;
        
		 double ratio = calculation(sunRadius)/calculation(earthRadius);
		 
		System.out.println("The volume of the Earth is "+ calculation(earthRadius) + " cubic miles, the volume of the sun is "+ calculation(sunRadius) +" cubic miles, and the ratio of the volume of the Sun to the volume of the Earth is "+ratio);
	


	}

}
