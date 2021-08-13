#language:ru
#encoding:UTF-8
@login
Функционал: Проверка авторизации пользователя на сайте Swag Labs
  Сценарий:Проверка возможности перехода на страницу выбора товаров
  Допустим  открыта страница "https://www.saucedemo.com/"
    И в строку UserName ввели значение "standard_user"
    * в строку Password ввели значение "secret_sauce"
    * нажата кнопка "Login"
    Тогда открывается страница выбора товаров "https://www.saucedemo.com/inventory.html"