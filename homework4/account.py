from decimal import Decimal


class Account:
    __user_account_id: int
    __balance: Decimal

    def __init__(self, u_id: int, balance: int | float):
        self.__user_account_id = u_id
        self.__balance = Decimal(balance)

    @property
    def user_account_id(self):
        return self.__user_account_id

    @property
    def balance(self):
        return self.__balance

    @balance.setter
    def balance(self, value):
        if isinstance(value, int | float):
            self.__balance = Decimal(value)
        else:
            raise ValueError()
