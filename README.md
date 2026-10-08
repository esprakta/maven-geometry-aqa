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

---

## 📦 Структура проекта

Решение состоит из двух независимых частей:

### 1. `GeometryProject` (Multi-module библиотека)
Родительский проект, объединяющий три модуля:
* **`GeometryLibrary`** (v1.1.0) — базовые 2D фигуры: `Circle`, `Rectangle`, `Triangle`.
* **`GeometryUtils`** (v1.1.0-SNAPSHOT) — вспомогательные утилиты: конвертация единиц измерения, сравнение площадей.
* **`ThreeDimensionalShapes`** (v1.0.0-SNAPSHOT) — 3D фигуры: `Cube`, `Sphere`.

### 2. `GeometryApp` (Демонстрационное приложение)
Отдельный проект, который выступает в роли потребителя:
* Подключает все три модуля из `GeometryProject` как зависимости.
* Содержит класс `App.java` с методом `main`, который создает объекты фигур и выводит расчеты в консоль.

---

## 🚀 Как запустить

### Вариант A: Запуск через IntelliJ IDEA

### Способ 1: Через IntelliJ IDEA

1. Склонируй репозиторий:  
   `git clone https://github.com/esprakta/maven-geometry-aqa.git`
2. Открой папку `GeometryProject` в IDEA как проект (`File` → `Open`).
3. Открой терминал в IDEA и собери библиотеки:  
   `mvn clean install`
4. Открой папку `GeometryApp` в IDEA в **новом окне**.
5. Обнови зависимости Maven (нажми на иконку 🐘 в правом верхнем углу).
6. Запусти класс `App.java` (зеленая стрелка ▶️ рядом с `main`).

### Способ 2: Через командную строку

1. Собираем и устанавливаем модули в локальный репозиторий

`cd GeometryProject`

`mvn clean install`

3. Переходим в приложение и запускаем его

`cd ../GeometryApp`

`mvn clean compile exec:java -Dexec.mainClass="com.example.App"`

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
