from ticket import Ticket


class User:
    __id: int
    __name: str
    __tickets: list[Ticket]
    __login: str
    __password_hash_code: int
    __account_id: int

    def __init__(self, id_: int, name: str, tickets: list, login: str, password_hash_code: int, account_id: int):
        self.__id = id_
        self.___name = name
        self.__tickets = tickets
        self.__login = login
        self.__password_hash_code = password_hash_code
        self.__account_id = account_id

    @property
    def id_(self):
        return self.__id

    @property
    def name(self):
        return self.__name

    @name.setter
    def name(self, value):
        if isinstance(value, str):
            self.__name = value
        else:
            raise ValueError()

    @property
    def tickets(self):
        return self.__tickets

    @tickets.setter
    def tickets(self, value):
        if isinstance(value, list):
            self.__tickets = value
        else:
            raise ValueError()

    @property
    def login(self):
        return self.__login

    @login.setter
    def login(self, value):
        if isinstance(value, str):
            self.__login = value
        else:
            raise ValueError()

    @property
    def password_hash_code(self):
        return self.__password_hash_code

    @password_hash_code.setter
    def password_hash_code(self, value):
        if isinstance(value, int):
            self.__password_hash_code = value
        else:
            raise ValueError()

    @property
    def account_id(self):
        return self.__account_id

    @account_id.setter
    def account_id(self, value):
        if isinstance(value, str):
            self.__account_id = value
        else:
            raise ValueError()
