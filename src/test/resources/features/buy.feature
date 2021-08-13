#language:ru
#encoding:UTF-8
  @buy
  Функционал:Проверка покупки возможности покупки товара
Сценарий: Добaвление товара в корзину и оформление покупки
  Допустим открыта страница "https://www.saucedemo.com/"
  И в строку UserName ввели значение "standard_user"
  * в строку Password ввели значение "secret_sauce"
  * нажата кнопка "Login"
  И выполнено нажатие на кнопку "Add to cart"
  И кликаем на иконку корзины
 * кликаем на кнопку Checkout "Checkout"
  * вводим в поля данные "we"
  * кликаем на кнопку Continue "Continue"
  * кликаем на кнопку Finish "Finish"
  * переходим на страницу THANK YOU FOR YOUR ORDER "https://www.saucedemo.com/checkout-complete.html"