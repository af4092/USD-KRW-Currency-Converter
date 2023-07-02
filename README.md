# USD-KRW-Currency-Converter
Desktop app built on eclipse window builder, to calculate USD-to-KRW and KRW-to-USD currency

- Main application view looks as following: 

<p align="center">
  <img src="https://user-images.githubusercontent.com/24220136/224535336-36f2645a-67ea-4658-84a3-bbf44863d973.png" alt="Image">
</p>

- When we enter the general dollar to won conversion rate based on real time, then enter the amount in case of dollar to won conversion, and press the button `USD-To-KRW`:

<p align="center">
  <img src="https://user-images.githubusercontent.com/24220136/224535389-2924ce8e-e8e7-4971-9ee1-68c6bc051daa.png" alt="Image">
</p>

- And in the case of `KRW-To-USD` button, again enter the amount to convert from won to dollar, then press the related button:

<p align="center">
  <img src="https://user-images.githubusercontent.com/24220136/224535416-1004e2ff-12d8-4329-981d-04a29754e1e5.png" alt="Image">
</p>

## [Implementation](https://github.com/af4092/USD-KRW-Currency-Converter/blob/main/DollarToWonConverter/src/Main.java)

- Code represents a simple currency converter application using `Java Swing` for the graphical user interface (GUI). Here's a general explanation of the code:
  - The code includes the necessary import statements for the required classes and packages.
  - The `Converter` class extends the `JFrame` class, which represents the main window of the application.
  - Inside the `Converter` class, there are various components defined as private member variables, including the content pane, text fields for currency rate and amount, a label for displaying the converted result, and strings for storing the currency rate and amount.
  - The constructor of the `Converter` class sets up the GUI window. It configures the frame title, icon image, size, and close operation. It creates a content pane, sets its layout to null, and adds various components to it (labels, text fields, buttons, and a result label).
  - Two buttons are created: `USD-To-KRW` and `KRW-To-USD`. These buttons have associated action listeners that respond when they are clicked. The action listeners retrieve the currency rate and amount entered by the user, create an instance of the `ConverterMethod` class, and call the appropriate methods to perform the currency conversion. The result is then displayed in the `lbDisplay` label.
  - The `ConverterMethod` class is not provided in the given code, so its implementation is missing. However, it can be assumed that this class handles the actual currency conversion calculations.
  - The `Main` class contains the `main` method, which is the entry point of the program. It creates an instance of the `Converter` class and makes it visible by invoking the `setVisible(true)` method.
