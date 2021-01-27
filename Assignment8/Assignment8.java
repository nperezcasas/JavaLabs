COMS 104 - Fall 2020
Assignment 08
Nuria Perez Casas
Due Friday 3 April 2020

Task: *Design* a vending machine program.

In Chapter 12 we are focusing on design, rather than implementation.  Instead
of writing code, you will perform design steps.

The final deliverable will be a text file (this one) containing the results.
You will not write a working program. This is similar to a lab notebook --
you fill in the parts where I ask you to fill things in. Then turn in the
final product at the end.

This document has some parts of the design process already done for you. Your
job is to fill in the missing details, following the pattern introduced in
chapter 12. This process should be similar to Worked Example 12.1.

The places you need to fill in details will be marked [like this]. Be as
thorough and clear as possible in each step.

----

Step 1: Requirements

The vending machine will function similar to the vending machines found on campus:

*Components*

- There are products inside the vending machine.
- There are buttons on the vending machine allowing user input.
- There is a slot to put money into the machine.
- There is a button to press in case you want to get your money back without 
making a purchase.
- There is equipment (dispenser) that when the user inputs a number it starts moving and 
gets the specific number (product) the user chose.
- There is an inventory that counts the products that are left and to inform
the user when it's at 0

*Operation*

- When the customer puts money into the machine, the display updates the total.
- When the user presses the refund button, he gets the money back on the change box.
- When the user enters an input number, the equipment gets activated and he gets the 
chosen product.


- The display could have a welcome message, a message to display when the 
selected product is out of order, and a thank you message at the end. 
- If the money is not exacts it needs to make a subtraction and give change.
- We could also put a card/phone option to make the purchase, if one of
the components next to the slot to put the money was a card reader.


----

Step 2: Discovering nouns

Now that we have established what the vending machine will do, it is time to
discover the classes that we will use. Look at the requirements list you made
in step 1, and make a list of all the nouns. Even if you don't think it would
be a class, add it to the list:

- product
- vending machine
- money slot
- reset button
- dispenser
- display
- change
- inventory


----

Step 3: Turn some nouns into classes

Only a portion of these nouns will actually be used as classes.  We can simulate
the CRC method by listing the class name, responsibilities, and collaborators:

-----------
Product
-----------
get price
get name
-----------
Used by VendingMachine
Used by Inventory
-----------

--------------
VendingMachine
--------------
manage state
get product
get change
get inventory
--------------
Product
Money
Inventory
--------------

--------------
Money
--------------
get amount
add amount
remove amount
get change
--------------
Used by VendingMachine
--------------

--------------
Inventory
--------------
set product count
get product count
--------------
Product
Used by VendingMachine
--------------



----

Step 4: Document classes

Now that you have discovered the classes you will use, it is time to document them.
We will not actually implement the code. Instead, we will make the shell of some
classes and write method signatures with javadoc comments.

/**
    A product sold in a vending machine.
*/
public class Product
{
    private int price;
    private String name;

    /**
        Constructs a product with the given name and price.
        @param name the name of the product
        @param price the price of the product in cents
    */
    public Product(String name, int price) {}

    /**
        Returns the price of the product.
    */
    public int getPrice() {}

    /**
        Returns the name of the product.
    */
    public String getName() {}
}

/**
    The money handled by a vending machine.
*/

public class Money
{
    private String typeCoin;
    private double value;
    /**
     * Constructs an amount of money with the given type of coin and value
     * @param typeCoin the given type of coin
     * @param value the value of the coin
     */
    public Money(String typeCoin, double value){}

    /**
     * Returns the amount of money inserted
     */
    public double getAmount(){}

    /**
     * Adds the amount to the previous amount
     */
    public double addAmount(){}

    /**
     * Resets the amount to 0.
     */
    public double removeAmount(){}

    /**
     * Subtracts the amount of money and the price of the selected product
     */
    public double getChange(){}
}

/**
 * The units per product we have on the machine. A subclass of product.
 */
public class Inventory
{
    private double productCount;
    /**
     * Sets the product count to whatever amount needed.
     * @param productCount
     */
    public setProductCount(double productCount){}

    /**
     * Gets the number of units left for the product
     */
    public double getProductCount(){}

}

/**
 * The vending machine. 
 */
public class VendingMachine
{
    /**
     * Manages the buttons and the state of the machine overall
     */
    public void manageState(){}

    /**
     * Tells the machine to get the number inputed.
     */
    public void getProduct(){}

    /**
     * Tells the machine the amount of money that needs to be given as change. 
     */
    public double getChange(){}

    /**
     * Get's if there are any units available.
     */
    public double getInventory(){}
}



----

Step 5 would be to implement the actual code, but you DO NOT HAVE TO DO IT. Instead,
look back on what you have created and describe it with some of the terms we have
learned in this chapter like coupling and cohesion.

I have basically created 4 classes and one of them is a subclass of another one.
Each of the classes is cohesive because all have one main class. At the same time
there is not a lot of coupling between them since we only have the big vending machine
class connected to all the others and then they each have a function but don't connect
with each other (With the exception of the inventory and product classes, that connect
with one another).

I would say that the parts of my design that work well is the fact that I have a class for 
all the objects and they only have one main task so I think the coupling and cohesion works
well. However, I think that maybe some of my classes are irrellevant (like the inventory one)
and maybe I should have some other ones. I couldn't come up with anything else I needed 
that could be a separate class. 

----

When you are done, turn in the final file that includes steps 1-4 with all parts in
[square brackets] completely finished.