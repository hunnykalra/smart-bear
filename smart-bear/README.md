# Smart Bear

Smart Bear is a Java Spring Boot application that provides localized time formatting services for different countries. It demonstrates clean architecture and the use of design patterns such as the Strategy Pattern for extensible time calculation logic.

## Features
- REST API to get local time in a country-specific format
- Easily extensible for new countries and time formats
- Example implementation for British time

## Project Structure
```
src/main/java/com/smart/bear/
  controller/    # REST controllers
  pojo/          # Data objects
  service/       # Business logic and strategies
  utils/         # Utility classes
```

## API Usage
### Get Local Time
```
GET /localTime/{country}?time=HH:mm
```
- `country`: Supported values include `british` (add more as needed)
- `time`: Time in `HH:mm` format

#### Example
```
GET /localTime/british?time=14:30
```

## Design Patterns Used
- **Strategy Pattern**: For country-specific time formatting logic (see `service/` directory).

## Setup & Run
1. **Clone the repository**
2. **Build the project**
   ```
   ./gradlew build
   ```
3. **Run the application**
   ```
   ./gradlew bootRun
   ```
4. **Access the API** at `http://localhost:8080/localTime/{country}?time=HH:mm`

## Extending
To add support for a new country:
1. Implement a new strategy class in `service/` (e.g., `FrenchTimeStrategy`).
2. Update the controller to use the new strategy.

## License
MIT (or specify your license)