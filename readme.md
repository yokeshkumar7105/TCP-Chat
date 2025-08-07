# Simple TCP Chatting Simulation using Java
This project is a simple text-based chat application that enables bi-directional communication between a client and a server using TCP sockets. The client and server can send and receive messages in turns, allowing real-time text messaging over a network connection. It demonstrates the fundamentals of socket programming and how two systems can communicate through a reliable, connection-oriented protocol.

## Working
This repository contains two Java programs.

✅talkServer.java

- This is the server-side program that:

- Listens for a client on port 1234.

- Accepts connection from the client.

- Waits to receive messages from the client.

- Prints the client's message to the console.

- Allows the server user to type a response, which is sent back to the client.

- If either party types "exit", the connection is closed.

✅ talkClient.java
- This is the client-side program that:

- Connects to the server at IP 127.0.0.1 (localhost) and port 1234.

- Takes user input from the keyboard.

- Sends the message to the server.

- Waits for the server’s reply and prints it.

- Repeats until the user stops entering messages.

## Communication Flow

```
Client                Server
  |  ---> Message --->  |
  |  <--- Reply   <---  |
  |  ---> Message --->  |
  |  <--- Reply   <---  |
  ... until one side sends "exit"
```

## ScreenShot for Reference

<img width="1264" height="464" alt="image" src="https://github.com/user-attachments/assets/4fac6660-ca68-415b-bf31-d6acdf06d5c3" />

## Video of Simulation 

https://github.com/user-attachments/assets/fea87a64-1208-40d0-9eab-12302287d670

## Installation or Implementation 

1. Split the terminal and compile the files separately
```
javac talkClient.java //run in terminal 1
javac talkServer.java // run in terminal 2
```

2. Run the files by starting the server
```
java talkClient.java // in terminal 1
java talkServer.java // in terminal 2
```

3. Simulation begins chat between client and server is established

