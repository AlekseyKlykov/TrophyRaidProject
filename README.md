<h1>Домашнее задание Трасса трофи-рейда</h1>

<h4>В данной работе при реализации классов был применен паттерн абстрактная фабрика,прототип,строитель и стратегия.
<br>
Класс PassengerCar имплементирует интерфейс iPassengerCar который является расширением интерфейса iCar(В  данном проекте машина = участнику). Класс PassengerCar содержит в
<br> себе следующие поля:
<br>
private String brand - бренд автомобиля;<br>
private String model - модель автомобиля;<br>
private String stateNumber - гос. номер;<br>
private String color - цвет машины;<br>
private String horsepower - лошадиные силы;<br>
private int fuelReserve - запас топлива;<br>
private float averageSpeedKmPerHour - средняя скорость машины(используется для расчета затраченного времени);<br>
private boolean trunk - наличие багажника;<br>
private float timeSpent - затраченое время;<br>
private String name - имя участника;<br>
Помимо геттеров и сеттеров данный класс содержит метод decisionSkip который возвращает True или False(используется  для решения пропустить КП или же нет)<br> и метод iCar clone() для клонирования объекта<br>
Все методы за исключением методов для работы с полем trunk(имплементация iPassengerCar) являются имплементацией интерфейса iCar.<br>

Класс Truck является имплементацией интерфейса iTruck который расширяет интерфейс iCar<br>
Все поля аналогичны классу PassengerCar(кроме поля trunk) за исключением поля private float bodyHeight которое хранит высоту кузова<br>

Класс CarFactoryImpl имплементирует интерфейс CarFactory реализуя следующие методы:<br>
public iTruckBuilder createTruck() - возвращает объект строителя для инициализации объекта класса Truck<br>
public iPassengerBuilder createPassengerCar() - возвращает объект строителя для инициализации объекта класса PassengerCar<br>

Класс ObligatoryControlPoint имплементирует интерфейс ControlPoint и содержит следующие поля:<br>
private String name - наименование КП;<br>
private float   latitude - широта;<br>
private float longitude - долгота;<br>
private boolean parkingForRecreation - места для отдыха;<br>
private boolean parkingForRepairs - места для ремонта;<br>
private float kmToCheckpoint - км до КП;<br>

Класс OptionalControlPoint является имплементацией интерфейса ControlPointPenalty который в свою очередь является расширением интерфейса ControlPoint.<br> Кроме полей указанных в предыдущем классе имеет поле penalty которое хранит в себе штраф в минутах(в случае если машина-участник пропустит КП данный штраф прибавится к затраченному времени)<br>

Класс ControlPointFactoryImpl  имплементирует интерфейс ControlPointFactory реализуя следующие методы:<br>
public ObligatoryControlPointBuilder createObligatoryControlPoint() - возвращает объект строителя для инициализации объекта класса ObligatoryControlPoint;<br>
public OptionalControlPointBuilder createOptionalControlPoint() - возвращает объект строителя для инициализации объекта класса OptionalControlPoint;<br>

Вся основная логика программы реализована в классе Run.<br>
Данный класс имеет методы:<br>
public void Start() - запускает "гонку" и производит вычисления связанные с затраченным временем машин-участников;<br>
public void displayResult() - выводит на экран информацию каждой машины-участника(с затраченным временем);<br>
public void displayWinner() - выводит на экран победителя;<br>
А также содержит:
private List<iCar> car - содержит список объектов машин-участников;
private List<ControlPoint> cp - содержит список объектов КП;

Пример инициализации объекта  машины-участника с помощью "строителя":<br>
![image](https://github.com/user-attachments/assets/8f7228d5-fc8e-43b0-b835-5b6aa776af30)
Пример клонирования объекта:<br>
![image](https://github.com/user-attachments/assets/1fddc0e9-79c4-40bf-8956-75c6c964ff41)

Вывод работы программы:

![image](https://github.com/user-attachments/assets/7cfe161f-7449-4b25-a161-d0275595642f)


<h4>



