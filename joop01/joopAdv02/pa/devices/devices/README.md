# Devices

## Learning Objective:
- Implement inheritance


You have been tasked with developing an application that tracks the various mobile devices we use on a daily basis.

Your first task is to create a Device class that has the battery attribute. Each device should start with a battery value of 100. Next, create a method that displays how much battery life the device has.

Now create a Phone class that extends the Device class. The Phone has the ability to make a call, play a game, or charge. Each method should print the action to the console, followed by the remaining amount of battery.

Making a call should decrease the battery by 5.
Playing a game should decrease the battery by 20.
Charging should increase the battery by 50.
Instantiate the Phone class and perform the following actions:

Make three phone calls.
Play a game twice.
Charge the phone.
Example:

Calling the playGame method, should have the following output:

You play a game.
Battery remaining: 80






Create a Device class with a battery attribute and status method.

Create a Phone class that extends the Device class and has the following three methods: makeCall, playGame, and charge.

Create a 'DeviceTest' test class and instantiate the Phone class.

Call the makeCall method three times, the playGame method twice, and the charge method once.

Ninja Bonus 1: Add a 'battery critical' message to your Phone class that is displayed when the battery falls below 10.

Ninja Bonus 2: Don't allow the user to play a game if the battery life is below 25.

