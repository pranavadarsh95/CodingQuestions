Time Complexity:- https://www.freecodecamp.org/news/big-o-cheat-sheet-time-complexity-chart/

    O(1) - Constant time
    O(log(n)) - Logarithmic time
    O(n log(n)) - Linearithmic time
    O((log(n))c) - Polylogarithmic time
    O(n) - Linear time
    O(n2) - Quadratic time (comes under Polynomial)
    O(nc) - Polynomial time
    O(cn) - Exponential time
    O(n!) - Factorial time

Note:- Exponential (c^n) >>>> polynomial (n^c)

circuit breaker [Below covered]
java version differences
where had we deployed our code (AWS cloud EC2) [Below covered]
multithreading [whole folder is there]

======================================================================================
Rate limitter:-
https://leetcode.com/discuss/interview-question/system-design/124558/Uber-or-Rate-Limiter
leaky bucket
sliding window


concurrency in java :-
https://www.vogella.com/tutorials/JavaConcurrency/article.html
[A visibility problem occurs if thread A reads shared data which is later changed by thread B and thread A is unaware of this change.]
======================================================================================
Convert String to charArray then sort then store it in New String

char tempArray[] = str.toCharArray();
Arrays.sort(tempArray);
String sortedStr = String.valueOf(tempArray);

======================================================================================
Declare and initialize Map which has Key=> String and value => ArrayList<String>

str is String
Map<String,ArrayList<String>> map  = new HashMap<>();
map.put(sortedStr,new ArrayList<String>(Arrays.asList(str)));

======================================================================================
Declare ArrayList within ArrayList and declare memory for internal ArrayList as
public class BfsPart2 {
    int v;
    ArrayList<ArrayList<Integer>> adjList;

    BfsPart2(int v) {
        this.v = v;
        adjList = new ArrayList<>();

        for (int i = 0; i < v; i++) {
            adjList.add(i, new ArrayList<>()); // on index "i" insert element which is new ArrayList<>()
        }
    }
 }

======================================================================================
SubSequences vs Subarray [Both should have order] striver recurssion lecture 6

a[] = {1,2,3}

SubSequences (Contiguous/non-contiguous) [1], [2], [3], [1 2], [2 3], [1 3], [1 2 3]
SubArray (Contiguous) [1], [2], [3], [1 2], [1 3(NO)], [2 3] , [1 2 3]


======================================================================================
If we have given ArrayList<int[]> output;
1) if Asked for last element of arraylist based 1st index of array then
output.get(output.size()-1)[1];
2) if Asked to update that element that same as above
Ex:-
output.get(output.size()-1)[1] = anyValue;

3) If we have to return "int[][]" from method whereas we have
ArrayList<int[]> output = new ArrayList<int[]>();
then
 return output.toArray(new int[output.size()][]);

======================================================================================
Comparator vs Comparable and BinarySearch and Sort methods
https://docs.google.com/document/d/1REFGrpRjfMp15TsvQg4s2n5vBMm97qsY9UK9lD1GDdM/edit

for a list :- [to get elements in descending order]
Collections.sort(list, Collections.reverseOrder());
for an array :- [to get elements in descending order]
Arrays.sort(array, Collections.reverseOrder());

 This method sorts the specified range of array in ascending order.
 // To sort the array using normal sort
        Arrays.sort(intArr, 1, 3); [fromIndex,EndIndex] 1 index->included, 3 index->Excluded

These methods search for the specified element in the array with the help of Binary Search algorithm.
Arrays.binarySearch(intArr, intKey));

This method searches a range of the specified array for the specified object using the binary search algorithm.
Arrays.binarySearch(intArr, 1, 3, intKey)); 1 index->included, 3 index->Excluded

This method assigns this fillValue to each index of this Arrays.
// Get the Arrays
        int intArr[] = { 10, 20, 15, 22, 35 };
        int intKey = 22;
Arrays.fill(intArr, intKey);
// To fill the arrays
        System.out.println("Integer Array on filling: "
                           + Arrays.toString(intArr));
Output: Integer Array on filling: [22, 22, 22, 22, 22]

======================================================================================
Store array into 2*size to make it circular array
 for (int i = 0; i < n * 2; i++) {
            temp[i] = nums[i % n];
        }

        Note:- i starts from zero(0) 'n' which is actual size of Array
======================================================================================
when number as n = 123 given and need to put in array from starting to last index as per digit
 void fillArrayList(int n, ArrayList<Integer> digits){
        if(n<=0) return;
        int d = n % 10;
        fillArrayList(n/10,digits);
        digits.add(d);
    }
======================================================================================
Collections.sort(list.subList(0,3)); // Sorting a part of list
Collections.reverse(arrayList);
======================================================================================
Dutch national Flag Algorithm ex:- https://www.youtube.com/watch?v=oaVa-9wmpns&list=PLgUwDviBIf0rPG3Ictpu74YWBQ1CaBkm2&index=4
https://leetcode.com/problems/sort-colors/submissions/877393842/

