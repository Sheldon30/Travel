# План автоматизации при покупке по карте.
## Ввод валидных данных.
1. Нажимаем курсором на иконку "Купить".
2. В открывшемся окне в поле "Номер карты" вводим валидный номер карты, состоящий из 16 цифр (4444 4444 4444 4441).
3. Нажимаем курсором на поле "месяц" и вводим валидное целое число, соответствующее месяцу, указанному на карте (08).
4. Нажимаем курсором на поле "год" и вводим валидное целое число, соответствующее последним двум цифрам года, указанному на карте (24).
5. Нажимаем курсором на поле "Владелец" и вводим валидные имя и фамилию на русском языке (Перов Иван).
6. Переходим на поле уникального кода карты (CVC/CVV) и вводим число, указанное на карте, состоящее из трех цифр (255).
7. Нажимаем на кнопку "Продолжить".
   _Ожидаемый результат:_ Выходит иконка с надписью **"Операция одобрена Банком."**
   
 ## Ввод невалидных данных.
 _**Ввод неполного номера карты**_
1. Нажимаем курсором на иконку "Купить".
2. В открывшемся окне в поле "Номер карты" вводим валидный номер карты, состоящий из 15 цифр (4444 4444 4444 444).
3. Нажимаем курсором на поле "месяц" и вводим валидное целое число, соответствующее месяцу, указанному на карте (08).
4. Нажимаем курсором на поле "год" и вводим валидное целое число, соответствующее последним двум цифрам года, указанному на карте (24).
5. Нажимаем курсором на поле "Владелец" и вводим валидные имя и фамилию на русском языке (Перов Иван).
6. Переходим на поле уникального кода карты (CVC/CVV) и вводим число, указанное на карте, состоящее из трех цифр (255).
7. Нажимаем на кнопку "Продолжить".
  _Ожидаемый результат:_ Поле номера карты подчеркивается красным и появляется сообщение "Неверный формат".

 _**Попытка ввода номера карты, состоящего из более 16 цифр**_
1. Нажимаем курсором на иконку "Купить".
2. В открывшемся окне в поле "Номер карты" вводим валидный номер карты, состоящий из 17 цифр (4444 4444 4444 44414).
  _Ожидаемый результат:_ Поле номера карты подчеркивается красным и появляется сообщение "Неверный формат".
 _Фактический результат:_ После ввода 16 цифр, при попытке ввести семнадцатую поле дальше не заполняется.

 _**Попытка ввода букв в поле номера карты**_
1. Нажимаем курсором на иконку "Купить".
2. В открывшемся окне в поле "Номер карты" вводим буквенные символы.
 _Ожидаемый результат:_ Поле номера карты подчеркивается красным и появляется сообщение "Неверный формат".
 _Фактический результат:_ При попытке ввода букв в поле номера карты поле не заполняется.

 _**Оставить поле номера карты пустым**_
1. Нажимаем курсором на иконку "Купить".
2. В открывшемся окне  поле "Номер карты" пропускаем и переходим сразу на следующее поле.
3. В поле "месяц" вводим валидное целое число, соответствующее месяцу, указанному на карте (08).
4. Нажимаем курсором на поле "год" и вводим валидное целое число, соответствующее последним двум цифрам года, указанному на карте (24).
5. Нажимаем курсором на поле "Владелец" и вводим валидные имя и фамилию на русском языке (Перов Иван).
6. Переходим на поле уникального кода карты (CVC/CVV) и вводим число, указанное на карте, состоящее из трех цифр (255).
7. Нажимаем на кнопку "Продолжить".
 _Ожидаемый результат:_ Поле номера карты подчеркивается красным и появляется сообщение "Неверный формат".
 _Фактический результат:_ Поле номера карты подчеркивается красным и появляется сообщение "Неверный формат" и кнопка "Продолжить" не нажимается, пока не ввести номер карты.

_**Ввод невалидного значения месяца**_
1. Нажимаем курсором на иконку "Купить".
2. В открывшемся окне в поле "Номер карты" вводим валидный номер карты, состоящий из 16 цифр (4444 4444 4444 4441).
3. Нажимаем курсором на поле "месяц" и вводим невалидное значение(8).
 _Ожидаемый результат:_Поле номера карты подчеркивается красным и появляется сообщение "Неверный формат".

