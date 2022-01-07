import random


def is_number_in_list(numbers, number):
    print(numbers)
    for i in range(0, len(numbers)):
        if numbers[i] == number:
            return True
    return False


def find_number_index(numbers, number):
    print(numbers)
    for i in range(0, len(numbers)):
        if numbers[i] == number:
            return i
    return -1


if __name__ == "__main__":
    random_numbers = list(range(5))
    random.shuffle(random_numbers)
    predefined_numbers = [5, 4, 3, 2, 1]
    print(is_number_in_list(random_numbers, 5))
    print(find_number_index(predefined_numbers, 5))

