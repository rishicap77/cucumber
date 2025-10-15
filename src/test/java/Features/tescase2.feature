
Feature: place the order
 

 @smoke
  Scenario: verfiy the product is placed successfully
  Given user is on greenkart homepage
   When user searches the product with shortname "tom" and increases the quantity "3"
   And adds the product to cart and goes to checkoutpage
   Then checks that productname is matching with productadded 
   And places the order by filling all the fields
   
  
