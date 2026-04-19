# Event Demo API

A simple Spring Boot backend I built to learn how REST APIs and the Controller-Service-Model pattern work. Right now, it just serves some hardcoded event data as JSON.

## Tech Stack
* Java 17+
* Spring Boot
* Maven

## How to run it

You just need Java installed. You don't even need Maven installed globally since the project uses the wrapper.

1. Clone this repo.
2. Open your terminal in the project folder.
3. Run the app:
   * **Mac/Linux:** `./mvnw spring-boot:run`
   * **Windows:** `.\mvnw spring-boot:run`

The server will spin up on `http://localhost:8080`.

## Endpoints

You can hit these directly in your browser or use a tool like Postman.

| Method | URL | What it does |
| :--- | :--- | :--- |
| `GET` | `/api/events` | Grabs the full list of events. |
| `GET` | `/api/events/{id}` | Grabs a single event (e.g. `/api/events/1`). |

**Example output:**
```json
{
  "id": 1,
  "name": "Cooking Masterclass",
  "location": "Esbjerg",
  "price": 150.0
}
