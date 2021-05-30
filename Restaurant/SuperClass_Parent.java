/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Restaurant;

/**
 *
 * @author madhu
 */
public class SuperClass_Parent {
    
    public double VegBurger;
    public double ChickenBurger;
    public double Fries;
    public double VegCombo;
    public double NonVegCombo;
    
    public double OreoMilkShake;
    public double VanillaMilkShake;
    public double ChocolateMilkShake;
    public double KitkatMilkShake;
    public double StrawberryMilkShake;
    
    public double Meals;
    public double Drinks;
    public double TotalofMD;
    
    public double AllTotalofMD;
    
    public double GetAmount()
    {
    Meals = VegBurger + ChickenBurger + Fries + VegCombo + NonVegCombo;
    Drinks = OreoMilkShake + VanillaMilkShake + ChocolateMilkShake + KitkatMilkShake + StrawberryMilkShake;
    TotalofMD = Meals + Drinks;
    AllTotalofMD = TotalofMD;
    return AllTotalofMD;
    }
    
   //===============price
    public double pVegBurger=99;
    public double pChickenBurger=129;
    public double pFries=89;
    public double pVegCombo=387;
    public double pNonVegCombo=416;
    
    public double pOreoMilkShake=199;
    public double pVanillaMilkShake=179;
    public double pChocolateMilkShake=199;
    public double pKitkatMilkShake=199;
    public double pStrawberryMilkShake=199;
    //=================Tax
    
    public double mcTax = 0.8;
    public Double cFindTax(double cAmount)
    {
        double FindTax = cAmount - (cAmount * mcTax);
        return FindTax;
    }
            
}