_**Оставить поле месяца пустым**_
1. Нажимаем курсором на иконку "Купить".
2. В открывшемся окне в поле "Номер карты" вводим валидный номер карты, состоящий из 16 цифр (4444 4444 4444 4441).
3. Поле месяца оставляем пустым.
4. Нажимаем курсором на поле "год" и вводим валидное целое число, соответствующее последним двум цифрам года, указанному на карте (24).
5. Нажимаем курсором на поле "Владелец" и вводим валидные имя и фамилию на русском языке (Перов Иван).
6. Переходим на поле уникального кода карты (CVC/CVV) и вводим число, указанное на карте, состоящее из трех цифр (255).
7. Нажимаем на кнопку "Продолжить".
 _Ожидаемый результат:_ Поле месяца подчеркивается красным и появляется сообщение "Неверный формат".
 _Фактический результат:_ Поле месяца подчеркивается красным и появляется сообщение "Неверный формат" и кнопка "Продолжить" не нажимается, пока не ввести номер месяца.

_**Ввод несуществующего номера месяца**_
1. Нажимаем курсором на иконку "Купить".
2. В открывшемся окне в поле "Номер карты" вводим валидный номер карты, состоящий из 16 цифр (4444 4444 4444 4441).
3. В поле месяца вводим нессответствующий(несуществующий) номер (13).
4. Нажимаем курсором на поле "год" и вводим валидное целое число, соответствующее последним двум цифрам года, указанному на карте (24).
5. Нажимаем курсором на поле "Владелец" и вводим валидные имя и фамилию на русском языке (Перов Иван).
6. Переходим на поле уникального кода карты (CVC/CVV) и вводим число, указанное на карте, состоящее из трех цифр (255).
7. Нажимаем на кнопку "Продолжить".
 _Ожидаемый результат:_ Поле месяца подчеркивается красным и появляется сообщение "Неверно указан срок действия карты".
 _Фактический результат:_ Поле месяца подчеркивается красным и появляется сообщение "Неверно указан срок действия карты" и кнопка "Продолжить" не реагирует, пока не ввести верный номер месяца.

_**Ввод предыдущего года**_
1. Нажимаем курсором на иконку "Купить".
2. В открывшемся окне в поле "Номер карты" вводим валидный номер карты, состоящий из 16 цифр (4444 4444 4444 4441).
3. В поле "месяц" вводим валидное целое число, соответствующее месяцу, указанному на карте (08).
4. Нажимаем курсором на поле "год" и вводим предыдущий год(22).
5. Нажимаем курсором на поле "Владелец" и вводим валидные имя и фамилию на русском языке (Перов Иван).
6. Переходим на поле уникального кода карты (CVC/CVV) и вводим число, указанное на карте, состоящее из трех цифр (255).
7. Нажимаем на кнопку "Продолжить".
 _Ожидаемый результат:_ Поле года подчеркивается красным и появляется сообщение "Истёк срок действия карты".
 _Фактический результат:_ Поле года подчеркивается красным и появляется сообщение "Истёк срок действия карты" и кнопка "Продолжить" не реагирует, пока не ввести верный год.

_**Оставить поле года пустым**_
1. Нажимаем курсором на иконку "Купить".
2. В открывшемся окне в поле "Номер карты" вводим валидный номер карты, состоящий из 16 цифр (4444 4444 4444 4441).
3. В поле "месяц" вводим валидное целое число, соответствующее месяцу, указанному на карте (08).
4. Поле года оставляем пустым.
5. Нажимаем курсором на поле "Владелец" и вводим валидные имя и фамилию на русском языке (Перов Иван).
6. Переходим на поле уникального кода карты (CVC/CVV) и вводим число, указанное на карте, состоящее из трех цифр (255).
7. Нажимаем на кнопку "Продолжить".
 _Ожидаемый результат:_ Поле года подчеркивается красным и появляется сообщение "Неверный формат".
 _Фактический результат:_ Поле года подчеркивается красным и появляется сообщение "Неверный формат" и кнопка "Продолжить" не реагирует, пока не ввести верный год.

