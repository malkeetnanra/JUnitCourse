🧪 JUnitCourse

A hands-on Java project designed to demonstrate and practice unit testing using JUnit 5. This project is ideal for developers learning how to write effective and maintainable tests in Java.

📚 What You'll Learn:

✅ Writing basic and advanced unit tests using JUnit 5
✅ Using assertions like assertTrue, assertFalse, assertEquals, assertThrows, etc.
✅ Structuring test classes and methods
✅ Testing exceptions and edge cases
✅ Using assumptions and preemptive timeouts
✅ Integrating with Gradle for test automation


🛠️ Technologies Used:

☕ Java 21
🧪 JUnit 5 (Jupiter)
⚙️ Gradle 8.10
💻 IDE: IntelliJ IDEA (recommended)


📁 Project Structure:

JUnitCourse/
├── build.gradle
├── settings.gradle
├── src/
│   ├── main/         # (Optional) Application code
│   └── test/         # JUnit test classes
│       ├── AssertFalseDemo.java
│       ├── AssertTrueDemo.java
│       ├── AssertNotEquals.java
│       ├── AssertingExceptions.java
│       ├── AssumptionsDemo.java
│       └── ...


🚀 Getting Started:

🔧 Prerequisites
Java JDK 21+
Gradle installed or use the included gradlew wrapper

▶️ Run Tests

📄 Test reports will be generated at:
build/reports/tests/test/index.html

🧪 Sample Test

@Test
void assertForFalse() {
     String test = "I love Java";
     Assertions.assertFalse(test.startsWith("J"), "Test assertFalse failed");
     }


📄 License
This project is based on coursework from a Udemy course(@EmbarkX) and is intended for educational purposes only.
Original content and structure may belong to the course instructor.
Please refer to the course or instructor for licensing terms of the original material.

🙋‍♂️ Author
Malkeet Nanra

🔗 [GitHub Profile](https://github.com/malkeetnanra/)🧪 JUnitCourse

A hands-on Java project designed to demonstrate and practice unit testing using JUnit 5. This project is ideal for developers learning how to write effective and maintainable tests in Java.

📚 What You'll Learn:

✅ Writing basic and advanced unit tests using JUnit 5
✅ Using assertions like assertTrue, assertFalse, assertEquals, assertThrows, etc.
✅ Structuring test classes and methods
✅ Testing exceptions and edge cases
✅ Using assumptions and preemptive timeouts
✅ Integrating with Gradle for test automation


🛠️ Technologies Used:

☕ Java 21
🧪 JUnit 5 (Jupiter)
⚙️ Gradle 8.10
💻 IDE: IntelliJ IDEA (recommended)


📁 Project Structure:

JUnitCourse/
├── build.gradle
├── settings.gradle
├── src/
│   ├── main/         # (Optional) Application code
│   └── test/         # JUnit test classes
│       ├── AssertFalseDemo.java
│       ├── AssertTrueDemo.java
│       ├── AssertNotEquals.java
│       ├── AssertingExceptions.java
│       ├── AssumptionsDemo.java
│       └── ...


🚀 Getting Started:

🔧 Prerequisites
Java JDK 21+
Gradle installed or use the included gradlew wrapper

▶️ Run Tests

📄 Test reports will be generated at:
build/reports/tests/test/index.html

🧪 Sample Test

@Test
void assertForFalse() {
     String test = "I love Java";
     Assertions.assertFalse(test.startsWith("J"), "Test assertFalse failed");
    }


📄 License
This project is based on coursework from a Udemy course(@EmbarkX) and is intended for educational purposes only.
Original content and structure may belong to the course instructor.
Please refer to the course or instructor for licensing terms of the original material.

🙋‍♂️ Author
Malkeet Nanra

🔗 [GitHub Profile](https://github.com/malkeetnanra/)
