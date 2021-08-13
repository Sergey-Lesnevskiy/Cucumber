#language:ru
#encoding:UTF-8
@page
Функционал: Проверка поиска информации в Google

  Сценарий:Проверка, первая ссылка в Google по запросу swag labs,ведёт на сайт https://www.saucedemo.com/
    Допустим  открыта страница "https://www.google.com/"
    И в строку поиска ввели значение "swag labs"
    * нажата кнопка "Поиск в Google"
    Тогда первая ссылка называется "Swag Labs"
    И выполнено нажатие на ссылку "Swag Labs"
    И открывается сайт "https://www.saucedemo.com/"
