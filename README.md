# Codility
Code Test
This program solves the programming assignment given to me by viagogo.
It needs no settings, the user just need to pull these files in the same directory and run World.java

Working methodology:-
The world has a list of events with coordinates,id and a distance as its internal variable. The event class has a list of tickets that
are present in a Treeset to keep them always sorted by price. Moreover, The event class also implements comparator so that it can be later
sorted on the basis of distance.

When the user inputs coordinates in a two dimensional space, the the distance variable of the events that we already have happening is set.
Then the event list is sorted by distance so that we have a list of events sorted by distance from the point entered by the user.
Then i simply return the 5 closest parties and their ticket prices.

Thankyou!

Please not that for now if we put two events at the same location, my program considers those two and return the cheapest first, but 
if needed this functionality can easily be altered as per requirements.

QnA's
1. How might you change your program if you needed to support multiple events at the
same location?
If i needed to support multiple events, i would have created a class called 'Location' which would have the list of events. Now these events
would be kept in hashmaps and the key i would use would be the lowest ticket price to that event. Hashmap would be used because since we are dealing 
with more data and complexity, the time of query could be reduced.

2. How would you change your program if you were working with a much larger world
size?
Since i have followed object oriented principles my implementation would not change if i need to deal with larger world sizes. This
implementation works well till (Integer.MAX) since after that i will have to modify my variable types to double.
