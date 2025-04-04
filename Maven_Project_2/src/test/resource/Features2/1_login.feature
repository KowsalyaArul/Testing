Feature: Login the application

@set1
Scenario: For valid values successful login
When enter "<email>" and "<password>"
When click login button
When select book categoreies 
When products1 add to cart
When add products to cart
When to delete the product in cart
When to check the total
When to add the quantity
When to checkout
#When after checkout
When Adding click

Then Order completion
 
Examples:
      |      email       |   password   |  
      | v3m@gmail.com |   123456   | 
     