======================================================================================
Convert row to column or vice-versa for 2D matrix
 for(int i=0;i<rowNum;i++){
                for(int j=0;j<i;j++){
                    int t = matrix[j][i];
                    matrix[j][i] = matrix[i][j];
                    matrix[i][j] = t;
                }
            }
======================================================================================
Power function in java
public static double pow(double a, double b)
Parameter:
a : this parameter is the base
b : this parameter is the exponent.
Return :
This method returns a^b
Math.power(a,b);
======================================================================================
If we need to fill any 2D array with any default value
// note:- here a represent each row of 2d array
Arrays.stream(array_name).forEach(a-> Arrays.fill(a,-1));
======================================================================================
 // Integer/String is a class which can be used to reverse
 Integer i[] = {1,2,3,4,5,6};
 Collections.reverse(Arrays.asList(i));
 System.out.println(Arrays.toString(i));
 // output :- [6, 5, 4, 3, 2, 1]

 Below won't work
 int i[] = {1,2,3,4,5,6};
  Collections.reverse(Arrays.asList(i));
  System.out.println(Arrays.toString(i));
 // output :- [1, 2, 3, 4, 5, 6]

 ======================================================================================
 String is immutable whereas StringBuffer and StringBuilder are mutable classes.
 StringBuffer is thread-safe and synchronized whereas StringBuilder is not.
 That's why StringBuilder is faster than StringBuffer.

 ======================================================================================
 code deployment

     Cloud Services Code Deployment:

         Imagine a City with Services: Think of a city where you have different services like electricity, water, and garbage collection all provided by the city government.

         Cloud Providers are like City Governments: Cloud service providers like Amazon Web Services (AWS), Microsoft Azure, and Google Cloud Platform (GCP) are like these city governments. They offer various services like computing power, storage, and databases that companies can rent and use.

         Code Deployment is like Building a House: When a company wants to deploy its code (like building a house), it can rent space (servers) from these cloud providers and upload its code to run on these rented servers. The cloud provider takes care of managing and maintaining these servers, just like the city government takes care of managing utilities.

         Advantages: It's convenient because companies don't need to worry about buying and maintaining their own servers. They can easily scale up or down based on their needs by renting more or fewer resources from the cloud provider.

     Containerized Environment:

         Think of Shipping Containers: Imagine you have different items to transport, like furniture, electronics, and clothes. Instead of putting them directly in a truck, you pack them into standardized shipping containers.

         Containers are like Standardized Boxes: Containers in the tech world are like these standardized shipping containers. They package up everything your code needs to run, including the code itself, libraries, and other dependencies.

         Containerized Deployment is like Shipping: Deploying code in a container is like shipping these containers to different places. You can easily move them around, whether it's from your laptop to a server or from one cloud provider to another.

         Advantages: Containers provide consistency and flexibility. They ensure that your code runs the same way no matter where it's deployed. They also make it easier to manage and scale your applications because you can run multiple containers on the same server or spread them across multiple servers.

         ======================================================================================
CIRCUIT BREAKER

Imagine a large e-commerce platform with multiple microservices responsible for different functionalities such as user authentication, product catalog, order processing, and payment processing. Each microservice communicates with others over the network.

Now, let's focus on the payment processing microservice, which interacts with a third-party payment gateway to process transactions. Due to the nature of network communication and external dependencies, there's a possibility that the payment gateway might experience issues such as downtime, latency, or timeouts.

To handle such scenarios and improve the resilience of the system, the payment processing microservice could implement a circuit breaker pattern. Here's how it might work:

    Closed State: Initially, the circuit breaker is in a closed state, allowing requests to be forwarded to the payment gateway as usual.

    Failure Monitoring: The circuit breaker monitors the responses from the payment gateway. If the number of failed requests surpasses a certain threshold within a specified timeframe (e.g., consecutive timeouts or errors), the circuit breaker trips and transitions to an open state.

    Open State: In the open state, the circuit breaker prevents any further requests from being sent to the payment gateway. Instead, it immediately returns a predefined error response or triggers a fallback mechanism, such as using a cached payment method or displaying a friendly error message to the user.

    Timeout and Retry: After a specified timeout period, the circuit breaker transitions to a half-open state. During this time, it allows a limited number of test requests to pass through to the payment gateway to check if it has recovered.

    Closed State (Recovery): If the test requests succeed, indicating that the payment gateway is operational again, the circuit breaker transitions back to the closed state, and normal operation resumes. However, if the test requests continue to fail, the circuit breaker remains open, and the cycle repeats.

By implementing a circuit breaker in the payment processing microservice, the e-commerce platform can prevent cascading failures, improve fault tolerance, and provide a better user experience by gracefully handling issues with the external payment gateway. This ensures that the platform remains operational even when external dependencies encounter problems.

         ======================================================================================

         ======================================================================================

         ======================================================================================

         ======================================================================================

         ======================================================================================

         ======================================================================================