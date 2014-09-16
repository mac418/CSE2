//HW03 Part 1: Bicycle 
//Maria Castro
//September 16, 2014
//CSE02 Section 112
//Professor Brian Chen
//Purpose: To create a program 
//that will process data and through arithmetic equations 
//will calculate the distance, time and miles per hour of a trip on a bicycle



        public class Bicycle{
            public static void main (String [] args) {
                int secs=480;
                //Time in seconds for the trip
                int counts=1561;
                //Number of revolutions for the trip
                double wheelDiameter=27.0,
                //Diameter of the wheel
                PI=3.14159,
                //Declares the variable π which is needed
                //to calculate the distance traveled
                feetPerMile=5280,
                //The conversion units to change the 
                //rotation measurements from feet to miles
                inchesPerFoot=12,
                //The conversion units to change the 
                //rotation measurements from inches to feet
                secondsPerMinute=60;
                //The conversion units to change the time
                //from seconds to minutes
                double distanceTrip;
                //Declares the variable that represents the distance
                double minutes;
                //Declares the variable that represents the time in mins
                double hours;
                //Declares the variable that represents the time in hours
                
                distanceTrip=counts*wheelDiameter*PI;
                //Declares the value acquired through the calculation of distance
                distanceTrip/=inchesPerFoot*feetPerMile;
                //Converts the value of the distance from inches to feet and then
                //from feet to miles
                minutes=(secs/secondsPerMinute);
                //Calculates the time in minutes
                hours=minutes/60;
                //Converts the time in minutes to hours
                
                System.out.println("Enter the number of seconds: "
                + (secs));
                //Prints the value of the time of the trip in seconds
                System.out.println("Enter the number of counts: " 
                + (counts));
                //Prints the value of the number of counts of the trip
                System.out.println("The distance was " +
                ((double)((int)(distanceTrip*100))/100) +
                " miles and took " +minutes+ " minutes");
                //Prints out the distance in miles and the time in minutes
                //with the two decimal places
                System.out.println("The average mph was "
                + ((double)((int)(distanceTrip/hours*100))/100));
                //Prints out the average miles per hour with only 
                //two decimal places
                
            }//Main method ends here with a closing bracket
        }//Public Class ends here with a closing bracket