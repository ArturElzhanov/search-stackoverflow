# search-stackoverflow
Web Application for searching posts on StackOverflow site by title text and sort by activity, votes, selection or relevance. 
it can also work as a Rest Api application responding to requests.

Веб приложение для поиска постов на сайте StackOverflow по тексту в заголовке с сортировкой по активности, голосам, выбору или релевантности.
Tакже может работать как Rest Api приложение отвечая на запросы от других клиентов.

## Требования

* Tomcat 9
* JDK 9

## Установка

Страница search-stackoverflow на GitHub -- http://github.com/ArturElzhanov/search-stackoverflow

* Скачать search-stackoverflow-1.0-SNAPSHOT.war
* Установить в папку webapps вашего контейнера сервлетов

## Запуск

* Запустить startup.bat контейнера сервлетов
* Приложение будет доступно по адресу **server root adress**/search-stackoverflow-1.0-SNAPSHOT/search
* Rest Api приложение будет доступно по адресу **server root adress**/search-stackoverflow-1.0-SNAPSHOT/api/search
* Тестировать Rest Api приложение можно по адресу **server root adress**/search-stackoverflow-1.0-SNAPSHOT/swagger-ui.html

## Использование

* Поиск постов осуществляется пользователем после выбора типа сортировки, ввода строки (на английском языке) и нажатии кнопки Search
* Результаты в табличном виде с отображением автора поста, заголовком и датой создания. 
* В результатах выделены посты на которые был дан ответ с количестовм ответов.
* По щелчку на заголовок осуществляется переход на оригинальный пост на сайт https://stackoverflow.com
