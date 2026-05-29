## Smart Hospital Queue Management System

# Project Overview
The Smart Hospital Queue Management System is a Java-based Object-Oriented Programming (OOP) project designed to simulate and manage hospital queue operations intelligently.
The system helps hospitals manage:
- Patient queues
- Service counters
- Waiting times
- Emergency prioritization
- Queue overload analysis
- Hospital service recommendations
The project demonstrates real-world use of:
- Encapsulation
- Inheritance
- Polymorphism
- Abstraction
- Packages
- Exception Handling
- ArrayList
- Constructors
- Getters and Setters
- Method Overriding
## Main Idea of the System
Hospitals often face:
- Long waiting times
- Emergency overload
- Poor queue organization
- Limited service counters
- Patient frustration
This system simulates a smart queue management environment that:
- Registers patients
- Assigns them to queues
- Tracks waiting time
- Prioritizes emergency patients
-Simulates service counters
- Analyzes queue traffic
- Generates recommendations for hospital management
The system can also be adapted for:
- Universities
- Airports
- Cafeterias
- Customer support centers
- Registration systems
  ## Features
# Patient Registration
- Patients can:
- Enter their name
- Select department
- Enter patience level
**Example departments:
- Emergency
- Pharmacy
- Registration
- VIP
## Queue Management
The system:
- Adds patients into queues
- Tracks waiting order
- Prioritizes emergency patients
- Displays queue status
## Service Counter Simulation
The system simulates hospital counters.
Examples:
Counter 1 serving Emergency
Counter 2 serving Pharmacy
Counter 3 serving Registration
## Analysis System
The HospitalAnalyzer class:
- Counts total patients
- Detects emergency overload
- Calculates average patience
- Generates recommendations
Example recommendations:
- Add more emergency staff
- Increase service counters
- Reduce waiting time
## Warning System
The system can display warnings such as:
Emergency queue overloaded
Long waiting times detected
High patient traffic detected
## Project Structure
SmartHospitalSystem/ │ ├── src/ │ ├── analysis/ │ │ └── HospitalAnalyzer.java │ │ │ ├── model/ │ │ ├── Patient.java │ │ ├── VIPPatient.java │ │ └── EmergencyPatient.java │ │ │ ├── service/ │ │ ├── QueueManager.java │ │ ├── ServiceCounter.java │ │ └── SimulationEngine.java │ │ │ ├── util/ │ │ └── InputValidator.java │ │ │ └── Main.java │ └── .github/ └── workflows/ └── ci.yml 
## OOP Concepts Used
# Encapsulation
Private fields with getters and setters are used to protect patient data.
# Inheritance
Specialized patient classes inherit from the base Patient class.
# Polymorphism
Different patient types are handled using common parent references.
  # Abstraction
The system separates implementation details into classes and services.
## Technologies Used
Java
VS Code
GitHub
GitHub Actions
## GitHub Actions CI Pipeline
This project includes an automated CI pipeline using GitHub Actions.
The pipeline automatically:
- Compiles the project
- Runs the application
- Detects build failures
- Validates project structure
This improves reliability and demonstrates professional software engineering practices.
## How to Run the Project
- Compile
javac -d out $(find src -name "*.java") 
- Run
java -cp out Main 
## Sample Simulation
Example scenario:
- Abeba enters Emergency queue
- Sara enters Pharmacy queue
- Emergency queue becomes overloaded
- System generates warning
- Analyzer recommends adding more emergency staff
## Future Improvements
Possible future upgrades:
- GUI interface
- Database integration
- Real-time dashboards
- AI-based prediction system
- Mobile application support
- Rush-hour prediction engine
## Conclusion
The Smart Hospital Queue Management System demonstrates how Object-Oriented Programming can solve real-world organizational problems.
The system improves:
- Queue efficiency
- Service management
- Hospital decision-making
- Patient experience
It also demonstrates practical software engineering concepts through simulation, analysis, and automation.
