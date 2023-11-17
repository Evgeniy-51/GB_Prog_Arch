from decimal import Decimal
from datetime import datetime


class Ticket:
    __id: int
    __departure_zone: int
    __arrival_zone: int
    __route_number: int
    __departure_time: datetime
    __arrival_time: datetime
    __buyer_id: int
    __is_used: bool
    __price: Decimal
    __place: str

    def __init__(self, id_: int, departure_zone: int, arrival_zone: int, route_number: int, departure_time: datetime,
                 arrival_time: datetime, buyer_id: int, is_used: bool, price: int | float, place: str):
        self.__id = id_
        self.__departure_zone = departure_zone
        self.__arrival_zone = arrival_zone
        self.__route_number = route_number
        self.__departure_time = departure_time
        self.__arrival_time = arrival_time
        self.__buyer_id = buyer_id
        self.__is_used = is_used
        self.__price = Decimal(price)
        self.__place = place

    @property
    def id_(self):
        return self.__id

    @property
    def departure_zone(self):
        return self.__departure_zone

    @departure_zone.setter
    def departure_zone(self, value):
        if isinstance(value, int):
            self.__departure_zone = value
        else:
            raise ValueError()

    @property
    def arrival_zone(self):
        return self.__arrival_zone

    @arrival_zone.setter
    def arrival_zone(self, value):
        if isinstance(value, int):
            self.__arrival_zone = value
        else:
            raise ValueError()

    @property
    def route_number(self):
        return self.__arrival_zone

    @route_number.setter
    def route_number(self, value):
        if isinstance(value, int):
            self.__route_number = value
        else:
            raise ValueError()

    @property
    def departure_time(self):
        return self.__departure_time

    @departure_time.setter
    def departure_time(self, value):
        if isinstance(value, datetime):
            self.__departure_time = value
        else:
            raise ValueError()

    @property
    def arrival_time(self):
        return self.__arrival_time

    @arrival_time.setter
    def arrival_time(self, value):
        if isinstance(value, datetime):
            self.__arrival_time = value
        else:
            raise ValueError()

    @property
    def buyer_id(self):
        return self.__arrival_zone

    @buyer_id.setter
    def buyer_id(self, value):
        if isinstance(value, int):
            self.__buyer_id = value
        else:
            raise ValueError()

    @property
    def is_used(self):
        return self.__is_used

    @is_used.setter
    def is_used(self, value):
        if isinstance(value, bool):
            self.__is_used = value
        else:
            raise ValueError()

    @property
    def price(self):
        return self.__price

    @price.setter
    def price(self, value):
        if isinstance(value, int | float):
            self.__price = Decimal(value)
        else:
            raise ValueError()

    @property
    def place(self):
        return self.__place

    @place.setter
    def place(self, value):
        if isinstance(value, str):
            self.__place = value
        else:
            raise ValueError()
