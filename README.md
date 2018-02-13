# search-stackoverflow
Web Application for searching posts on StackOverflow site by title text and sort by activity, votes, selection or relevance. 
it can also work as a Rest Api application responding to requests.

Веб приложение для поиска постов на сайте StackOverflow по тектсу в загаловке с сортировкой по активности, голосам, выбору или релевантности.
Tак же может работать как Rest Api приложение отвечая на запросы.

## Требования

* Tomcat 9
* JDK 9

## Установка

Страница search-stackoverflow на GitHub -- http://github.com/ArturElzhanov/search-stackoverflow

* Скачать search-stackoverflow-1.0-SNAPSHOT.war
* Установить в папку webapps вашего контейнера сервлетов

## Запуск

* Запустить startup.bat котнейнера сервлетов
* Программа будет доступна по адресу **server root adress**/search-stackoverflow-1.0-SNAPSHOT/search
* Тестировать Rest Api приложение можно по адресу **server root adress**/search-stackoverflow-1.0-SNAPSHOT/swagger-ui.html

## Использование

* Поиск постов осуществляется пользователем после выбора типа сортировки, ввода строки (на английском языке) и нажатии кнопки Search
* Результаты в табличичном виде с отображением автора поста, заголовком и датой создания. 
* В результатах выделены посты на которые был дан ответ с количестовм ответов.
* По щелчку на заголок осуществляется переход на оригинальный пост на сайт https://stackoverflow.com
