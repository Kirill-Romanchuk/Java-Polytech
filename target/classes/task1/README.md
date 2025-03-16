# CalculatorApp

CalculatorApp - это простой калькулятор на Java, реализованный с использованием паттерна "Команда". Ниже представлена структура проекта.

## Структура проекта

```plaintext
CalculatorApp/
├── src/
│   ├── cmd/
│   │   └── service/
│   │       └── Main.java
│   ├── commands/
│   │   ├── Command.java
│   │   ├── AddCommand.java
│   │   ├── SubtractCommand.java
│   │   ├── MultiplyCommand.java
│   │   └── DivideCommand.java
│   ├── invoker/
│   │   └── CommandInvoker.java
│   └── calculator/
│       └── Calculator.java
├── lib/                       
├── test/                      
│   └── commands/
│       ├── AddCommandTest.java
│       ├── SubtractCommandTest.java
│       ├── MultiplyCommandTest.java
│       └── DivideCommandTest.java
└── README.md
```


### Описание директорий:

| Папка          | Описание                                                                  |
|----------------|---------------------------------------------------------------------------|
| `src/`         | Основная директория с исходным кодом.                                   |
| `cmd/service/` | Содержит класс `Main`, который является точкой входа в приложение.      |
| `commands/`    | Содержит интерфейсы и классы для выполнения арифметических операций.     |
|                | - `Command.java`: Интерфейс для всех команд.                             |
|                | - `AddCommand.java`: Реализация команды сложения.                       |
|                | - `SubtractCommand.java`: Реализация команды вычитания.                 |
|                | - `MultiplyCommand.java`: Реализация команды умножения.                 |
|                | - `DivideCommand.java`: Реализация команды деления.                     |
| `invoker/`     | Содержит класс `CommandInvoker`, который управляет выполнением команд.   |
| `calculator/`  | Содержит класс `Calculator`, который выполняет арифметические операции.  |
| `lib/`         | (Необязательная) Директория для библиотек и зависимостей, если они есть.|
| `test/`        | (Необязательная) Директория для тестов, если они предусмотрены.          |
|                | - `commands/`: Тестовые классы для каждой команды.                      |
| `README.md`    | Описание проекта, включая информацию о его структуре, назначении и возможностях. |

