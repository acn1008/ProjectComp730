@author Ellie Brown/Andre Nasrah
# ProjectComp730
## Temperature Conversion App

### Temperature Conversion app where a user inputs a number and selects if they want to convert from Celsius to Fahrenheit, Fahrenheit to Celsius, Kelvin to Fahrenheit, Fahrenheit to Kelvin, Celsius to Kelvin, or Kelvin to Celsius. A progress bar is implemented at the bottom of the screen to indicate freezing and boiling based on conversion. When the bar is at 0 it means that value was either at freezing or below freezing. When the bar is full it means that value was either at boiling point or above it. For example, when a user inputs 32 and selects to convert from Fahrenheit to Celsius, the bar will be at 0 and the result will be 0 in the output field. This indicates that 32 F and 0 C are the same both visually and numerically.

## How to Use

### Click on the input field and type in a number you wish to convert. Select which conversion you want to do by clicking on the dropdown menu just below the text input field and choose between either Celsius to Fahrenheit, Fahrenheit to Celsius, Kelvin to Fahrenheit, Fahrenheit to Kelvin, Celsius to Kelvin, or Kelvin to Celsius. The resulting conversion will appear in the output field below the buttons.

### A bar is shown at the bottom on the screen that indicates how close your number was to either the freezing point or the boiling point for the respective degree unit. For example, 32 F will show up as 0% on the bar because 32 F is freezing point; 212 F will show as 100% on the bar because 212 F is the boiling point. Additionally, 0 C will show as freezing and 100 C will show as boiling.

## Visual Aids

### Background of application will change based on how the converted output (temperature) falls within, or close to the freezing or boiling point. Freezing temperatures will have a blue background. Boiling temperatures will have a red background. Temperatures between freezing and boiling will have a green background. This is for both Fahrenheit and Celsius temperatures. The default background color is purple before a temperature is entered to be converted to either Fahrenheit or Celisius via the drop-down menu selection.

## Test Cases to Follow

### Input 100 and convert from Celsius to Fahrenheit; result will be 212.0
  ### -Progress bar will be full and background will change to red.
  

### Input 0 and convert from Celsius to Fahrenheit; result will be 32.0
  ### -Progress bar will be empty and background will change to blue.


### Input 32 and covert from Fahrenheit to Celsius; result will be 0 and bar will be empty.
  ### -Progress bar will be empty and background will change to blue.


### Input 212 and convert from Fahrenheit to Celsius; result will be 100.0
  ### -Progress bar will be full and background will change to red.


### Input 40 and convert from Celsius to Fahrenheit; result will be 104.0
  ### -Progress bar will be filled about one-third of the way and background will change to green.
  

### Input -100 and convert from Celsius to Fahrenheit; result will be -148.0
  ### -Progress bar will be empty and background will change to blue.


### Input 175 and convert from Fahrenheit to Celsius; result will be 79.4 repeating.
  ### -Progress bar will be 80% full and background will change to green.
  

### Input -32 and convert from Fahrenheit to Celsius; result will be -35.55555555555556 repeating.
  ### -Progress bar will be empty and background will change to blue.
  

### Input 373.15 and convert from Kelvin to Celsius; result will be 100.0
  ### -Progress bar will be 100% full and background will change to red.


### Input 273.15 and convert from Kelvin to Celsius; result will be 0.0
  ### -Progress bar will be empty and background will change to blue.


### Input 323.15 and convert from Kelvin to Celsius; result will be 50.0
  ### -Progress bar will be 50% full and background will change to green.


### Input -373.15 and convert from Kelvin to Celsius; result will be -646.30.
  ### -Progress bar will be empty and background will change to blue.
  
  
### Input 373.15 and convert from Kelvin to Fahrenheit result will be 212.0
  ### -Progres bar will be empty and background will change to blue.


### Input 273.15 and convert from Kelvin to Fahrenheit; result will be 32.0
  ### -Progress bar will be empty and background will change to blue.


### Input 323.15 and convert from Kelvin to Fahrenheit; result will be 122.0
  ### -Progress bar will be 50% full and background will change to green.
  
 
### Input -373.15 and convert from Kelvin to Fahrenheit; result will be -1131.34.
  ### -Progress bar will be empty and background will change to blue.


### Input 212 and convert from Fahrenheit to Kelvin; result will be 373.15.
  ### -Progress bar will be 100% full and background will change to red.


### Input 32 and convert from Fahrenheit to Kelvin; result will be 273.15.
  ### -Progress bar will be empty and background will change to blue.


### Input 122 and convert from Fahrenheit to Kelvin; result will be 323.15.
  ### -Progress bar will be 50% full and background will change to green.
  

### Input -212.00 and convert from Fahrenheit to Kelvin result will be 137.594444444444443
  ### -Progress bar will be empty and background will change to blue.
  

### Input 100 and convert from Celsius to Kelvin; result will be 373.15.
  ### -Progress bar will be 100% full and background will change to red.


### Input 0 and convert from Celsius to Kelvin; result will be 273.15.
  ### -Progress bar will be empty and background will change to blue.


### Input 50 and convert from Celsius to Kelvin; result will be 323.15.
  ### -Progress bar will be 50% full and background will change to green.
  
  
### Input -373.15 and convert from Celsius to Kelvin; result will be -100.0
  ### -Progress bar will be empty and background will change to blue.


  
  

  
  
  
  
  
  
  
