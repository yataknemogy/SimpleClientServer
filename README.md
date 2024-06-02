# Single-Threaded Client-Server

---

**Server.java:**

- **Creating a Server Socket:** In your programming language, create a server socket object. Define the port that the server will listen on.
- **Waiting for Client Connection:** Use the `accept()` method of the server socket to wait for a client connection. When a client connects, a new socket is created for data exchange with the client.
- **Creating I/O Streams:** Create streams for reading data from the client and writing data back to the client through the socket.
- **Processing Data:** In an infinite loop, read data from the client, send the same data back, and continue this process until the client disconnects.
- **Closing the Connection:** After the data exchange is complete, close the I/O streams and sockets.

---

**Client.java:**

- **Creating a Client Socket:** Create a client socket specifying the server's address and port to connect to.
- **Creating I/O Streams:** Create streams for reading data from the console and for reading/writing data through the socket.
- **Reading User Input and Sending to Server:** In an infinite loop, read user input from the console and send it to the server through the client socket.
- **Receiving Response from Server and Displaying:** Read the response from the server through the client socket and display it on the screen.
- **Closing the Connection:** After the data exchange is complete, close the I/O streams and client socket.

---