_**В поле владельца ввести только имя**_
1. Нажимаем курсором на иконку "Купить".
2. В открывшемся окне в поле "Номер карты" вводим валидный номер карты, состоящий из 16 цифр (4444 4444 4444 4441).
3. Нажимаем курсором на поле "месяц" и вводим валидное целое число, соответствующее месяцу, указанному на карте (08).
4. Нажимаем курсором на поле "год" и вводим валидное целое число, соответствующее последним двум цифрам года, указанному на карте (24).
5. Нажимаем курсором на поле "Владелец" и вводим имя  на русском языке (Иван).
6. Переходим на поле уникального кода карты (CVC/CVV) и вводим число, указанное на карте, состоящее из трех цифр (255).
7. Нажимаем на кнопку "Продолжить".
_Фактический результат:_ Заявка в банк отправляется.

_**В поле владельца ввести имя английскими буквами**_
1. Нажимаем курсором на иконку "Купить".
2. В открывшемся окне в поле "Номер карты" вводим валидный номер карты, состоящий из 16 цифр (4444 4444 4444 4441).
3. Нажимаем курсором на поле "месяц" и вводим валидное целое число, соответствующее месяцу, указанному на карте (08).
4. Нажимаем курсором на поле "год" и вводим валидное целое число, соответствующее последним двум цифрам года, указанному на карте (24).
5. Нажимаем курсором на поле "Владелец" и вводим имя и фамилию английскими буквами (PEROV IVAN).
6. Переходим на поле уникального кода карты (CVC/CVV) и вводим число, указанное на карте, состоящее из трех цифр (255).
7. Нажимаем на кнопку "Продолжить".
_Фактический результат:_ Заявка в банк отправляется.

_**В поле владельца ввести одну букву**_
1. Нажимаем курсором на иконку "Купить".
2. В открывшемся окне в поле "Номер карты" вводим валидный номер карты, состоящий из 16 цифр (4444 4444 4444 4441).
3. Нажимаем курсором на поле "месяц" и вводим валидное целое число, соответствующее месяцу, указанному на карте (08).
4. Нажимаем курсором на поле "год" и вводим валидное целое число, соответствующее последним двум цифрам года, указанному на карте (24).
5. Нажимаем курсором на поле "Владелец" и вводим только одну букву кириоллицей (P).
6. Переходим на поле уникального кода карты (CVC/CVV) и вводим число, указанное на карте, состоящее из трех цифр (255).
7. Нажимаем на кнопку "Продолжить".
_Фактический результат:_ Заявка в банк отправляется.

_**Оставить поле владельца пустым**_
1. Нажимаем курсором на иконку "Купить".
2. В открывшемся окне в поле "Номер карты" вводим валидный номер карты, состоящий из 16 цифр (4444 4444 4444 4441).
3. Нажимаем курсором на поле "месяц" и вводим валидное целое число, соответствующее месяцу, указанному на карте (08).
4. Нажимаем курсором на поле "год" и вводим валидное целое число, соответствующее последним двум цифрам года, указанному на карте (24).
5. Поле владельца оставляем пустым.
6. Переходим на поле уникального кода карты (CVC/CVV) и вводим число, указанное на карте, состоящее из трех цифр (255).
7. Нажимаем на кнопку "Продолжить".
 _Ожидаемый результат:_ Поле владельца подчеркивается красным и появляется сообщение "Неверный формат".
_Фактический результат:_  Поле владельца подчеркивается красным и появляется сообщение "Поле обязательно для заполнения".

_**В поле владельца ввести фамилии через дефис**_
1. Нажимаем курсором на иконку "Купить".
2. В открывшемся окне в поле "Номер карты" вводим валидный номер карты, состоящий из 16 цифр (4444 4444 4444 4441).
3. Нажимаем курсором на поле "месяц" и вводим валидное целое число, соответствующее месяцу, указанному на карте (08).
4. Нажимаем курсором на поле "год" и вводим валидное целое число, соответствующее последним двум цифрам года, указанному на карте (24).
5. Нажимаем курсором на поле "Владелец" и вводим имя и фамилии через дефис на русском языке (Иван Перов-Иванов).
6. Переходим на поле уникального кода карты (CVC/CVV) и вводим число, указанное на карте, состоящее из трех цифр (255).
7. Нажимаем на кнопку "Продолжить".
_Фактический результат:_ Заявка в банк отправляется.

