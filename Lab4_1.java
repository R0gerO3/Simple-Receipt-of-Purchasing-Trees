//Rodrigo Espinoza

/* program creates:
# of trees purch., their height, and delivery info.*/

// (y=height) y< 3ft tall, price:39.00 (tax inc.)
// (height) 3ft<=y<=5ft, price: 69.50 (tax.inc.)
// (height) 6ft<=y<=8ft, 99.00 (tax inc.)
// (height) y>=8ft,      199.50 (tax inc.)

// (x=#of trees) x<5, then 10*x 
//(# of trees) x>=5, then 50
//Ask if trees will be delivered, type 1(yes), 0(no)

/* must use
"keyboard" for scanner input
use printf or DecimalFormat
(int)"forDelivery"- 1(yes for delivery), 0(no for delivery)
(int)"numTrees" for number of trees
(int)"treeHeight" for tree height
(double)"singleTree" for cost of one tree
(double)"treeCost" for all trees purchased
treeCost=numTrees*singleTree of trees ----pay attention to this, i dont get it
(double)"deliveryCost" for holding delivery cost of trees, set 0 if no delivery
totalCharges=treeCost+deliveryCharge*/

import java.util.Scanner;

public class SIMPLE_RECEIPT
{
    public static void main(String[] args)
    {
        int numTrees;
        int treeHeight;
        double treeCost=0;
        double deliveryCost=0;
        double singleTree=0;
        int deliveryCharge;
        double totalCharges;

        Scanner keyboard= new Scanner(System.in);
    System.out.println("Number of trees you'd like to purchase?");
        numTrees=keyboard.nextInt();
    System.out.println(numTrees);
    System.out.println("Tree height to the nearest foot");
        treeHeight=keyboard.nextInt();
    if(treeHeight<3)
    {
        singleTree=39.00;
        treeCost=numTrees*singleTree;
        System.out.printf("$%.2f \n", treeCost);
    }
    else if(3<=treeHeight && treeHeight<=5)
    {
        singleTree=69.50;
        treeCost=numTrees*singleTree;
        System.out.printf("$%.2f \n", treeCost);
    }
    else if(6<=treeHeight && treeHeight<=8)
    {
        singleTree=99.00;
        treeCost=numTrees*singleTree;
        System.out.printf("$%.2f \n", treeCost);
    }
    else if(treeHeight>8)
    {
        singleTree=199.50;
        treeCost=numTrees*singleTree;
        System.out.printf("$%.2f \n", treeCost);
    }
    System.out.println("Will the trees be delivered, enter 1 for Yes or enter"+
    "0 for No");
    deliveryCharge=keyboard.nextInt();
   if(deliveryCharge==1)
    {
        if(numTrees<5)
        {
            deliveryCost=10*numTrees;
            System.out.println(deliveryCost);
        }   
        else if(numTrees>=5)
        {
        deliveryCost=50;
        System.out.println(deliveryCost);
        }
    }
    else if(deliveryCharge==0)
        {
            deliveryCost=0;
            System.out.println(deliveryCost);
        }
    totalCharges=deliveryCost+treeCost;
    System.out.println("Green Fields Landscaping");
    System.out.println("Evergreen Tree Invoice");
    System.out.printf(numTrees+" trees at $%.2f each: $%.2f \n", singleTree, treeCost); //%.2f is 2 dec. places
    System.out.printf("Delivery Charge: $%.2f \n", deliveryCost);
    System.out.println("\t---------");
    System.out.printf("Total: $%.2f \n", totalCharges);
    
    keyboard.close();
    }
}
