<h1>Однопоточный клиент-сервер</h1>

---
***Server.java:***

- Создание серверного сокета: В вашем языке программирования создайте объект серверного сокета. Определите порт, который будет прослушивать сервер.
- Ожидание подключения клиента: Используя метод accept() серверного сокета, ожидайте подключения клиента. Когда клиент подключается, создается новый сокет для обмена данными с клиентом.
- Создание потоков ввода-вывода: Создайте потоки для чтения данных от клиента и записи данных обратно клиенту через сокет.
- Обработка данных: В бесконечном цикле читайте данные от клиента, отправляйте обратно те же данные и продолжайте этот процесс до тех пор, пока клиент не разорвет соединение.
- Закрытие соединения: После завершения обмена данными закройте потоки ввода-вывода и сокеты.
---
***Client.java:***
- Создание клиентского сокета: Создайте клиентский сокет, указав адрес и порт сервера, к которому хотите подключиться.
- Создание потоков ввода-вывода: Создайте потоки для чтения данных с консоли и для чтения/записи данных через сокет.
- Чтение ввода пользователя и отправка на сервер: В бесконечном цикле читайте данные, введенные пользователем с консоли, и отправляйте их на сервер через клиентский сокет.
- Получение ответа от сервера и вывод на экран: Читайте ответ от сервера через клиентский сокет и выводите его на экран.
- Закрытие соединения: После завершения обмена данными закройте потоки ввода-вывода и клиентский сокет.
---
