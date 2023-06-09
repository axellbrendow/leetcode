"""
This calculator only works with numbers of one digit, this is just a simplification.
The calculator input is assumed to be valid.

precedence from highest to lowest:

digits
parentheses
unary
multiply
add
"""


def calc_digits(index, string):
    if string[index] >= '0' and string[index] <= '9':
        return int(string[index]), index + 1
    else:
        return None, index


def calc_parentheses(index, string):
    value, index = calc_digits(index, string)
    if value:
        return value, index

    assert string[index] == '('
    value, index = calc_expression(index + 1, string)
    assert string[index] == ')'
    return value, index + 1


def calc_unary(index, string):
    if string[index] == '-':
        value, index = calc_unary(index + 1, string)
        return -value, index

    if string[index] == '+':
        value, index = calc_unary(index + 1, string)
        return value, index

    return calc_parentheses(index, string)


def calc_multiply(index, string):
    value, index = calc_unary(index, string)

    if index >= len(string) or string[index] != '*':
        return value, index

    second_value, index = calc_unary(index + 1, string)
    return value * second_value, index


def calc_add(index, string):
    value, index = calc_multiply(index, string)

    if index >= len(string) or string[index] != '+':
        return value, index

    second_value, index = calc_multiply(index + 1, string)
    return value + second_value, index


def calc_expression(index, string):
    return calc_add(index, string)


def calc(string: str):
    return calc_expression(0, string.replace(' ', ''))[0]


assert calc("1 * 2 + 3") == 5
assert calc("1 + 2 * 3") == 7
assert calc("(1 + 2) * 3") == 9
assert calc("-(1 + 2) * 3") == -9