_**В поле CVC/CVV ввести две цифры из трех**_
1. Нажимаем курсором на иконку "Купить".
2. В открывшемся окне в поле "Номер карты" вводим валидный номер карты, состоящий из 16 цифр (4444 4444 4444 4441).
3. Нажимаем курсором на поле "месяц" и вводим валидное целое число, соответствующее месяцу, указанному на карте (08).
4. Нажимаем курсором на поле "год" и вводим валидное целое число, соответствующее последним двум цифрам года, указанному на карте (24).
5. Нажимаем курсором на поле "Владелец" и вводим валидные имя и фамилию на русском языке (Перов Иван).
6. Переходим на поле уникального кода карты (CVC/CVV) и вводим две цифры (25).
7. Нажимаем на кнопку "Продолжить".
 _Ожидаемый результат:_ Поле CVC/CVV подчеркивается красным и появляется сообщение "Неверный формат".
_Фактический результат:_ Поле CVC/CVV подчеркивается красным и появляется сообщение "Неверный формат".

_**Поле CVC/CVV оставить пустым**_
1. Нажимаем курсором на иконку "Купить".
2. В открывшемся окне в поле "Номер карты" вводим валидный номер карты, состоящий из 16 цифр (4444 4444 4444 4441).
3. Нажимаем курсором на поле "месяц" и вводим валидное целое число, соответствующее месяцу, указанному на карте (08).
4. Нажимаем курсором на поле "год" и вводим валидное целое число, соответствующее последним двум цифрам года, указанному на карте (24).
5. Нажимаем курсором на поле "Владелец" и вводим валидные имя и фамилию на русском языке (Перов Иван).
6. Поле уникального кода карты (CVC/CVV) оставляем пустым.
7. Нажимаем на кнопку "Продолжить".
 _Ожидаемый результат:_ Поле CVC/CVV подчеркивается красным и появляется сообщение "Поле обязательно для заполнения".
_Фактический результат:_ Поле CVC/CVV подчеркивается красным и появляется сообщение "Неверный формат" и правильно заполненное поле владельца так же подчеркивается красным и появляется ошибка "Поле обязательно для заполнения".


# _Перечень используемых инструментов с обоснованием выбора._

1. **Selenide**
   - поддерживает множество различных фреймворков тестирования,
   - поддерживает разные языки программирования;
   - поддерживает практически все браузеры;

2. **_Lombock_**
   - упрощает написание кода;
   - меньше времени тратится наанписание геттеров, сеттеров, конструкторов, методов equals или реализация шаблона конструктора.
  
3. **_Allure_**
   - удобные отчёты, которые классифицируют дефекты, относящиеся к продукту и автотестам;
   - интегрируется с Selenide.
  
4. **_JUnit 5_**
   - удобная настройка тестов;
   - JUnit позволяет параллельно запускать несколько тестов или объединять разные тестовые программы в набор;
   - совместимость с java-инструментами, работает с Maven и Gradle.

5. **_Docker_**
   - необходим для создания контейнера с необходимым окружением и запуска приложения.
  
   # _Перечень и описание возможных рисков при автоматизации._

1.  изменение требований со стороны заказчика в ходе реализации;
2.  при смене структуры сайта могут упасть автотесты;
3.  падение сайта;
4.  если неверно выбрать инструмент для тестирования, можно попасть в зависимость от технологий и специалистов;
5.  требуется больше времени, если специалист неопытен.

# _Интервальная оценка с учётом рисков в часах._

  - Оформление тест-кейсов ~ 2.5 ч.
  - Время на разработку одного автотеста ~ 2 ч. (~ 17 автотеств) 
  - 25% на риски ~ 4 ч.
____________________
Итого ~ 40.5 ч

