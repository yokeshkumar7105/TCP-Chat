# Simple TCP Chatting Simulation using Java
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


<img width="1264" height="464" alt="image" src="https://github.com/user-attachments/assets/4fac6660-ca68-415b-bf31-d6acdf06d5c3" />
