//Arithmetic Homework
//Purpose: To compute the cost of the items you bought at Walmart,
//including the PA sales tax using stored variables and arithmetic calculations
//Maria Castro
//September 7,2014
//CSE02 Section 112
//Professor Brian Chen
//This program calculates; the total cost of each item, sales tax
//for the total cost, total cost of purchases (before tax),
//and how much is paid including the sales tax.

    public class Arithmetic{
        //main method is required to begin any program
        public static void main (String [] args) {
            //Number of pairs of socks
            int nSocks=3;
            //Cost per pair of socks
            //('$' is part of the variable name)
            double sockCost$=2.58;
            //Number of drinking glasses
            int nGlasses=6;
            //Cost per glass
            double glassCost$=2.29;
            //Number of boxes of envelopes
            int nEnvelopes=1;
            //Cost per box of envelopes
            double envelopeCost$=3.25;
            double taxPercent=0.06;
            double totalSocksCost$;
            //Total cost of the socks
            double totalGlassesCost$;
            //Total cost of the glasses
            double totalEnvelopeCost$;
            //Total cost of the envelopes
            double totalpaidCost$;
            //Total paid for transaction
            double totalbeforetax$;
            //
          
            totalSocksCost$=nSocks*sockCost$;
            //This formula calculates the total cost of the socks before tax
            totalGlassesCost$=nGlasses*glassCost$;
            //This formula calculates the total cost of the glasses before tax
            totalEnvelopeCost$=nEnvelopes*envelopeCost$;
            //This formula calculates the total cost of the envelopes before tax
            totalpaidCost$=(totalSocksCost$+totalGlassesCost$+totalEnvelopeCost$)*taxPercent+
            (totalSocksCost$+totalGlassesCost$+totalEnvelopeCost$);
            //This formula calculates the total paid for the transaction including tax
            totalbeforetax$=totalSocksCost$+totalEnvelopeCost$+totalGlassesCost$;
            //
          
            
            System.out.println("Item: Socks");
            System.out.println("Number: 3");
            System.out.println("Unit price: $2.58");
            System.out.println("Cost of the socks: $" 
            + (nSocks*sockCost$));
            System.out.println("Sales tax for the socks: $" 
            + ((double)((int)(totalSocksCost$*taxPercent*100))/100));
            //This section prints the item, the amount of items,
            //unit price, the cost of the items before tax, 
            //the sales tax
            
            System.out.println("Item: Glasses");
            System.out.println("Number: 6");
            System.out.println("Unit price: $2.29");
            System.out.println("Cost of the glasses: $" 
            + (nGlasses*glassCost$));
            System.out.println("Sales tax for the glasses: $" 
            + ((double)((int)(totalGlassesCost$*taxPercent*100))/100));
            //This section prints the item, the amount of items,
            //unit price, the cost of the items before tax,
            //the sales tax
            
            System.out.println("Item: Envelope");
            System.out.println("Number: 1");
            System.out.println("Unit price: $3.25");
            System.out.println("Cost of the envelopes: $" 
            + (nEnvelopes*envelopeCost$));
            System.out.println("Sales tax for the envelopes: $" 
            + ((double)((int)(totalEnvelopeCost$*taxPercent*100))/100));
            //This section prints the item, the amount of items,
            //unit price, the cost of the items before tax,
            //the sales tax
            
          
            
            System.out.println("The total cost of the purchases before tax: $" 
            + (totalSocksCost$+totalGlassesCost$+totalEnvelopeCost$));
            System.out.println("The total sales tax for the purchases: $" 
            + ((double)((int)(totalbeforetax$*taxPercent*100))/100));
            System.out.println("The total paid for the transaction: $" 
            + ((double)((int)(totalpaidCost$*100))/100));
            //This section prints the total cost of the purchases before tax,
            //the total sales tax for the purchases,
            //and the total paid for the transaction
            
        }//Main method ends here with a bracket
    }//Public class ends here with a bracket