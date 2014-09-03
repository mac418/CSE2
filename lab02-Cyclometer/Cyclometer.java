//Cyclometer Lab
//Purpose: To record the time elapsed and number of rotations of a bicycle
//Maria Castro
//September 3, 2014
//CSE02 Section 112
//Professor Brian Chen
//This program records and prints the rotations, time, and distance covered in two trips on a bicycle.
//It also shows the total distance covered in both trips.
//It converts the distance data from inches to feet to miles
//It converts the time data from seconds to minutes
//It includes constants like π which are needed to calculate the rotations
//
    public class Cyclometer{
        //main method is required to begin any program
        public static void main (String [] args) {
            int secsTrip1=480;
            //Measures time in seconds for trip1
            int secsTrip2=3220;
            //Measures time in seconds for trip2
            int countsTrip1=1561;
            //Counts rotations for trip1
            int countsTrip2=9037;
            //Counts rotations for trip2
            double wheelDiameter=27.0, 
            //Provides diameter of wheel so that the rotations can be measured
            PI=3.14159,//In order to ge the diameter of the wheel and 
                        //thus the rotations we need to include the variable π
            feetPerMile=5280, 
            //The conversion units to change the rotation measurements from feet to miles
            inchesPerFoot=12, 
            //The conversion units to change the rotation measurements from inches to feet
            secondsPerMinute=60; 
            //The conversion units to change the time measurements from seconds to minutes
            double distanceTrip1; 
            double distanceTrip2; 
            double totalDistance;
            
            //The distance of trip 1, trip 2 and the total distance
            
            System.out.println("Trip 1 took " + 
            (secsTrip1/secondsPerMinute) + " minutes and had " +
            countsTrip1 + " counts.");
            System.out.println("Trip 2 took " + 
            (secsTrip2/secondsPerMinute) + " minutes and had " +
            countsTrip2 + " counts.");
         //The first System.out.println prints the minutes and counts of the first trip
         //The second System.out.println prints the minutes and counts of the second trip
         
        distanceTrip1=countsTrip1*wheelDiameter*PI;
        //Distance formula (in inches) shows that for each count,a 
        //rotation of the wheel is the diameter of the wheel in inches times π
        distanceTrip1/=inchesPerFoot*feetPerMile; //Converts the distance in inches to feet and then to miles
        distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile;
        //Determines distance in inches then converts to feet then to miles
        totalDistance=distanceTrip1+distanceTrip2; 
        //Gives the total distance covered in both trips
        
        System.out.println("Trip 1 was "+distanceTrip1+" miles");
        System.out.println("Trip 2 was "+distanceTrip2+" miles");
        System.out.println("The total distance was "+totalDistance+" miles");
            
        }//Main method ends here with a closing bracket
    }//Public Class ends here with a closing bracket