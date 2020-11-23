The program will connect the input threads into one single thread and returns the min possible cost required to connect all threads.Given the conditions,
- We can connect only 2 threads at a time. 
- The cost required to connect 2 threads is equal to sum of their lengths. 
- The length of this connected thread is also equal to the sum of their lengths.
- This process is repeated until all the threads are connected into a single thread. 

Example Inputs:
-
- [4, 6, 8, 12]
- [20, 4, 8, 2]

Prerequisites
-
- Java 8
- maven
- junit



In Local  (non-docker env)
-
After cloning the repo,
Build using the below commands:
- `mvn clean install`
- `mvn clean package`

Run the Program 
-
Run the main program "ConnectThreads.java"

Test the Program
-
Run the tests:
- mvn test