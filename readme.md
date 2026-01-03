# 🌍 GeoAQI Engine: Global Air Quality Monitor

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![Spring](https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white)

**GeoAQI Engine** is a full-stack Java application that provides real-time Air Quality Index (AQI) data for any location on Earth. Built with **Spring Boot** and **Leaflet.js**, it features an interactive map where users can search for cities, locate themselves via GPS, and view detailed environmental health data.

## 🚀 Features

* **Interactive Map:** Click anywhere on the world map to get instant AQI data.
* **Real-time Data:** Integrated with the WAQI (World Air Quality Index) API.
* **GPS Localization:** "Locate Me" feature to find AQI at your current position.
* **City Search:** Built-in geocoder to jump to any city globally.
* **Dual Layers:** Switch between Standard Street view and Satellite World imagery.
* **Smart UI:** Dynamic color-coded popups and a professional AQI risk legend.
* **Loading States:** CSS animations for a smooth user experience.

---

## 🛠️ Tech Stack

| Layer       |      Technology                  |
| :-----------| :--------------------------------|
| **Backend** | Java 17+, Spring Boot 3.x, Maven |
| **Frontend**| HTML5, CSS3, JavaScript (ES6)    |
| **Maps**    | Leaflet.js, Esri World Imagery   |
| **API**     | WAQI (World Air Quality Index)   |

---

## 📂 Project Structure

```text
GeoAQI-Engine/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/example/aqi/
│   │   │       ├── AqiApplication.java  (Main Entry)
│   │   │       ├── controller/          (API Endpoints)
│   │   │       └── service/             (Logic & External API calls)
│   │   └── resources/
│   │       └── static/
│   │           └── index.html           (Frontend Dashboard)
└── pom.xml                              (Project Dependencies)
```

---

## ⚙️ How to Run

1. Clone the project to your local machine.

2. Ensure you have Maven and Java 17+ installed.

3. Open a terminal and Navigate to the project root and run:

```bash
mvn clean install
mvn spring-boot:run
mvn clean install
```

4. Open your browser and visit: http://localhost:8080

---

## 🎨 AQI Scale Reference

The application follows the WHO Global Standards:

🟢 0-50: Good (Low Risk)

🟡 51-100: Moderate

🟠 101-150: Unhealthy for Sensitive Groups

🔴 151-200: Unhealthy

🟣 201-300: Very Unhealthy

🟤 300+: Hazardous

---

## 👨‍💻 Author
Meet Potdar, Full-Stack Developer

<p align="center">
  <img src="screenshot 001.png" width="600" title="GeoAQI Engine">
</p>

---