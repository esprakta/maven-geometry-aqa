![Java](https://img.shields.io/badge/Java-17-blue)
![Maven](https://img.shields.io/badge/Maven-3.10.0-orange)

# 📐 Maven Geometry Project

Учебный проект по Apache Maven, демонстрирующий создание multi-module Java-проекта с библиотекой геометрических фигур.

## 🎯 Цель проекта

Изучение работы с Maven: создание библиотек, управление зависимостями, версионирование, SNAPSHOT-версии и multi-module архитектура.

##  Технологии

- **Java 17**
- **Apache Maven 3.10.0**
- **IntelliJ IDEA**
- **Git & GitHub**

## 📦 Структура проекта

AQA_Maven_Tasks/
│
├── README.md
│
├── GeometryApp/ # Отдельное приложение (демонстрация)
│ ├── pom.xml
│ └── src/main/java/com/example/
│ └── App.java
│
└── GeometryProject/ # Multi-module проект
├── pom.xml # Родительский POM
│
├── GeometryLibrary/ # Модуль 1: 2D фигуры (v1.1.0)
│ ├── pom.xml
│ ── src/main/java/com/example/
│ ├── Circle.java # Круг (площадь, периметр, диаметр)
│ ├── Rectangle.java # Прямоугольник
│ └── Triangle.java # Треугольник (формула Герона)
│
├── GeometryUtils/ # Модуль 2: Утилиты (v1.1.0-SNAPSHOT)
│ ├── pom.xml
│ ── src/main/java/com/example/
│ └── GeometryUtils.java # Конвертация, сравнение фигур
│
└── ThreeDimensionalShapes/ # Модуль 3: 3D фигуры (v1.0.0-SNAPSHOT)
├── pom.xml
└── src/main/java/com/example/
├── Cube.java # Куб (объём, площадь поверхности)
└── Sphere.java # Сфера

## 🚀 Как запустить

### Вариант A: Запуск через IntelliJ IDEA

1. **Открой GeometryProject:**
   ```bash
   git clone https://github.com/esprakta/maven-geometry-project.git
   cd maven-geometry-project/GeometryProject

2. Собрать проект
mvn clean install

3. Открой GeometryApp отдельно:
File → Open → выбери папку GeometryApp

> Обнови зависимости в pom.xml GeometryApp (нажми на иконку Maven 🐘)

> Запусти App.java (зеленая стрелочка ▶️)

### Вариант B: Запуск через командную строку

1. Собери GeometryProject:
   ```bash
   cd GeometryProject
   mvn clean install

2. Запусти GeometryApp:
   ```bash
   cd ../GeometryApp
   
   mvn clean compile exec:java -Dexec.mainClass="com.example.App"

## Пример Вывода:

--- 2D Фигуры ---

Circle [radius=5.0, diameter=10.0, area=78.54, perimeter=31.42]
Диаметр круга: 10.0
Rectangle [width=4.0, height=6.0, area=24.0, perimeter=20.0]
Triangle [sides=3.0, 4.0, 5.0, area=6.0, perimeter=12.0]

--- 3D Фигуры ---

Cube [side=3.0, volume=27.0, surfaceArea=54.0]
Sphere [radius=5.0, volume=523.60, surfaceArea=314.16]

--- Утилиты ---

100 см = 1.0 метров
Сравнение площадей круга и прямоугольника: First figure is larger 

### 📚 Выполненные задания

✅ Задание 1: Создание библиотеки

- Создан проект GeometryLibrary с классами для геометрических фигур

- Каждая фигура имеет методы getArea() и getPerimeter()

✅ Задание 2: Создание приложения

- Создан проект GeometryApp, использующий библиотеку

- Демонстрация работы с объектами фигур

✅ Задание 3: Управление версиями

- Версия библиотеки обновлена: 1.0.0 → 1.1.0

- Добавлен новый метод getDiameter() в класс Circle

- Обновлена зависимость в приложении

✅ Задание 4: Multi-module проект и SNAPSHOT

- Создан родительский проект GeometryProject с тремя модулями

- Модуль GeometryUtils (утилиты) — версия 1.0.0-SNAPSHOT → 1.1.0-SNAPSHOT

- Модуль ThreeDimensionalShapes (3D фигуры) — версия 1.0.0-SNAPSHOT

- Подключение всех модулей к приложению GeometryApp

- Решение конфликтов зависимостей при обновлении версий
