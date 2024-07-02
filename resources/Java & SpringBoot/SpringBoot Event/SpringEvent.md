![img.png](img.png)

Abhilash Lecture:-
https://www.youtube.com/watch?v=xkWTO5M51FA [EP: 1]
https://www.youtube.com/watch?v=TwJ2Zbk28QM [EP: 2]

Event :- Whenever any activity needs to be trigger then we initiates using event.
Advantages:-
![img_4.png](img_4.png)
- It is notifying the listners (Users)
- There is not tight coupling between publisher and listners.



Ex:- 
When Transaction failed, trigger a sms, email to the customer.
When anyone is logging failed then event can be started.


=> defining multiple listners
![img_1.png](img_1.png)

=> listen to multiple events
   We can listen to multiple events using the @EVENTLISTENER ANNOTATION
![img_2.png](img_2.png)
It has a con's as if we are listing multiple events using EVENTLISTNER then we can use event based fields, 
Ex: In above Diagram we can see start method (which can be any naming convention), can not define getName etc of event class based variables

=> Exception due to @EVENTLISTNER
![img_3.png](img_3.png)
We can't define a @EventListener without an event as the argument.
means, in above example we need to EventListner as argument in start method or need to define in the annotation otherwise 
we will get exception

# we can use predefined Events using ApplicationEvent 
![img_7.png](img_7.png)


What is Synchronus?
=> One thread will wait till to complete other thread work, basically one thread will access resource at a time only.

# Sync VS Async call for event handling based on Listners

![img_5.png](img_5.png)
In above image, if we are calling Async listners then if block would be executed, otherwise else block.
Note:- firstly spring will check for all beans and if bean with name application_event_multicaster would be found means
it is a multithreaded (Async) call otherwise, in Sync call with by default class name SimpleApplicationEventMultiCaster
![img_6.png](img_6.png)
Async => ApplicationEventMultiCaster [Interface] [All listners are working in the separate thread], we need to define in
SimpleApplicationEventMultiCaster as Async by defing bean with ApplicationEventMultiCaster
sync => SimpleApplicationEventMultiCaster [Class]
 