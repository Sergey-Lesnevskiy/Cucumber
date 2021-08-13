#language:ru
#encoding:UTF-8
@shopping
  Функционал: Проверка корзины
    Сценарий: Возможность добавления товара в корзину
      Допустим открыта страница "https://www.saucedemo.com/"
      И в строку UserName ввели значение "standard_user"
      * в строку Password ввели значение "secret_sauce"
      * нажата кнопка "Login"
      И выполнено нажатие на кнопку "Add to cart"
      И кликаем на иконку корзины
      Тогда переходим на страницу "https://www.saucedemo.com/cart.html"
      И проверяем наличие товара в корзине "Sauce Labs Backpack"