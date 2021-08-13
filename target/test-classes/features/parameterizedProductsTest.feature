#language:ru
#encoding:UTF-8
@test @products
Функционал: Параметризированный запуск тестов

  Структура сценария: Проверка цены товаров<productName>
    Допустим открыта страница "https://www.saucedemo.com/"
    И в строку UserName ввели значение "standard_user"
    * в строку Password ввели значение "secret_sauce"
    * нажата кнопка "Login"
    И выполнено нажатие на ссылку товара"<productName>"
    Тогда цена товара равна "<productPrice>"
    Примеры:
      | productName              | productPrice |
      | Sauce Labs Backpack      | $29.99      |
      | Sauce Labs Bolt T-Shirt  | $15.99       |
      | Sauce Labs Fleece Jacket | $49.99       |
      | Sauce Labs Bike Light    | $9.99        |
