class BusTicket extends Ticket {
    int number;

    /**
     * Класс представляет билет на выбранный автобус,
     * наследует Абстрактный класс Ticket,
     * который имплементирует Интерфейс TicketActions.
     *
     * @param принять на вход количество билетов number.
     *
     * Переопределяет действия методов имплементированных из Интерфейса  TicketActions:
     *
     *
     *
     * Зарезервировать:
     * @return true, если кол-во билетов >= запрошенному, иначе false.
     * @pre Количество билетов в продаже должно быть больше или равно запрошенным пользователем.
     * @post Количество билетов должно уменьшиться во время резевации билета, чтобы никто не смог
     *      * в это же время забронировать/купить.
     *
     */
    @Override
    public boolean reserveTicket() {
        // Реализация метода
        return false;
    }


    /**
     * Списать средства (стоимость билетов)
     * @return true, если кол-во денег на карточке >= сумме к оплате по билетам, иначе false.
     * @pre Сумма денег на карте должно быть больше или равно стоимости билетов.
     * @post Деньги на карте должны зарезервироваться для оплаты и вычесть
     *
     */
    @Override
    public boolean deductFunds() {
        // Реализация метода
        return false;
    }

    /**
     * Подтверждение покупки билета
     * @return true, если покупка произведена успешно, иначе false.
     * @pre Проверка метовод Зарезервировать и Списать средства должны возвращать TRUE.
     * @pre количество бронированных билетов должно быть меньше или равно количеству мест в автобусе
     * @post Создание электронного билета покупателю со всеми данными
     * @post Отправить на почту электронные билеты
     * @post Предоставить возможность отменить сделанный и оплаченный заказ
     *
     */
    @Override
    public boolean confirmPurchase() {
        // Реализация метода
        return false;
    }

    /**
     * Обновление наличия сводобных билетов к продаже
     * @pre Если Подтверждение покупки билеты с результатом TRUE
     * @pre разница между количеством мест в автобусе и количеством билетов больше или равно 0
     * @post Обновить количество активных билетов к продаже
     *
     */
    @Override
    public void updateTicketAvailability() {
        // Реализация метода
    }

    /**
     * Отменить резервацию билетов
     * @return true, если пользователь нажал отмена резервации, иначе false.
     * @pre количество билетов меньше запрошенного
     * @pre количество билетов больше или равно запрошенного, но списние денег не прошли по каким-либо причинам
     * @pre была успешно произведена покупка билета, но пользователь нажал на Отмена покупки
     * @post отменить резерв билетов
     * @post оформить возврат денежных средств
     * @post составить инф.сообщение об отмене покупки и анулировании заказа
     *
     */
    @Override
    public boolean cancelReservation() {
        // Реализация метода
        return false;
    }
}