# Промежуточная аттестация
## Часть 1
> Работа с Linux представлена в виде скриншотов
> терминала, оформленных в PDF файле - [Linux](Linux/WorkWithLinux.pdf)
## Часть 2
> Проект реализован следующим образом: в файле *Presenter* 
> имеется поле со списком игрушек. Список игрушек, в свою очередь,
> представляет собой класс *ListToys*, в котором содержатся все нужные для проекта методы.
> Для выделения общей модели  создан класс - *Toy*, который содержит в себе информацию о игрушках, и несколько методов
> для работы с ними.
> С помощью метода *getData()*, который имплементирован из отдельно созданного интерфейса
>*View* , происходит взаимодействие с пользователем через терминал. 

### Структура проекта:
**Точка запуска программы - [App](App.java)**
* Класс игрушек - [Toy](Model/Toy.java)
* Отдельный класс для предоставления ID - [Identificate](Model/Identificate.java)
* Список Игрушек - [ListToys](Model/ListToys.java)
* Класс презентер, для связывания информации о игрушках и данных от пользователя - [Presenter](Presenter/Presenter.java)
* Интерфейсы
  * Интерфейс для записи разыгранной игрушки в файл - [GetToyInFile](Interfaces/GetToyInFile.java)
  * Интерфейс для формирования списка игрушек по умолчанию - [GetToys](Interfaces/GetToys.java)

