# Hello Human

You are tasked to build a page that will greet whoever visits your page. If they don't tell you their name, then greet them as "human".

## Learning Objectives:
- Use URL strings to pass [query parameter](https://login.codingdojo.com/m/315/9532/64273) values to the server
- Use data passed to the server through request parameters in a response to the client

## Assignment
Create an app that will show in the browser either a default value of "human" or the name provided in the URL query string. Please note, you may show simple text without any html formatting.


Ninja Bonus (Optional):

Can you include a "last name" as a parameter and print out both the first and last names?

Sensei Bonus (Optional):

Include a route that takes a parameter times and returns a string that repeats the greeting that many times on the page.



- [ ] Create an app that displays a greeting message. [HelloHumanController.java](./hello-human/src/main/java/co/tylermaxwell/hellohuman/controllers/HelloHumanController.java)

- [ ] 'Hello human' should be displayed if no name is provided in the URL.

- [ ] 'Hello Khoa' should be displayed if 'Khoa' is provided in the URL. This should also work with any other names.

- [ ] Ninja Bonus 1: Include a "last_name" as a parameter and print out both the first and last names.

- [ ] Ninja Bonus 2: Add a "times" parameter and show the greeting that many times.