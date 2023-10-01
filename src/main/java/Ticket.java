import java.time.LocalDateTime;

// Абстрактный класс и наследование представляет информацию о Билете.
abstract class Ticket implements TicketActions {
    /**
    * @pre номер/ID маршрута
    * @pre время отправления
    * @pre время прибытия
    * @pre количество билетных/сидячих мест (или количество кресел)
    * @pre цена билета
    *
    */
    String routeId;
    LocalDateTime departureTime;
    LocalDateTime arrivedTime;
    int seatQty;
    double price;
}
