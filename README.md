# ProjectComp730
## Temperature Conversion App

### Temperature Conversion app where a user inputs a number and selects if they want to convert from Celsius to Fahrenheit or from Fahrenheit to Celsius. A progress bar is implemented at the bottom of the screen to indicate freezing and boiling based on conversion. When the bar is at 0 it means that value was either at freezing or below freezing. When the bar is full it means that value was either at boiling point or above it. For example,when a user inputs 32 and selects to convert from Fahrenheit to Celsius, the bar will be at 0 and the result will be 0 in the output field. This indicates that 32 F and 0 C are the same both visually and numerically.

## How to Use

### Click on the input field and type in a number you wish to convert. Click on one of the buttons below the input field to convert your number from either Celsius to Fahrenheit or from Fahrenheit to Celsius. The resulting conversion will appear in the output field below the buttons.

### A bar is shown at the bottom on the screen that indicates how close your number was to either thee freezing point or the boiling point for the respective degree unit. For example, 32 F will show up as 0% on the bar because 32 F is freezing point; 212 F will show as 100% on the bar because 212 F is the boiling point. Additionally, 0 C will show as freezing and 100 C will show as boiling.

## Visual Aids

### Background of application will change based on how the converted output (temperature) falls within, or close to the freezing or boiling point. Freezing temperatures will have a blue background. Boiling temperatures will have a red background. Temperatures between freezing and boiling will have a green background. This is for both Fahrenheit and Celsius temperatures. The default background color is purple before a temperature is entered to be converted to either Fahrenheit or Celisius via the drop-down menu selection.

## Test Cases to Follow

### Input 100 and convert from Celsius to Fahrenheit; result will be 212 with a full bar.

### Input 0 and convert from Celsius to Fahrenheit; result will be 32 and bar will be empty.

### Input 32 and covert from Fahrenheit to Celsius; result will be 0 and bar will be empty.

### Input 212 and convert from Fahrenheit to Celsius; result will be 100 with a full bar.

### Input 40 and convert from Celsius to Fahrenheit; result will be 104 and the bar will be about one-third full.

### Input 175 and convert from Fahrenheit to Celsius; result will be 79.4 repeating and the bar will be roughly 80% full.
